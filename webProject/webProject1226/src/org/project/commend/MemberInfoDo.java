package org.project.commend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberInfoDo implements MemberCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원정보");
		
		String userId=request.getParameter("userId");
		
		String fowardURL = "";
		
		MemberDao dao = MemberDao.getInstance();
		
		
		
		MemberDto member = dao.memberInfo(userId);
		
		if (member!=null) {
			System.out.println("회원정보 로드 성공");
			
			request.setAttribute("member", member);
			fowardURL = "/memberInfo.jsp";
		}
		
		request.setAttribute("fowardURL", fowardURL);
		
		
	}

}
