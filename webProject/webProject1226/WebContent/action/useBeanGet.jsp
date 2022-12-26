<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="myBean" class="org.project.dto.MemberBean"/>

<jsp:setProperty property="no" name="myBean" value="11"/>
<jsp:setProperty property="userId" name="myBean" value="root"/>
<jsp:setProperty property="userPw" name="myBean" value="1234"/>
<jsp:setProperty property="userName" name="myBean" value="ss1"/>
<jsp:setProperty property="userAge" name="myBean" value="10"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getProperty 실습</title>
</head>
<body>
	<h1>getProperty 실습</h1>
	사용자 번호 : <jsp:getProperty property="no" name="myBean"/> <br />
	사용자 ID : <jsp:getProperty property="userId" name="myBean"/> <br />
	사용자 PW : <jsp:getProperty property="userPw" name="myBean"/> <br />
	사용자 이름 : <jsp:getProperty property="userName" name="myBean"/> <br />
	사용자 나이 : <jsp:getProperty property="userAge" name="myBean"/> <br />
</body>
</html>