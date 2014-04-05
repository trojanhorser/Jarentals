/**
 * UserService  is responsible for receiving data in JSON format from the
 * specified resful end point
 * 
 * @author Denis Bell
 * @date April,5 2014
 * 
 * */

'use strict';

JArentalsApplication.factory('UserService',function($resource,$rootScope,RESOURCE_CONSTANTS){
	return $resource($rootScope.serviceEndPoint + RESOURCE_CONSTANTS.USER_SERVICE_END_POINT + "/:subresource/:id/:value", {subresource:'@subresource',id:'@id',value:'@value'});
});