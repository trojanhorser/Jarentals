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
		  </ul>
		</div>
	    <div ng-view></div>
  	</div>
  <!-- JAVASCRIPT IS INCLUDED HERE -->
  <jsp:include page="includes/javascript.jsp"/> 
</body>
</html>
