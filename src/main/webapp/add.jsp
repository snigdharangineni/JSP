<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage = "error.jsp"%>
    <%@ page import = "java.util.ArrayList" %>
    <%@ include file = "header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "cyan">

<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	
	int k = i+j;
	out.println("output is " +k);
	
	pageContext.setAttribute("name", "Snigdha", PageContext.SESSION_SCOPE);
	int exception = 9/0;
	
%>
</body>
</html>