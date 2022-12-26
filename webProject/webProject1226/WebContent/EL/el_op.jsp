<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_op</title>
</head>
<body>
	<h1>산술연산자</h1>
	
	10+20 = ${10+20} <br />
	10-20 = ${10-20} <br />
	10*20 = ${10*20} <br />
	10/20 = ${10/20} <br />
	10/20 = ${10 div 20} <br />
	10/20 = ${10%20} <br />
	10/20 = ${10 mod 20} <br />
	
	<h1>논리연산자</h1>
	<%-- 로그인시 세션을 통한 인증 및 권한 부여시 사용 --%>
	
	${true && false} <br />
	${true and false} <br />
	${true || false} <br />
	${true or false} <br />
	${not true} <br />
	${!true} <br />
	
	<h1>비교연산자</h1>
	<h3>Thymeleaf와 유사</h3>
	
	${10 == 11} <br />
	${10 eq 11} <br />
	${10 != 11} <br />
	${10 ne 11} <br />
	${10 < 11} <br />
	${10 lt 11}, <span>lt : little</span> <br />
	${10 > 11} <br />
	${10 gt 11}, <span>gt : greater</span>  <br />
	${10 <= 11} <br />
	${10 le 11}, <span>le : little or equal</span>  <br />
	${10 >= 11} <br />
	${10 ge 11}, <span>ge : greater or equal</span>  <br />
	
	

</body>
</html>