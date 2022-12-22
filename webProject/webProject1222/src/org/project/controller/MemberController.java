package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.LoginOkDo;
import org.project.commend.LogoutDo;
import org.project.commend.MemberCommend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;

@WebServlet("*.do")
public class MemberController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("GET");
		request.setCharacterEncoding("UTF-8");
		webApp(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println("POST");
		request.setCharacterEncoding("UTF-8");

		webApp(request, response);
	}
	
	protected void webApp(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		System.out.println("webApp");
		request.setCharacterEncoding("UTF-8");

		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String basicURL = uri.substring(path.length());
		
		MemberCommend comm = null;
		
		String fowardURL = "";  // 요청 결과를 view로 응답할 url => dispatcher
		
		if (basicURL.equals("/minsert.do")) {
			comm = new MemberInsertDo();
			comm.excuteQueryCommend(request, response);			
			fowardURL = request.getAttribute("fowardURL").toString();
			
		} else if (basicURL.equals("/mselect.do")) {
			comm = new MemberSelectDo();
			comm.excuteQueryCommend(request, response);			
			fowardURL = request.getAttribute("fowardURL").toString();
			
		} else if (basicURL.equals("/mupdate.do")) {
			comm = new MemberUpdateDo();
			comm.excuteQueryCommend(request, response);
			fowardURL = request.getAttribute("fowardURL").toString();
			
		} else if (basicURL.equals("/mdelete.do")) {
			comm = new MemberDeleteDo();
			comm.excuteQueryCommend(request, response);
			fowardURL = request.getAttribute("fowardURL").toString();
			
		} else if (basicURL.equals("/loginok.do")) {
			comm = new LoginOkDo();
			comm.excuteQueryCommend(request, response);		
			fowardURL = request.getAttribute("fowardURL").toString();
			
		} else if (basicURL.equals("/logout.do")) {
			comm = new LogoutDo();
			comm.excuteQueryCommend(request, response);			
			fowardURL = request.getAttribute("fowardURL").toString();
			
		} else if (basicURL.equals("/index.do")) {
			fowardURL = "/index.jsp";
		} else if (basicURL.equals("/joinview.do")) {
			fowardURL = "/join.jsp";
		} else if (basicURL.equals("/loginview.do")) {
			fowardURL = "/login.jsp";
		} else if (basicURL.equals("/")) {
			fowardURL = "/index.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(fowardURL);
		dispatcher.forward(request, response);   // request : basicURL, response : fowardURL => basicURL에 대한 요청을 fowardURL로 응답 by dispatcher
	}
}
