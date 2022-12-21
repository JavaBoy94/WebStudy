<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout.jsp</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();  // 모든 쿠키를 불러와 배열에 담음
	
		if (cookies!=null) {
			
			for (int i=0; i<cookies.length; i++) {
				if (cookies[i].getValue().equals("admin")) {
					cookies[i].setMaxAge(0);   // 만료시간 0초 => 쿠키 제거
					response.addCookie(cookies[i]);
				}
			}
			
		}
		
		//response.sendRedirect("login.html");  // 로그아웃 후 다시 로그인 화면으로 이동
		response.sendRedirect("cookieTest.jsp");
	%>
</body>
</html>