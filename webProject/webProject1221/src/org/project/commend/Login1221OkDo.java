package org.project.commend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.project.dao.MemberDao;

public class Login1221OkDo implements MemberCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("로그인 login1221");
		
		String userid = request.getParameter("userId");
		String userpw = request.getParameter("userPw");
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.login1221OkDo(userid,userpw);
		String fowardURL = "";
		
		// 세션 생성
		HttpSession session = request.getSession();
		
		if (result==1) {
			System.out.println("로그인 성공 !");
			session.setAttribute("sessionId", session); // 세션ID 설정
			session.setMaxInactiveInterval(60*60);  // 세션 유효시간 설정
			fowardURL = "/login1221Ok.jsp";
		} else {
			System.out.println("로그인 실패 !");
			fowardURL = "/join1221.jsp";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("fowardURL", fowardURL);
	}

}
