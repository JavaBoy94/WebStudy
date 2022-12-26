<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- EL 비활성화 => <%@page isELIgnored="true"%> --%>
<%
	request.setAttribute("userId", "m1");
	request.setAttribute("userPw", "1111");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>expression language 01</title>
</head>
<body>
	<h1>EL 기본문법</h1>
	userId(JSP) : <%=request.getAttribute("userId") %> <br />
	userId(EL) : ${userId} <br />
	<br />
	userPw : ${userPw} <br />
	<%-- 표현식 안에 바로 값을 넣어 출력 가능 --%>
	userAge : ${100} <br />
	userName : ${'이름'} <br />
	
</body>
</html>