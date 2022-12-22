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
			session.setAttribute("sessionId", session);
			session.setMaxInactiveInterval(60*60);
			
			fowardURL = "/index.jsp";
			
		} else {
			System.out.println("로그인 실패!");
			
			fowardURL = "/login.jsp";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("fowardURL", fowardURL);
		
	}

}
