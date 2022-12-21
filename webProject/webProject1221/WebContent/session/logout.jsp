<%@page import="java.util.Enumeration"%>
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
		// 세션이 있으면 while 실행
		Enumeration enumeration = session.getAttributeNames();
	
		while (enumeration.hasMoreElements()) {
			String sName = enumeration.nextElement().toString();
			String sValue = (String) session.getAttribute(sName);
			
			if (sValue.equals("admin"))	{
				// 특정 이름(sessionId)의 세션 삭제
				session.removeAttribute(sName);
				// 모든 세션 삭제 (무효화)
				// session.invalidate(); 
			}
		}
	%>
	
	<a href="sessionTest.jsp">session Test</a>
</body>
</html>