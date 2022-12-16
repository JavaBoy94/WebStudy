package org.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardController extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		System.out.println("init (서블릿 시작)");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET");
		
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		String bUri = uri.substring(path.length());
		
		String host = request.getRemoteHost();
		StringBuffer URL = request.getRequestURL();
		
		
		PrintWriter out = response.getWriter();
		
		if (bUri.equals("/write.board")) {
			out.println("board write");
		} else if (bUri.equals("/update.board")) {
			out.println("board update");
		} else if (bUri.equals("/select.board")) {
			out.println("board select");
		} else if (bUri.equals("/delete.board")) {
			out.println("board delete");
		}	
		
		out.println("path : "+path);
		out.println("uri : "+uri);
		out.println("bUri : "+bUri);
		out.println("host : "+host);
		out.println("URL : "+URL);
		out.println("=================================");
		
		out.close();
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy (서블릿 종료)");
	}

}
