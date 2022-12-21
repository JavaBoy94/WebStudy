package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberUpdateDo implements SQLCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원수정");
		
		MemberDao dao = MemberDao.getInstance();
		
		String userid = request.getParameter("userId");
		String userpw = request.getParameter("userPw");
		String email = request.getParameter("email");
		
		int result = dao.memberUpdateDo(userid,userpw,email);
		
		String fowardURL = "";
		
		if (result!=0) {
			System.out.println("회원수정 성공 !");
			fowardURL = "/login.jsp";
		} else {
			System.out.println("회원수정 실패 !");
			fowardURL = "/index.jsp";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("fowardURL", fowardURL);
	}

}
