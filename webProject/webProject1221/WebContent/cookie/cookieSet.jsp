<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookieSet.jsp</title>
</head>
<body>
	
	<%
		// 쿠키 생성
		Cookie cookie = new Cookie("admin","1111");  // 쿠키ID, value
		cookie.setMaxAge(60*60);  // 유효시간 : 60초*60 => 1시간
		response.addCookie(cookie);  // 생성된 쿠키정보 전달
	%>
	
	<a href="cookieGet.jsp">cookie get</a>

</body>
</html>