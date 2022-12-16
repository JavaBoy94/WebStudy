package org.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	
	// doGet => get방식으로 요청(브라우저 주소에 입력하는 모든 경우)
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path = request.getContextPath();            // 프로젝트 기본경로 
		String uri = request.getRequestURI();              // 프로젝트 + 파일(요청) 경로 (path/~.do)
		
		String bUri = uri.substring(path.length());        // 문자열에서 시작번지(path다음에 오는 경로)~나머지 문자열 get  => uri-path => /*.do
		
		// bUri.equals("/insert.do") => 회원가입
		// bUri.equals("/select.do") => 회원조회
		// bUri.equals("/update.do") => 회원수정
		// bUri.equals("/delete.do") => 회원탈퇴
		
		if(bUri.equals("/insert.do")) {
			System.out.println("회원가입");
		} else if (bUri.equals("/select.do")) {
			System.out.println("회원조회");
		} else if (bUri.equals("/update.do")) {
			System.out.println("회원수정");
		} else if (bUri.equals("/delete.do")) {
			System.out.println("회원탈퇴");
		}
		
		// 서버 => 클라이언트 응답 (★HTML로 응답 => 브라우저(view)에 출력되어 표시) 
		PrintWriter out = response.getWriter();
		
		out.println("path : "+path);
		out.println("uri : "+uri);
		out.println("bUri : "+bUri);
		
		
		String host = request.getRemoteHost();          // 요청 host (요청한 클라이언트의 ip주소)
		out.println("host : "+host);
		StringBuffer URL = request.getRequestURL();     // 전체 요청경로
		out.println("URL : "+URL);
		out.println("================================");
		
		out.close();
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
