'use strict';

/* jasmine specs for services go here */

describe('service', function() {
  beforeEach(module('JArentalsApplication.services'));
  
	  var UserService;
	  
	  beforeEach(inject(function(_UserService_){
			UserService = _UserService_;
	  }));
	  
	  describe('UserService', function() {
			it('it should have retrieveUserDataFromFaceBook method defined', inject(function() {
			  expect(UserService.retrieveUserDataFromFaceBook).toBeDefined();
			}));
	  });
  
});
