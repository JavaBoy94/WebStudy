package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberInsertDo implements SQLCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("회원가입");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String email = request.getParameter("email");
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.memberInsertDo(userId,userPw,email);
		
		String fowardURL = "";
		
		if (result!=0) {
			System.out.println("회원가입 성공 !");
			fowardURL = "/login.jsp";
		} else {
			System.out.println("회원가입 실패 !");
			fowardURL = "/index.jsp";
		}
		
		request.setAttribute("result", result); // key("result") : value(result)
		request.setAttribute("fowardURL", fowardURL); // key("fowardURL") : value(forwardURL)
	}

}
