'use strict';
/**
 * Login controller is responsible for retrieving data from the UserService and performing view layer 
 * specific rendering of the data which is retrieved
 * 
 * @author Denis Bell
 * @date March,18 2014
 * 
 * */

JArentalsApplication.controller('LoginController',function($scope,UserService,$FB,$location,$rootScope){
		
	$scope.render = false;
	$scope.username = null;
	$scope.password = null;
	$scope.email = null;
	$scope.user = null;

	updateLoginStatus(updateApiMe);

	  $scope.loginFaceBookUser = function () {
	    $FB.login(function (res) {
	      /**
	       * no manual $scope.$apply, I got that handled
	       */
	      if (res.authResponse) {
	        updateLoginStatus(updateApiMe);
	      }
	    }, {scope: 'email,user_likes'});
	  };

	  $scope.logout = function () {
		  $FB.logout(function () {
	      updateLoginStatus(updateApiMe);
	    });
	  };

	  $scope.share = function () {
		  $FB.ui(
	      {
	        method: 'feed',
	        name: 'angular-easyfb API demo',
	        picture: 'http://plnkr.co/img/plunker.png',
	        link: 'http://plnkr.co/edit/qclqht?p=preview',
	        description: 'angular-easyfb is an AngularJS module wrapping Facebook SDK.' + 
	                     ' Facebook integration in AngularJS made easy!' + 
	                     ' Please try it and feel free to give feedbacks.'
	      },
	      null
	    );
	  };

	  var autoToJSON = ['loginStatus', 'apiMe']; 
	  angular.forEach(autoToJSON, function (varName) {
	    $scope.$watch(varName, function (val) {
	      $scope[varName + 'JSON'] = JSON.stringify(val, null, 2);
	    }, true);
	  });
	  
	  function updateLoginStatus (more) {
		  $FB.getLoginStatus(function (res) {
	      $scope.loginStatus = res;

	      (more || angular.noop)();
	    });
	  }

	  function updateApiMe () {
		  $FB.api('/me', function (res) {
	      $scope.faceBookUser = res;
		  $scope.username = $scope.faceBookUser.first_name;
	      $scope.email = $scope.faceBookUser.email;	
		  $scope.password = $scope.faceBookUser.id;
		  $scope.registerUser();
	    });
	  }
	
	$scope.registerUser = function(){
		var user = new UserService;	
		user.username = $scope.username;
		user.password = $scope.password;
		user.email = $scope.email;
	    user.$save(function(data){
	    	console.log(user);
	    	$rootScope.isLoggedIn = true;
	    },function(error){
	    	console.log("Print error if user was not found");
	    });	
	    
	}
});