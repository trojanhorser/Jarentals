'use strict';

/* Controllers */
JArentalsApplication.controller('RegistrationController',function($scope,UserService,$FB){
	
	updateLoginStatus(updateApiMe);
	
	$scope.getFaceBookUserData = function(){
		 $FB.api('/me', function (res) {
  	      return res;
  	    });
	}
	
//	$scope.registerUser = function(){
//
//	}
	
	$scope.registerFacebookUser = function(){
	
	    $FB.login(function (res) {
	      if (res.authResponse) {
	        updateLoginStatus(updateApiMe);
	        
	        var user = new UserService;
	        //user.id = null;
	        user.fbId =  $scope.facebookUser.id;
	        user.email =  $scope.facebookUser.email;
	        /*user.username = "";
	        user.password = "";
	        user.email =  $scope.facebookUser.email;
	        user.roleId = 0;
	        user.createdWhen = null;
	        user.updatedWhen = null;
	        user.userStatusId = 0;
	 */       
	        user.$save();
	      }
	    }, {scope: 'email,user_likes'});
	}
	
	function updateLoginStatus (more) {
	    $FB.getLoginStatus(function (res) {
	      $scope.loginStatus = res;

	      (more || angular.noop)();
	    });
	  }
	
	function updateApiMe () {
	    $FB.api('/me', function (res) {
	      $scope.facebookUser = res;
	    });
	  }
});