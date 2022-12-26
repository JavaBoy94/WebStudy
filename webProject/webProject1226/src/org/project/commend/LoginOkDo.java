package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.project.dao.MemberDao;

public class LoginOkDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("로그인");
		
		String userid = request.getParameter("userId");
		String userpw = request.getParameter("userPw");
		
		String fowardURL = "";
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.loginOkDo(userid,userpw);
		
		HttpSession session = request.getSession();
		
		if (result==1) {
			System.out.println("로그인 성공 !");
			// 로그인 성공시 세션 부여
			// 서버가 돌아가는동안 유효시간 내에서 세션이 살아있음
			session.setAttribute("sessionId", userid);
			session.setMaxInactiveInterval(60*60);
			
			fowardURL = "/index.do";
			
		} else {
			System.out.println("로그인 실패!");
			
			fowardURL = "/loginFail.jsp";
		}
		
//		request.setAttribute("result", result);
		request.setAttribute("fowardURL", fowardURL);
		
	}

}
