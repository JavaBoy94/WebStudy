<%@page import="org.project.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ArrayList<MemberDto> members = 
		(ArrayList<MemberDto>) request.getAttribute("members");
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>members</title>
</head>
<body>
	<h1>회원목록</h1>
	
	<%
		for (MemberDto member : members) {
		out.print("ID : "+member.getUserId()+" ");		
		out.print("PW : "+member.getUserPw()+" ");		
		out.print("email : "+member.getEmail()+"<br>");		
		}
	%>
	
</body>
</html>