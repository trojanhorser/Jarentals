'use strict';

/* Controllers */
JArentalsApplication.controller('RegistrationController',function($scope,UserService,$FB){
	
	$scope.facebookUser;
	
	$scope.registerUser = function(){
		
		
	};
	
	$scope.registerFacebookUser = function(){
		  console.log("FB1");
		 $FB.login(function (res) {
		      if (res.authResponse) {
		    	  console.log("FB1");
		    	  $scope.facebookUser = getFaceBookUserData();
		      }
		  });
	};
	
	$scope.getFaceBookUserData = function(){
		 $FB.api('/me', function (res) {
	      console.log("FB2");
   	      return res;
   	    });
	}
});