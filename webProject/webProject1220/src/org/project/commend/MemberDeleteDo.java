package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberDeleteDo implements SQLCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원탈퇴");
		
		String userid = request.getParameter("userId");
		String userpw = request.getParameter("userPw");
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.memberDeleteDo(userid,userpw);
		
		String fowardURL = "";
		
		if (result!=0) {
			System.out.println("회원탈퇴 성공 !");
			fowardURL = "/test1220.jsp";
		} else {
			System.out.println("회원탈퇴 실패 !");
			fowardURL = "index.jsp";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("fowardURL", fowardURL);
	}

}
