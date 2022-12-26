<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_paramForm01</title>
</head>
<body>
	<h1>EL의 param01 Form</h1>
	<form action="el_ParamOk.jsp" method="post">
		id : <input type="text" name="userId" /> <br />
		pw : <input type="password" name="userPw" /> <br />
		<input type="submit" value="login" />
	</form>
</body>
</html>