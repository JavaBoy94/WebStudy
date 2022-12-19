package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface MemberCommend {
	
	// 요청에 따른 SQL 처리 메소드 => request, response를 매개변수로 받음 (예외처리 필수)
	abstract void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException;  

}
