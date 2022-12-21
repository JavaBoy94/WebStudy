<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionGet.jsp</title>
</head>
<body>
	<%
		
		String sessionId1 = (String) session.getAttribute("admin1");  // Object 타입을 String으로 변환
		out.println(sessionId1+"<br>");    // "jsp1" 출력
		
		Integer sessionId2 = (Integer) session.getAttribute("adminNUM");  // 숫자형으로 변환
		out.println(sessionId2+"<br>");    // 12345 출력
		
		Integer sessionId3 = (Integer) session.getAttribute("adminPW");  // 숫자형으로 변환
		out.println(sessionId3+"<br>");    // 11111 출력
		
		out.println("*********************** <br>");
		
		Enumeration enumeration = session.getAttributeNames();
		
		while (enumeration.hasMoreElements()) {
			String sName = enumeration.nextElement().toString();
			String sValue = session.getAttribute(sName).toString();
			out.println("session Name : "+sName+" / session Value : "+sValue+"<br>");
		}
		
		out.println("*********************** <br>");
		
		// 존재하는 모든 세션을 종료
		if (session!=null) {
			session.invalidate();  // 모든 세션 종료
		} 
		
		// 모든 세션이 종료되었으므로 invalid session  => 로그아웃
		if (request.isRequestedSessionIdValid()) {
			out.println("valid session (유효한 세션)");
		} else {
			out.println("invalid session (유효하지 않은 세션)");
		}
		
	%>
</body>
</html>