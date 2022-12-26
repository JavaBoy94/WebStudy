<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String userId = request.getParameter("userId");
	String userName = request.getParameter("userName");
	String[] phoneArr = request.getParameterValues("phone");
	
	String phoneNum = "";
	for (String phone : phoneArr) {
		phoneNum += phone+" ";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinOk.jsp</title>
</head>
<body>
	ID : <%=userId %>, Name : <%=userName %>, 전번 : <%=phoneNum %> <br />
	<%
		// 매개변수의 name속성을 열거형으로 리턴 => userId, userName, phone (name의 값은 아님)
		Enumeration en = request.getParameterNames(); 
		
		while (en.hasMoreElements()) {
			String name = en.nextElement().toString();
			out.println(name);  // 
		}
	%>
	<br />
	
	<%-- JSP => Servlet 변환 주요 메소드 --%>
	
	전송방식(method) : <%=request.getMethod() %> <br />
	쿠키 : <%=request.getCookies() %> <br /> <%-- ★쿠키, 로그인 --%>
	세션 : <%=request.getSession() %> <br /> <%-- ★세션, 로그인 --%>
	요청IP : <%=request.getRemoteAddr() %> <br /> <%-- 요청IP 주소 --%>
	프로토콜 : <%=request.getProtocol() %> <br /> <%-- 요청 프로토콜 --%>
	서버호스트 이름 :<%=request.getServerName() %> <br /> <%-- 요청 서버이름 --%>
	요청 URI : <%=request.getRequestURI() %> <br /> <%-- ★요청 URI --%>
	요청URL쿼리 스트링 : <%=request.getQueryString() %> <br />
	요청에 대한 기본경로(path) : <%=request.getContextPath() %> <br /> <%-- ★기본경로 --%>
	요청 캐릭터 셋 : <%=request.getCharacterEncoding() %> <br />
	문자열 name에 저장된 헤더 : <%=request.getHeader("host") %> <br />
	
</body>
</html>