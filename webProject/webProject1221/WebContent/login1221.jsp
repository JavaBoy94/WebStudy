<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<form action="login1221ok.do" method="post" id="joinForm">
            <table>
              <tr>
                <th colspan="2">로그인</th>              
              </tr>
              <tr>
                <td><label for="userId">아이디</label></td>
                <td><input type="text" name="userId" id="userId"></td>
              </tr>
              <tr>
                <td><label for="userPw">비밀번호</label></td>
                <td><input type="password" name="userPw" id="userPw"></td>
              </tr>
              <tr>
                <td id="btn" colspan="2">
                  <input type="reset" value="초기화">
                  <input type="submit" class="joinOK" value="로그인">
                </td>
              </tr>
            </table>
          </form>
</body>
</html>