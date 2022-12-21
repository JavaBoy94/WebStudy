package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberLoginDo implements SQLCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("로그인");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		
		MemberDao dao = MemberDao.getInstance();
		
		

	}

}
