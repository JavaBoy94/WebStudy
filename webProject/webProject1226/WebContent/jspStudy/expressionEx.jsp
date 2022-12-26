<%@page import="org.project.dto.MemberDto2"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%
	ArrayList<MemberDto2> members = new ArrayList<>();
	
	members.add(new MemberDto2("m1","1111","mName1",18,"남자"));
	members.add(new MemberDto2("m2","2222","mName2",22,"여자"));
	members.add(new MemberDto2("m3","3333","mName3",37,"남자"));
	members.add(new MemberDto2("m4","4444","mName4",45,"여자"));
	members.add(new MemberDto2("m5","5555","mName5",52,"남자"));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>expressionEx</title>
</head>
<body>
	<div class="member">
		<ul>
		<%
			for (MemberDto2 member : members) {
		%>
		<!-- html코드를 사용할 경우 => 스크립트릿 밖(jsp)에 태그 사용  -->
		<!-- foreach로 회원정보 출력 -->
			<li>
				<span>ID : <%=member.getUserId() %></span>
				<span>PW : <%=member.getUserPw() %></span>
				<span>NAME : <%=member.getUserName() %></span>
				<span>AGE : <%=member.getAge() %></span>
				<span>GENDER : <%=member.getGender() %></span>
			</li>		
		<%		
			}
		%>
		</ul>
	</div>
	<table>
		<th>회원명단</th>
		<%
			for (MemberDto2 member : members) {
		%>
			<tr>
				<td>ID : <%=member.getUserId() %></td>
				<td>PW : <%=member.getUserPw() %></td>
				<td>NAME : <%=member.getUserName() %></td>
				<td>AGE : <%=member.getAge() %></td>
				<td>GENDER : <%=member.getGender() %></td>
			</tr>
		<%		
			}
		%>
	</table>
</body>
</html>