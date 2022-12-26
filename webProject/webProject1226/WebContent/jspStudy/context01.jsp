<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>context01</title>
</head>
<body>
	<h1>초기화 파라미터</h1>
	<%
		String hostId = config.getServletContext().getInitParameter("hostId");
		String hostPw = config.getServletContext().getInitParameter("hostPw");
	%>
	
	hostId : <%=hostId %> <br />
	hostId : <%=hostPw %> <br />
	
</body>
</html>