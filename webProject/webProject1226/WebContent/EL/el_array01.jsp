<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String study[] = {"Java", "JSP", "HTML", "CSS"};
	pageContext.setAttribute("study", study);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_array01</title>
</head>
<body>
	<h1>EL의 Array01 (Java Study 과목) </h1>
	1. ${study[0]} <br />
	2. ${study[1]} <br />
	3. ${study[2]} <br />
	4. ${study[3]} <br />
</body>
</html>