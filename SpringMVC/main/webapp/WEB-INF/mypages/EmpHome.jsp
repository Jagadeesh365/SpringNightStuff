<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Spring Boot MVC!</h1>
<%=new java.util.Date() %>
<%response.addHeader("Refresh", "5;https://www.google.co.in/"); %>
<h1>Please wait 5 sec,do not press back button or refresh! </h1>
</body>
</html>