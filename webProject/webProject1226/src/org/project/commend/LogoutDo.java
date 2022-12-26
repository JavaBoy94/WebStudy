package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import oracle.net.aso.s;

public class LogoutDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("로그아웃");
		
		String fowardURL = "";
		HttpSession session = request.getSession();
		
		if (session!=null) {
			session.invalidate();
			fowardURL="/index.do";
		}
		
		request.setAttribute("fowardURL", fowardURL);
	}

}
