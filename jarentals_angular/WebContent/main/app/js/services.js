'use strict';

/* Services */
JArentalsApplication.factory('UserService',function($resource){
	return $resource('/user/:action/:id', {action:'@action',id:'@id'});
});