<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h1>로그인</h1>
	<form action="login.do" method="POST" id="joinForm">

    <label for="userId">아이디</label>
    <input type="text" name="userId" id="userId"> <br>

    <label for="userPw">비밀번호</label>
    <input type="password" name="userPw" id="userPw"> <br>
    
    <input type="reset" value="초기화"> 
    <input type="button" value="이벤트구현" id="btn1">
    <!-- <input type="submit" value="회원가입 실행"> -->
    <input type="submit" class="loginOK" value="로그인 실행">
</body>
</html>