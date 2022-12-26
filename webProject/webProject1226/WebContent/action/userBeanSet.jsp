<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="myBean" class="org.project.dto.MemberBean"/>

<jsp:setProperty property="no" name="myBean" value="11"/>
<jsp:setProperty property="userId" name="myBean" value="root"/>
<jsp:setProperty property="userPw" name="myBean" value="1234"/>
<jsp:setProperty property="userName" name="myBean" value="ss1"/>
<jsp:setProperty property="userAge" name="myBean" value="10"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>userBeanSet</title>
</head>
<body>
	<h1>setProperty 실습</h1>
	사용자 번호 : <%=myBean.getNo() %> <br />
	사용자 ID : <%=myBean.getUserId() %> <br />
	사용자 PW : <%=myBean.getUserPw() %> <br />
	사용자 이름 : <%=myBean.getUserName() %> <br />
	사용자 나이 : <%=myBean.getUserAge() %> <br />
</body>
</html>