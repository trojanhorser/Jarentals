'use strict';

/* jasmine specs for services go here */

describe("Tests for User Service", function() {
 
	 beforeEach(module('JArentalsApplication'));
  
	  var userService,httpBackend,url;
	  
	  beforeEach(inject(function(UserService,$httpBackend,$rootScope,RESOURCE_CONSTANTS){
		    
		    url = $rootScope.serviceEndPoint + RESOURCE_CONSTANTS.USER_SERVICE_END_POINT;
		    userService = UserService;
		    httpBackend = $httpBackend; 
		    
		    var personJson = {"id":1,"fbId":"2312312321","username":
		    				"denis","password":"bell","email":"denis18jam@hotmail.com",
		    				"roleId":201,"createdWhen":"2014-03-08","updatedWhen":"2014-03-08",
		    				 "userStatusId":600};
		    
		    httpBackend.whenGET(url + "/" + personJson.id).respond(personJson); 
		    httpBackend.whenPOST(url,personJson).respond(personJson);
		   
	  }));
	  
	  describe('UserService', function() {
			
		  it('should return a personJson object when get method is called', inject(function() {
			  
			  	userService.get({id:1},function(data){
					console.log(data);
				})
				httpBackend.flush();
		  }));
		  
	  });
  
});