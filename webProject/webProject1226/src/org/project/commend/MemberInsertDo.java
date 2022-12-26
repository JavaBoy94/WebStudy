package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberInsertDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("회원가입");
		
		String userid = request.getParameter("userId");
		String userpw = request.getParameter("userPw");
		String gender = request.getParameter("gender");
		
		String[] hobbysArr = request.getParameterValues("hobbys");
		
		String hobbys = "";
		
		if (hobbysArr!=null) {
			for (String hobby : hobbysArr) {
				hobbys += hobby+" ";
			}
		}
		
		String city = request.getParameter("city");
		String memo = request.getParameter("memo");
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.memberInsertDo(userid,userpw,gender,hobbys,city,memo);
		
		String fowardURL = "";
		
		if (result!=0) {
			System.out.println("회원가입 성공 !");		
			fowardURL = "/login.jsp";
		} else {
			System.out.println("회원가입 실패 !");
			fowardURL = "/minsert.do";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("fowardURL", fowardURL);
	}

}
