/**
 * Place controller is responsible for retrieving data from the PlaceService and performing view layer 
 * specific rendering of the data which is retrieved
 * 
 * @author Denis Bell
 * @date April,5 2014
 * 
 * */

JArentalsApplication.controller('PlaceController',function($scope,PlaceService,PlaceConstants){
	
	$scope.places;
	
	PlaceService.query({start: PlaceConstants.PAGINATION_MIN_DEFAULT, end: PlaceConstants.PAGINATION_MAX_DEFAULT},function(data){
		$scope.places = data;
	});
	
});
