'use strict';

/* Controllers */
JArentalsApplication.controller('LoginController',function($scope,UserService,$FB){
	
	var user = new UserService;
	
	updateLoginStatus(updateApiMe);
	
	$scope.getFaceBookUserData = function(){
		 $FB.api('/me', function (res) {
  	      return res;
  	    });
	}
	
	$scope.registerFacebookUser = function(){
	    $FB.login(function (res) {
	      if (res.authResponse) {
	        updateLoginStatus(updateApiMe);
	        user.fbId =  $scope.facebookUser.id;
	        user.email =  $scope.facebookUser.email;
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