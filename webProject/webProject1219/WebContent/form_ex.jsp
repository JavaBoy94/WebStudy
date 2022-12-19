<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
</head>
<body>

	<form action="joinOK.do" method="POST" id="joinForm">

    <label for="userId">아이디</label>
    <input type="text" name="userId" id="userId"> <br>

    <label for="userPw">비밀번호</label>
    <input type="password" name="userPw" id="userPw"> <br>
    
    <label for="userName">이름</label>
    <input type="text" name="userName" id="userName"> <br>

    <label for="gender">성별</label>
    <input type="radio" name="gender" class="gender" value="남자" checked>남
    <input type="radio" name="gender" class="gender" value="여자">여 <br>

    <label for="hobbys">취미</label>
    <input type="checkbox" name="hobbys" class="hobbys" value="등산" >등산
    <input type="checkbox" name="hobbys" class="hobbys" value="영화감상" checked>영화감상
    <input type="checkbox" name="hobbys" class="hobbys" value="게임">게임 <br>

    <label for="phone">전화번호</label>
    <select name="phone" id="phone" class="phone">
      <option value="" selected>::번호선택::</option>
      <option value="010">010</option>
      <option value="011">011</option>
      <option value="02">02</option>
    </select>
    - <input type="text" name="phone" id="phone2" class="phone" size="4" maxlength="4">
    - <input type="text" name="phone" id="phone3" class="phone" size="4" maxlength="4">
    <br>
    <br>

    <label for="memo">자기소개</label> <br>	
    <textarea name="memo" id="memo" cols="30" rows="10" placeholder="자기소개 !"></textarea> <br>

    <input type="reset" value="초기화">
    <input type="button" value="이벤트구현" id="btn1">
    <!-- <input type="submit" value="회원가입 실행"> -->
    <input type="submit" class="joinOK" value="회원가입 실행">


  </form>
</body>
</html>