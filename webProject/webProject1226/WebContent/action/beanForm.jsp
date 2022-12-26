<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userBean Form</title>
</head>
<body>
	<form action="beanTest1.jsp">
		<!-- Form의 name이 setProperty의 param이 됨 -->
		no : <input type="text" name="no" id="no" /> <br />
		userId : <input type="text" name="userId" id="userId" /> <br />
		userPw : <input type="text" name="userPw" id="userPw" /> <br />
		userName : <input type="text" name="userName" id="userName" /> <br />
		userAge : <input type="text" name="userAge" id="userAge" /> <br />
		<input type="submit" value="회원가입" />
	</form>
</body>
</html>