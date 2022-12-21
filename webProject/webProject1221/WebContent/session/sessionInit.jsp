<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionInit.jsp</title>
</head>
<body>
	<%
		// 세션 생성 (3개)
		session.setAttribute("admin1", "jsp1");
		session.setAttribute("adminNUM", 12345);
		session.setAttribute("adminPW", 11111);
	%>
	
	<a href="sessionGet.jsp">session get</a>
	
</body>
</html>