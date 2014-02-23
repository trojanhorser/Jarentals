'use strict';

/* Services */
JArentalsApplication.factory('UserService',function($resource){
	return $resource('/user/:action/:id', {action:'@action',id:'@id'},
			
			{ 
				save: {
					       method:'POST', params:{action:"save"}
				},
				
				find: {
				       method:'GET', params:{id:"@id"}
				}
			}
	);
});