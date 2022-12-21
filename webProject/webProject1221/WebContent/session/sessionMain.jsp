<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionMain.jsp</title>
</head>
<body>
	
	<%
		// 모든 세션정보를 불러옴
		Enumeration enumeration = session.getAttributeNames();
	
		while (enumeration.hasMoreElements()) {
			
			// 세션은 Object 타입으로 저장 => String으로 변환 필요
			String sName = enumeration.nextElement().toString();   // 세션이름(sessionId)을 문자열로 변환
			String sValue = (String) session.getAttribute(sName);  // sName의 value(admin)를 문자열로 변환 
			
			if (sValue.equals("admin")) {
				out.println(sValue+"님 안녕하세요~"+"<br>");
			}
		}
	%>
	
	<a href="sessionTest.jsp">session Test</a>
	<a href="logout.jsp">로그아웃</a>
	
</body>
</html>