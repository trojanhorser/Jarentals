'use strict';

/* Services */
JArentalsApplication.factory('UserService',function(FaceBookService){
	return {
		retrieveUserDataFromFaceBook : function(username,password){
		
			return FaceBookService.retrieveUserData(username,password);
		}
	}
});