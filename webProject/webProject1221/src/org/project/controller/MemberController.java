package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.Login1221InsertDo;
import org.project.commend.Login1221OkDo;
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
		
		MemberCommend comm = null;
		
			
		if (basicfowardURL.equals("/join1221.do")) {
			comm = new Login1221InsertDo();
			comm.excuteQueryCommend(request, response);
			
			fowardURL = request.getAttribute("fowardURL").toString();
			
		} else if (basicfowardURL.equals("/login1221insert.do")) {
			comm = new Login1221InsertDo();
			comm.excuteQueryCommend(request, response);
			
			fowardURL = "join1221.jsp";
			
		} else if (basicfowardURL.equals("/login1221ok.do")) {
			comm = new Login1221OkDo();
			comm.excuteQueryCommend(request, response);
			
			fowardURL = request.getAttribute("fowardURL").toString();
			
		} else if (basicfowardURL.equals("/*.do")) {
			
			fowardURL = "index1221.jsp";
		}
		
		// 컨트롤러가 요청결과(jsp 페이지)를 dispatcher에 담음
		RequestDispatcher dispatcher = request.getRequestDispatcher(fowardURL);
		// 담겨진 dispatcher를 request로 설정하여 response로 전달 => view에 표시
		dispatcher.forward(request, response);
		
	}

}

