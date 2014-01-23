'use strict';

/* Directives */


JArentalsApplication.
  directive('faceBookLoginButton',function(){
	return {
		template: "<fb:login-button show-faces='true' width='200' max-rows='1'></fb:login-button>"
	}
  }).
  directive('appVersion', ['version', function(version) {
    return function(scope, elm, attrs) {
      elm.text(version);
    };
  }]);
