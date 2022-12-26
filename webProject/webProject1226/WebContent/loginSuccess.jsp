<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String sessionId = session.getAttribute("sessionId").toString();

	if (sessionId==null) {
		out.write("<script>");
		out.write("alert('로그인 후 이용 바랍니다.')");
		out.write("location.href='index.do' ");
		out.write("</script>");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginSuccess.jsp</title>
</head>
<body>
	<%@include file="common/header.jsp" %>
	<%@include file="container/indexContainer.jsp" %>
	<%@include file="common/footer.jsp" %>
</body>
</html>