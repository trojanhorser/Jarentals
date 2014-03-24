'use strict';

/* Controllers */
JArentalsApplication.controller('MainController',function($scope,UserService,$FB){
	$scope.modal = {
			  "title": "Title",
			  "template": "partials/login.html"
	}
});