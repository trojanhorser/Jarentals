'use strict';

/* jasmine specs for controllers go here */

describe('ControllerTest',function(){
   
    beforeEach(module('JArentalsApplication'));
	//beforeEach(module('ezfb'));

   var LoginController,FB,scope;

	beforeEach(inject(function(_$FB_,$rootScope,$controller){
			
			FB = _$FB_;
			
			scope = $rootScope.$new();
			
			LoginController = $controller('LoginController',
				{
					$scope: scope,
					FB : FB											
				}
		    );
			
	}));
	
	describe('LoginController',function(){

		it('should call the FB login function when login is called"', inject(function() {
			spyOn(FB, "login");
			scope.login();
			expect(FB.login).toHaveBeenCalled();
		}));
	});
});


/*
describe('controllers', function(){
  beforeEach(module('myApp.controllers'));


  it('should ....', inject(function() {
    //spec body
  }));

  it('should ....', inject(function() {
    //spec body
  }));
});
*/