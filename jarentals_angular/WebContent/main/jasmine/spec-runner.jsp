<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Jarentals Unit Tests</title>

  <link rel="shortcut icon" type="image/png" href="lib/jasmine-core/jasmine_favicon.png">
  <link rel="stylesheet" type="text/css" href="lib/jasmine-core/jasmine.css">

  <script type="text/javascript" src="lib/jasmine-core/jasmine.js"></script>
  <script type="text/javascript" src="lib/jasmine-core/jasmine-html.js"></script>
  <script type="text/javascript" src="lib/jasmine-core/boot.js"></script>

  <!-- All dependencies -->
  <jsp:include page="spec-dependency.jsp"/>
  
  <!-- include spec files here... -->
  <jsp:include page="spec-main.jsp"/> 
</head>

<body>
</body>
</html>
