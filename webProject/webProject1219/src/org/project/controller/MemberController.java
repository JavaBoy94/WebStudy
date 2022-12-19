package org.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.filters.SetCharacterEncodingFilter;
import org.project.commend.MemberCommend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;

@WebServlet("*.do")
public class MemberController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET");
		
		doPost(request, response);   // doGet(읽기), doPost(쓰기)를 doPost에서 한번에 처리
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST");
		
		// request => 클라이언트의 요청을 받아 처리
		String basicPath = request.getContextPath();         // 기본경로
		String uri = request.getRequestURI();                // 전체 요청경로
		String userURL = uri.substring(basicPath.length());  // *.do 형태로 자르기(uri - basicPath)
		
		// 한글로 표시처리 => request.getParameter()와 response.getWriter() 메소드 실행 이전에 설정해야함
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");    
		
		String url = "";  
		
		// response => 요청에 대한 응답을 처리 => view로 표시(html) => 나중에 JSP 사용 (html 안에 java로 코딩)
//		PrintWriter out = response.getWriter();
//		
//		out.println("<!doctype html>");
//			out.println("<html");
//				out.println("<head>");  
//					out.println("<title>서블릿 실습(View)</title>");
//				out.println("</head>");
//				out.println("<body>");
//					out.println("<h1>서블릿</h1>");
////					out.println("ID : "+userId);
////					out.println("<br>PW : "+userPw);
////					out.println("<br>email : "+email);
//				out.println("</body>");
//			out.println("</html>");
//			
//		out.close();
//		
		MemberCommend comm;
		
		if (userURL.equals("/mInsert.do")) {
			comm = new MemberInsertDo();
			comm.excuteQueryCommend(request, response);
		} else if (userURL.equals("/mUpdate.do")) {
			comm = new MemberUpdateDo();
			comm.excuteQueryCommend(request, response);
		} else if (userURL.equals("/mSelect.do")) {
			comm = new MemberSelectDo();
			comm.excuteQueryCommend(request, response);
		} else if (userURL.equals("/mDelete.do")) {
			comm = new MemberDeleteDo();
			comm.excuteQueryCommend(request, response);
		} else if (userURL.equals("/joinOK.do")) {
			comm = new JoinOkDo();
			comm.excuteQueryCommend(request, response);
		} 
	}
	
}
