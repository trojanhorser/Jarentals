'use strict';

/* Services */
JArentalsApplication.factory('UserService',function($resource,$rootScope,RESOURCE_CONSTANTS){
	return $resource($rootScope.serviceEndPoint + RESOURCE_CONSTANTS.USER_SERVICE_END_POINT + ":id", {id:'@id'});
});