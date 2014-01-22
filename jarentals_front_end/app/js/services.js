'use strict';

/* Services */
JArentalsApplication.factory('UserService',function(FaceBookService){
	return {
		retrieveUserDataFromFaceBook : function(username,password){
		
			return FaceBookService.retrieveUserData(username,password);
		}
	}
}).factory('FaceBookService',function($rootScope,$log){
	return {
		retrieveUserData : function(){
			//return 'undefined';
		}
		,
		watchLoginChange : function() {

			var _self = this;

			FB.Event.subscribe('auth.authResponseChange', function(response) {

				if (response.status === 'connected') {
					
					/* 
					 The user is already logged, 
					 is possible retrieve his personal info
					*/
					$log(_self.getUserInfo());
					
					/*
					 This is also the point where you should create a 
					 session for the current user.
					 For this purpose you can use the data inside the 
					 response.authResponse object.
					*/

				} 
				else {

					/*
					 The user is not logged to the app, or into Facebook:
					 destroy the session on the server.
					*/
					 
				}

			});

		},
		getUserInfo : function() {

			var _self = this;

			FB.api('/me', function(response) {

				$rootScope.$apply(function() { 

					$rootScope.user = _self.user = response; 

				});

			});
		},
		logout : function() {

			var _self = this;

			FB.logout(function(response) {

				$rootScope.$apply(function() { 

					$rootScope.user = _self.user = {}; 

				});	

			});
		}
	}
});

