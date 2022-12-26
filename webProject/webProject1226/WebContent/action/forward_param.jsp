<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward_param.jsp</title>
</head>
<body>
	<%
		String userId = request.getParameter("id");  // root
		String userPw = request.getParameter("pw");  // 1111
	%>
	
	<h1> forward_param 페이지 </h1>
	ID : <%=userId %> <br />
	PW : <%=userPw %> <br />
	
</body>
</html>