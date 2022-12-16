package org.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 어노테이션(@) => 코드 자동화. 설정시 특정 기능 실행
// @WebServlet으로 web.xml의 <servlet-mapping> 대체 가능
@WebServlet("*.ax")
public class AjaxController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET");
		
		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");
		
		System.out.println("ID : "+userId);
		System.out.println("PW : "+userPw);
		System.out.println("Name : "+userName);
		
		PrintWriter out = response.getWriter();
		
		out.println("ID : "+userId);
		out.println("PW : "+userPw);
		out.println("Name : "+userName);
		
		out.close();
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST");
	}
	
}