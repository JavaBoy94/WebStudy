package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberLoginDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;
import org.project.commend.SQLCommend;

@WebServlet("*.do")
public class MemberController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		System.out.println("GET");
		doWeb(request, response);
	}
	

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		System.out.println("POST");
		doWeb(request, response);
	}
	
	private void doWeb(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String basicfowardURL = uri.substring(path.length());  // /*.do
		
		String fowardURL = "";  // controller에서 view로 연결 => RequestDispatcher?
		
		SQLCommend comm = null;
		
		if (basicfowardURL.equals("/minsert.do")) {
			comm = new MemberInsertDo();
			comm.excuteQueryCommend(request, response);
			
			// 결과를 view로 보냄 => RequestDispatcher
			fowardURL = (String) request.getAttribute("fowardURL");  
			
		} else if (basicfowardURL.equals("/mselect.do")) {
			comm = new MemberSelectDo();
			comm.excuteQueryCommend(request, response);
			
			fowardURL = (String) request.getAttribute("fowardURL");
			
		} else if (basicfowardURL.equals("/mupdate.do")) {
			comm = new MemberUpdateDo();
			comm.excuteQueryCommend(request, response);
			
			fowardURL = (String) request.getAttribute("fowardURL");
			
		} else if (basicfowardURL.equals("/mdelete.do")) {
			comm = new MemberDeleteDo();
			comm.excuteQueryCommend(request, response);
			
			fowardURL = (String) request.getAttribute("fowardURL");
			
		} else if (basicfowardURL.equals("/test1220.do")) {
			fowardURL = "test1220.jsp";
		} else if (basicfowardURL.equals("/index.do")) {
			fowardURL = "index.jsp";
		} else if (basicfowardURL.equals("/join.do")) {
			fowardURL = "join.jsp";
		} else if (basicfowardURL.equals("/login.do")) {
			fowardURL = "login.jsp";
		}
		
		// 컨트롤러가 요청결과(jsp 페이지)를 dispatcher에 담음
		RequestDispatcher dispatcher = request.getRequestDispatcher(fowardURL);
		// 담겨진 dispatcher를 request로 설정하여 response로 전달 => view에 표시
		dispatcher.forward(request, response);
		
	}

}
