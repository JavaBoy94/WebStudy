<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	session.setAttribute("sessionId", "admin");
	String sessionId = session.getAttribute("sessionId").toString();
	
	// sessionId가 admin인지 아닌지
	if (!sessionId.equals("admin")) {
		// sessionId가 admin이 아닐경우 팝업창을 띄우고(alert) 네이버로 이동
		out.write("<script>");
		out.write(" alert('관리자만 이용할 수 있습니다 !'); ");
		out.write(" location.href='http://naver.com' ");
		out.write("</script>");
	}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scriptlet</title>
</head>
<body>
	<h1>*관리자 페이지*</h1>
	<span>관리자 ID : <%=sessionId %></span> <br />
	<%
		int total=0;
		for(int i=1; i<=100; i++) {
			total+=i;
		}
	%>
	<div>1부터 100까지 합 = <%=total %></div>
	<%
		for(int i=101; i<=200; i++) {
			total += i;
		}
	%>
	<div>1부터 200까지 합 = <%=total %></div>
</body>
</html>