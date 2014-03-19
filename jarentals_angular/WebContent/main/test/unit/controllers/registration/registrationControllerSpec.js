'use strict';

/* jasmine specs for controllers go here */

describe('Registration Controller Test',function(){
   
   beforeEach(module('JArentalsApplication'));
	
   var RegistrationController;

	beforeEach(inject(function($rootScope,$controller){
			
			scope = $rootScope.$new();
			
			RegistrationController = $controller('RegistrationController',
				{
					$scope: scope,										
				}
		    );
			
	}));
	
	describe('LoginController Tests If Necessary Variable and Methods are defined',function(){

		it('should have RegisterUser method defined', inject(function() {
			expect(scope.registerUser).toBeDefine();
		}));
	});
});