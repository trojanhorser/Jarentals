'use strict';

/* Controllers */

//angular.module('JArentalsApplication.controllers');
JArentalsApplication.controller('LoginController',function AppController ($scope,FaceBookService){
	
	$scope.logout = function(){
		FaceBookService.logout();
	}
});