<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>requestEx</title>
</head>
<body>
	<form action="joinOk.jsp"	method="post">
		ID : <input type="text" name="userId" id="userId" /> <br />
		Name : <input type="text" name="userName" id="userName" /> <br />
		Phone : <select name="phone" class="phone">
			<option value="010">010</option>
			<option value="011">011</option>
			<option value="016">016</option>
		</select>
		- <input type="text" name="phone" class="phone" size="4" maxlength="4"/>
		- <input type="text" name="phone" class="phone" size="4" maxlength="4"/> <br />
		<input type="submit" value="회원가입(JSP)" />
	</form>
</body>
</html>