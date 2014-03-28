'use strict';

/* Controllers */
JArentalsApplication.controller('LoginController',function($scope,UserService,$FB,$location){
		
	$scope.render = false;
	$scope.username = null;
	$scope.password = null;
	$scope.email = null;
	
	//updateLoginStatus(updateApiMe);
	
	$scope.getFaceBookUserData = function(){
		 $FB.api('/me', function (res) {
  	      return res;
  	    });
	}
	
	$scope.registerFacebookUser = function(){
	    $FB.login(function (res) {
	      if (res.authResponse) {
	    	updateLoginStatus(updateApiMe);
	      }
	    },function(err){
	    	console.log("Facebook error has occured");
	    }, {scope: 'email,user_likes'});
	}
	
	$scope.registerUser = function(){
		var user = new UserService;	
		user.username = $scope.username;
		user.password = $scope.password;
		user.email = $scope.email;
	    user.$save();		
	}
	
	function updateLoginStatus (more) {
	    $FB.getLoginStatus(function (res) {
	      $scope.loginStatus = res;
	      $scope.render = true;
	      (more || angular.noop)();
	    });
	 }
	
	function updateApiMe (loginFaceBookUser) {
	    $FB.api('/me', function (res) {
	    //if($scope.loginStatus.status == "connected"){
		      $scope.facebookUser = res;
		  	  $scope.username = $scope.facebookUser.first_name;
		      $scope.email = $scope.facebookUser.email;	
			  $scope.password = $scope.facebookUser.id;
			  $scope.registerUser();
	      //}
	    });
	}
});
