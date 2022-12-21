<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginOk.jsp</title>
</head>
<body>
	<%
		String id = request.getParameter("id");   // login.html의 id
		String pw = request.getParameter("pw");   // login.html의 pw
		
		// 입력된 id, pw를 쿠키값으로 설정
		if (id.equals("admin") && pw.equals("1234")) {  // 로그인 정보가 true면 쿠키 생성
			Cookie cookie = new Cookie("cookieId",id);  // 쿠키생성
			cookie.setMaxAge(60);   // 만료시간(60초) 설정
			response.addCookie(cookie);   // 쿠키 전송
			
			response.sendRedirect("cookieMain.jsp");  // cookieMain.jsp로 쿠키정보를 바로 전달
			
		} else {
			response.sendRedirect("login.html"); // 로그인 실패시 다시 로그인 페이지 이동
		}
	%>
</body>
</html>