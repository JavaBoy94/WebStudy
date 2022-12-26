<%-- 지시어 부분 => 해당 jsp문서정보를 표시 (html의 head같은 부분) --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 선언문 --%>
<%-- 메소드, 멤버변수 등을 선언 => 스크립트릿, 표현식에 사용  --%>
<%! 
	String userId = "m1";
	String userPw = "1111";
	
	// for문으로 2의 거듭제곱 수행
	private int method1(int num1, int num2) {
		int result = 1;
		for (int i=0; i<num2; i++) {
			result *= num1;
		}
		return result;
	}
%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp1</title>
</head>
<body>
	<%-- 스크립트릿(<% %>) => java코드 실행영역 --%>
	아이디 : <%=userId %>, 비밀번호 : <%=userPw %> <br>
		2^1= <%=method1(2, 1) %> <br>
		2^2= <%=method1(2, 2) %> <br>
		2^3= <%=method1(2, 3) %> <br>
		2^4= <%=method1(2, 4) %> <br>
		2^5= <%=method1(2, 5) %> <br>
</body>
</html>