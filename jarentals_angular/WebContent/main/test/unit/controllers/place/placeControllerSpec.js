'use strict';

describe('Place Controller',function(){
   
	var placeController,placeService,scope;
	
    beforeEach(module('JArentalsApplication'));
	
	beforeEach(inject(function($rootScope,$controller,PlaceService){
			
			scope = $rootScope.$new();
			placeService = PlaceService;
			
			placeController = $controller('PlaceController',
				{
					$scope: scope,	
					placeService: PlaceService
				}
		    );	
	}));
	
	it('should have necessary scope varibales defined', inject(function() {
		expect(scope.places).toBeDefined();
	}));
});