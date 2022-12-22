<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join.jsp</title>
<link rel="stylesheet" href="css/join.css" />
</head>
<body>
	<div id="wrap">
		<div class="header">
			<div class="nav">
				<h1 class="logo">
					<a href="index.do">LOGO</a> <!-- a태그와 브라우저를 통한 요청은 무조건 GET -->
				</h1>
					<div class="gnb">
						<ul>
							<li><a href="index.do">HOME</a></li>
							<li><a href="#">게시판</a></li>
							<li><a href="#">INFO</a></li>
							<li><a href="joinview.do">회원가입</a></li>
							<li><a href="loginview.do">로그인</a></li>
						</ul>
					</div>
			</div>
		</div>
		<div class="container">
			<div class="join">
				<div class="join-con">
					<form action="minsert.do" method="post" id="joinForm">
			            <table>
			              <tr>
			                <th colspan="2">회원가입</th>              
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
			                <td><label for="gender">성별</label></td>
			                <td>
			                  <input type="radio" name="gender" id="gender1" value="남자" checked>남
			                  <input type="radio" name="gender" id="gender2" value="여자">여
			                </td>
			              </tr>
			              <tr>
			                <td><label for="hobbys">취미</label></td>
			                <td>
			                  <input type="checkbox" name="hobbys" id="hobbys1" value="게임">게임
			                  <input type="checkbox" name="hobbys" id="hobbys2" value="등산">등산
			                  <input type="checkbox" name="hobbys" id="hobbys3" value="요리">요리
			                  <input type="checkbox" name="hobbys" id="hobbys4" value="여행">여행
			                  <input type="checkbox" name="hobbys" id="hobbys5" value="운동">운동
			                </td>
			              </tr>
			              <!-- <tr>
			                <td><label for="phone">전화번호</label></td>
			                <td>
			                  <select name="phone" id="phone1" class="phone">
			                    <option value="" selected>::번호선택::</option>
			                    <option value="010">010</option>
			                    <option value="02">02</option>
			                    <option value="033">033</option>
			                  </select>
			                  - <input type="text" name="phone" id="phone2" class="phone" size="4" maxlength="4">
			                  - <input type="text" name="phone" id="phone3" class="phone" size="4" maxlength="4">
			                </td>
			              </tr> -->
			              <tr>
			                <td><label for="city">출신지</label></td>
			                <td>
			                  <select name="city" id="city">
			                    <option value="" selected>::출신지 선택::</option>
			                    <option value="서울">서울</option>
			                    <option value="경기도">경기도</option>
			                    <option value="강원도">강원도</option>
			                    <option value="전라도">전라도</option>
			                    <option value="경상도">경상도</option>
			                    <option value="제주도">제주도</option>
			                    <option value="이세계">★이세계★</option>
			                </select>
			              </td>
			              </tr>
			              <tr>
			                <td colspan="2"><label for="memo">자기소개</label></td>
			              </tr>
			              <tr>
			                <td colspan="2"><textarea name="memo" id="memo" cols="30" rows="10"></textarea></td>
			              </tr>
			              <tr>
			                <td id="btn" colspan="2">
			                  <input type="reset" value="초기화">
			                  <input type="submit" class="joinOK" value="회원가입 실행">
			                </td>
			              </tr>
			            </table>
		          </form>
				</div>
			</div>
		</div>
		<div class="footer">
			<div class="footer-con">footer</div>
		</div>
	</div>
</body>
</html>