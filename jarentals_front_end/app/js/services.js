'use strict';

/* Services */
angular.module('JArentalsApplication.services',[])
.factory('UserService',function(){
	return {
		retrieveUserDataFromFaceBook : function(){
			return {
				userid : "Denis",
				password : "denis64bit"
			}
		}
	}
});
