'use strict';

describe('Place Controller',function(){
   
	var placeController,placeService,placeConstants,scope,httpBackend,placeMockData,placeUri;
	
    beforeEach(module('JArentalsApplication'));
	
	beforeEach(inject(function($rootScope,$controller,PlaceService,PlaceConstants,$httpBackend,RESOURCE_CONSTANTS){
			
			scope = $rootScope.$new();
			placeService = PlaceService;
			placeConstants = PlaceConstants;
			placeUri = $rootScope.serviceEndPoint + RESOURCE_CONSTANTS.PLACE_SERVICE_END_POINT;
			placeMockData = [{"id":1,"addressId":1,"contactId":1,"userId":35,"placeStatusId":1,"createdWhen":1396219074000,"updatedWhen":null,
							"placeImages":[{"id":1,"placeId":1,"imageUrl":"index.jpeg","createdWhen":1396227014000,"updatedWhen":null}]}];
			
			httpBackend = $httpBackend;
			
			httpBackend.whenGET(placeUri+"?end="+PlaceConstants.PAGINATION_MAX_DEFAULT+
										  "&start="+PlaceConstants.PAGINATION_MIN_DEFAULT).respond(placeMockData);
			
			placeController = $controller('PlaceController',
				{
					$scope: scope,	
					PlaceService: placeService,
					PlaceConstants: placeConstants 
				}
		    );	
	}));
	
	it('should have necessary scope varibales defined', inject(function() {
		httpBackend.flush();
		expect(scope.places).toBeDefined();
		expect(scope.places).toBeDefined();
	}));

	
	it('should have places variable defined with necessary fields', inject(function() {
		spyOn(placeService,"query");
		httpBackend.flush();
		expect(scope.places.placeStatusId).toBe(1);
	}));
});