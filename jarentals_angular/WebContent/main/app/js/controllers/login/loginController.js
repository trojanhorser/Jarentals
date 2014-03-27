'use strict';

/* Controllers */
JArentalsApplication.controller('LoginController',function($scope,UserService,$FB,$location){
		
	//Local varibales	
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
	    	//Check if User Exist
	    	UserService.get(
	    			
	    		{subresource:"facebook",value:$scope.facebookUser.id},
		    	
	    		function(user){
	    			//If User exits route them to the main page
		    		console.log("user exists");
		    	},function(err){
		    		console.log("user does not exists");
		    		//If user does not exist save them and route them to the main page
		    		user.username = $scope.facebookUser.first_name;
		    		user.fbId =  $scope.facebookUser.id;
		  	        user.email =  $scope.facebookUser.email;
		  	        user.$save();
		    	}
	    	);
	      }
	    }, {scope: 'email,user_likes'});
	}
	
	$scope.registerRegularUser = function(){
		
		UserService.get(
	    			
	    		{subresource:"email",value:$scope.email},
		    	
	    		function(user){
	    			//If User exit provide error message
		    	},function(err){
		    		console.log("user does not exists");
		    		//If user does not exist save them and route them to the main page
		    		user.username = $scope.username;
		    		user.password =  $scope.password;
		    		user.email =  $scope.email;
		    		console.log($scope.email);
		  	        user.$save();
		    	}
	    	);
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
