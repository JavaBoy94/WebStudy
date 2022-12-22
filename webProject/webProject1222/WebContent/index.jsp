<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<link rel="stylesheet" href="css/index.css" />
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
			<div class="index">
				<div class="index-con">index</div>
			</div>
		</div>
		<div class="footer">
			<div class="footer-con">footer</div>
		</div>
	</div>
</body>
</html>