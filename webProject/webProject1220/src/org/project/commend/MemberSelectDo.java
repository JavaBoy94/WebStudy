package org.project.commend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelectDo implements SQLCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원조회");
		
		MemberDao dao = MemberDao.getInstance();
		
		ArrayList<MemberDto> members = dao.memberSelectDo(); 
		
		String fowardURL = ""; 
		
		if (members!=null) {
			System.out.println("회원조회 성공 !");
			fowardURL = "/members.jsp";
		} else {
			System.out.println("회원조회 실패 !");

			fowardURL = "/index.jsp";
		}
		
		request.setAttribute("members", members);
		request.setAttribute("fowardURL", fowardURL);
		
	}

}
