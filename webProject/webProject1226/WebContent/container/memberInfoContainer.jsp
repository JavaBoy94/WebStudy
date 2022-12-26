<%@page import="java.util.ArrayList"%>
<%@page import="org.project.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%
	MemberDto member =(MemberDto)request.getAttribute("member");
	%>

<div class="container">
	<div class="join">
		<div class="join-con">
				<table>
					<tr>
						<th colspan="2">회원정보</th>
					</tr>
					<tr>
						<td><label for="userId">아이디</label></td>
						<td><%=member.getUserId() %></td>
					</tr>
					<tr>
						<td><label for="userPw">비밀번호</label></td>
						<td><%=member.getUserPw() %></td>
					</tr>
					<tr>
						<td><label for="gender">성별</label></td>
						<td><%=member.getGender() %></td>
					</tr>
					<tr>
						<td><label for="hobbys">취미</label></td>
						<td><%=member.getHobbys() %></td>
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
						<td><%=member.getCity() %></td>
					</tr>
					<tr>
						<td colspan="2"><label for="memo">자기소개</label></td>
					</tr>
					<tr>
						<td colspan="2"><%=member.getMemo() %></tr>
					<tr>
						<td id="btn" colspan="2"><input type="button" value="회원수정">
					</tr>
				</table>
		</div>
	</div>
</div>