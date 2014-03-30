<!doctype html>
<html lang="en" ng-app="JArentalsApplication">
<head>
  <meta charset="utf-8">
  <title>JARENTALS</title>
  <!-- CSS IS INCLUDED HERE -->
  <jsp:include page="includes/css.jsp"/> 
  <link rel="stylesheet" href="css/app.css"/>
</head>
<body>
	<div ng-controller="MainController">
		<div class="navbar navbar-default" role="navigation" bs-navbar>
		  <div class="navbar-header">
		    <a class="navbar-brand" href="#">Brand</a>
		  </div>
		  <ul class="nav navbar-nav">
		    <li data-match-route="/login"><a href="#/login">Login</a></li>
		    <li data-match-route="/main"><a href="#/main">Main Page</a></li>
		    <li data-match-route="/register"><a href="#/register">Register</a></li>
		    <li data-match-route="/view_your_places" ng-show="isLoggedIn"><a href="#/view_your_places">View Your Places</a></li>
		    <li data-match-route="/edit_your_profile" ng-show="isLoggedIn" ><a href="#/edit_your_proflie">Edit Your Profile</a></li>
		    <li data-match-route="/view_all_users"  ng-show="isLoggedIn"><a href="#/">View Users</a></li>
		    <li data-match-route="/view_all_places" ng-show="isLoggedIn"><a href="#/">View Places</a></li>
		  </ul>
		</div>
	    <div ng-view></div>
  	</div>
  <!-- JAVASCRIPT IS INCLUDED HERE -->
  <jsp:include page="includes/javascript.jsp"/> 
</body>
</html>
