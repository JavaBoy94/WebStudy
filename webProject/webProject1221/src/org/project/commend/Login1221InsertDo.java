package org.project.commend;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class Login1221InsertDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("회원가입 login1221 Insert");
		
		String userid = request.getParameter("userId");
		String userpw = request.getParameter("userPw");
		String gender = request.getParameter("gender");
		String[] hobbysArr = request.getParameterValues("hobbys");
		
		String hobbys = "";
		for (String hobby : hobbysArr) {
			hobbys += hobby+" ";
		}
		
		String city = request.getParameter("city");
		String memo = request.getParameter("memo");
		
		
		MemberDao dao = MemberDao.getInstance();
		
		int result = dao.login1221InsertDo(userid,userpw,gender,hobbys,city,memo);
		
		String fowardURL = "";
		
		if (result!=0) {
			System.out.println("회원가입 성공 !");
			fowardURL = "index1221.jsp";
		} else {
			System.out.println("회원가입 실패 !");
			fowardURL = "login1221.jsp";
		}
		
		request.setAttribute("result", result);
		request.setAttribute("fowardURL", fowardURL);
	}

}
