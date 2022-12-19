package org.project.commend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberInsertDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원가입");
		
		// URL상의 속성값 추출 => MemberDto와 대응 (mInsert.do?userId=m1&userPw=11&email=m1@naver.com)
		String userId = request.getParameter("userId");   
		String userPw = request.getParameter("userPw");   
		String email = request.getParameter("email");
		
		// 미리 만들어둔 객체를 불러옴
		// 메소드 실행할 때마다 객체를 생성하지 않고도, 똑같은 객체 하나로 필요한 메소드만 호출 가능
		MemberDao dao = MemberDao.getInstance();  
		
		int result = dao.insertDo(userId, userPw, email);
		
		if (result!=0) {
			System.out.println("회원가입 성공 !");
		} else {
			System.out.println("회원가입 실패 !");
		}
		
				
		
	}

}
