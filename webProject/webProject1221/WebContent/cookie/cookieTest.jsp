<%@page import="java.net.CookieStore"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookieTest.jsp</title>
</head>
<body>
	<%
		// cookieTest : 모든 쿠키값을 조회하는 페이지
		Cookie[] cookies = request.getCookies();
	
		if (cookies!=null) {
			// 유효한 쿠키 목록 출력
			for (int i=0; i<cookies.length; i++) {
				out.println(cookies[i].getName()+"<br>");     // 쿠키이름 출력
				out.println(cookies[i].getValue()+"<br>");    // 쿠키값 출력
			}
		}
	%>
</body>
</html>