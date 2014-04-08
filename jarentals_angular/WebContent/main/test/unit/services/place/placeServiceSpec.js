describe("Tests for PlaceService", function() {
 
	 beforeEach(module('JArentalsApplication'));
  
	 var placeService,scope,httpBackend,placeMockData,placeUri,placeConstants;
	  
	 beforeEach(inject(function($rootScope,$httpBackend,RESOURCE_CONSTANTS,PlaceService,PlaceConstants){
			
			placeService = PlaceService;
			placeConstants= PlaceConstants;
			placeUri = $rootScope.serviceEndPoint + RESOURCE_CONSTANTS.PLACE_SERVICE_END_POINT;
			placeMockData = [{"id":1,"addressId":1,"contactId":1,"userId":35,"placeStatusId":1,"createdWhen":1396219074000,"updatedWhen":null,
							"placeImages":[{"id":1,"placeId":1,"imageUrl":"index.jpeg","createdWhen":1396227014000,"updatedWhen":null}]}];
			
			httpBackend = $httpBackend;
			
			httpBackend.whenGET(placeUri+"?end="+PlaceConstants.PAGINATION_MAX_DEFAULT+
										  "&start="+PlaceConstants.PAGINATION_MIN_DEFAULT).respond(placeMockData);
			
	}));
	  
    it('should return a place json object when query method is called', inject(function() {

    	var personObject;
    	
    	placeService.query({start: placeConstants.PAGINATION_MIN_DEFAULT, end: placeConstants.PAGINATION_MAX_DEFAULT},function(data){
    		personObject = data;
    		expect(personObject.id).toBe(1);
    	});
    	
    }));
		  
	   
});