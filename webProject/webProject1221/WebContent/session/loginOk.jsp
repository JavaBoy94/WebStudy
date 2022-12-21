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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if (id.equals("admin") && pw.equals("1234")) {
			// 해당 id에 대한 session 생성
			session.setAttribute("sessionId", id);      // id(admin)로 session 설정
			response.sendRedirect("sessionMain.jsp");   // sessionMain.jsp로 이동 
		} else {
			response.sendRedirect("login.html");        // id, pw가 admin, 1234가 아닐시 다시 로그인
		}
	%>

</body>
</html>