/**
 * Place controller is responsible for retrieving data from the PlaceService and performing view layer 
 * specific rendering of the data which is retrieved
 * 
 * @author Denis Bell
 * @date April,5 2014
 * 
 * */

JArentalsApplication.controller('PlaceController',function($scope,PlaceService){
	
	$scope.places;
	$scope.pagination.start = 0;
	$scope.pagination.end = 10;
	$scope.pagination.offSet = 10;
	
	PlaceService.query({start: $scope.pagination.start, end: $scope.pagination.end  },function(){
		
	})
});
