'use strict';


// Declare app level module which depends on and services controllers
var JArentalsApplication = angular.module('JArentalsApplication',["ngRoute"]);

JArentalsApplication.config(function($routeProvider) {
  $routeProvider.when('/login', {templateUrl: 'partials/login.html', controller: 'LoginController'});
  $routeProvider.when('/main', {templateUrl: 'partials/main.html', controller: 'LoginController'});
  $routeProvider.otherwise({redirectTo: '/view1'});
});

