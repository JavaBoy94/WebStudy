<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 쿠키 삭제 => setMaxAge(0)으로 설정
		Cookie[] cookies = request.getCookies();
		
		for (int i=0; i<cookies.length; i++) {
			out.println("name : "+cookies[i].getName()+"<br>");  // 쿠키이름 확인
			cookies[i].setMaxAge(0);  // 쿠키삭제 (유효시간 : 0초")
			response.addCookie(cookies[i]);   // 삭제된 쿠키정보를 전달
		}
	%>
	
	<a href="cookieTest.jsp">쿠키확인</a>
</body>
</html>