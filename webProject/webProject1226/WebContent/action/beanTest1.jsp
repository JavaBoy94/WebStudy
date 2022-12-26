<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>useBean Test1</title>
</head>
<body>
	<jsp:useBean id="member" class="org.project.dto.MemberBean" scope="page">
		<jsp:setProperty name="member" property="no" param="no" />
		<jsp:setProperty name="member" property="userId" param="userId" />
		<jsp:setProperty name="member" property="userPw" param="userPw" />
		<jsp:setProperty name="member" property="userName" param="userName" />
		<jsp:setProperty name="member" property="userAge" param="userAge" />
	</jsp:useBean>
	
	<%-- class의 모든 필드를 동일하게 설정할 경우 * 사용가능  => param도 동일하게 설정됨 --%>
	
	<jsp:useBean id="member2" class="org.project.dto.MemberBean">
		<jsp:setProperty name="member2" property="*" />
	</jsp:useBean>
	
	<%-- member bean 출력 getter --%>
	
	번호 : <jsp:getProperty property="no" name="member"/> <br />
	아이디 : <jsp:getProperty property="userId" name="member"/> <br />
	비밀번호 : <jsp:getProperty property="userPw" name="member"/> <br />
	이름 : <jsp:getProperty property="userName" name="member"/> <br />
	나이 : <jsp:getProperty property="userAge" name="member"/> <br />
	
	<%-- membe2r bean 출력 getter --%>
	
	번호 : <jsp:getProperty property="no" name="member2"/> <br />
	아이디 : <jsp:getProperty property="userId" name="member2"/> <br />
	비밀번호 : <jsp:getProperty property="userPw" name="member2"/> <br />
	이름 : <jsp:getProperty property="userName" name="member2"/> <br />
	나이 : <jsp:getProperty property="userAge" name="member2"/> <br />
	
</body>
</html>