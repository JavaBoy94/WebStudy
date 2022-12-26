<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_paramOk</title>
</head>
<body>
	<h1>EL의 paramOk.jsp</h1>
	id : <%=request.getParameter("userId") %> <br />
	pw : <%=request.getParameter("userPw") %> <br />
	<br />
	id : ${param.userId} <br />
	pw : ${param.userPw} <br />
	
	
</body>
</html>