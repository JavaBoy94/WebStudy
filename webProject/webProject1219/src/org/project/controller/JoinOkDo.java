package org.project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.MemberCommend;
import org.project.dao.MemberDao;

public class JoinOkDo implements MemberCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("form 회원가입 예제");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");
		String gender = request.getParameter("gender");
		
		// checkbox => 다중데이터 => 반복문
		String[] hobbys = request.getParameterValues("hobbys");
		String Hobbys = "";
		for (String hobby : hobbys) {
			Hobbys += hobby+" ";
		}
		
		// 전화번호 => 다중데이터 => 반복문
		String[] phone = request.getParameterValues("phone");
		String phoneNum ="";
		for(String num : phone) {
			phoneNum += num+" ";
		}
		
		String memo = request.getParameter("memo");
		
		System.out.println("ID : "+userId);
		System.out.println("PW : "+userPw);
		System.out.println("이름 : "+userName);
		System.out.println("성별 : "+gender);
		System.out.println("취미 : "+Hobbys);
		System.out.println("전화번호 : "+phoneNum);
		System.out.println("자기소개 : "+memo);
		
		// test_tb_1219에 추가
		
		MemberDao dao = MemberDao.getInstance();
		int result = dao.JoinOkDo(userId, userPw, userName, gender, Hobbys, phoneNum, memo);
		
		if (result!=0) {
			System.out.println("join 성공 !");
		} else {
			System.out.println("join 실패 !");
		}
	}

}
