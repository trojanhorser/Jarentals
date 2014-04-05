/**
 * Place service is responsible for receiving data in JSON format
 * specified resful end point
 *  
 * @author Denis Bell
 * @date April,5 2014
 * 
 * */

'use strict';

JArentalsApplication.factory('PlaceService',function($resource,$rootScope,RESOURCE_CONSTANTS){
	return $resource($rootScope.serviceEndPoint + RESOURCE_CONSTANTS.PLACE_SERVICE_END_POINT + "/:subresource/:id/:value", {subresource:'@subresource',id:'@id',value:'@value'});
});