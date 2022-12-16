<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join.ax" method="get">   <!-- action => request -->
	아이디 :<input type="text" name="userId"> <br>  <!-- name속성 => parameter -->
	비밀번호 :<input type="text" name="userPw"> <br>
	이름 :<input type="text" name="userName"> <br>
		<input type="submit" value="회원가입"> <br>
	</form>
</body>
</html>