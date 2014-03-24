'use strict';

/* jasmine specs for controllers go here */

describe('Login Controller',function(){
   
	var LoginController,scope,FB;
	
    beforeEach(module('JArentalsApplication'));
	
	beforeEach(inject(function($rootScope,$controller,$FB){
			
			scope = $rootScope.$new();
			
			FB = $FB;
			
			LoginController = $controller('LoginController',
				{
					$scope: scope,	
					$FB: FB
				}
		    );
			
	}));
	
	it('should have registerUser method defined', inject(function() {
		expect(scope.registerUser).toBeDefined();
	}));
	
	it('should have registerFacebookUser method defined', inject(function() {
		expect(scope.registerFacebookUser).toBeDefined();
	}));

	it('should have getFaceBookUserData method defined', inject(function() {
		expect(scope.getFaceBookUserData).toBeDefined();
	}));

	it('should call the FB service login method', inject(function() {
		spyOn(FB,'login');
		scope.registerFacebookUser();
		expect(FB.login).toHaveBeenCalled();
	}));
	
	it('should call the FB service api method', inject(function() {
		spyOn(FB,'api');
		scope.getFaceBookUserData();
		expect(FB.api).toHaveBeenCalled();
	}));
});