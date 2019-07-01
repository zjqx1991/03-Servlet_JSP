<%@page import="java.util.Date"%>
<%@page import="javax.xml.crypto.Data"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	WEB-INF中的资源
	<%
		String timeString = null;
		timeString = new Date().toLocaleString();
	%>
	北京时间：<%=timeString %>
</body>
</html>