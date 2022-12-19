package org.project.commend;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;

public class MemberSelectDo implements MemberCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원조회");
		
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
		
		MemberDao dao = MemberDao.getInstance();
		
		lists = dao.SelectDo();
		
		PrintWriter out = response.getWriter();
		
		if (lists!=null) {
			for (MemberDto dto : lists) {
				out.println("ID : "+dto.getUserId());
				out.println("PW : "+dto.getUserPw());
				out.println("email : "+dto.getEmail());
				out.println();
			}
			
			out.close();
		}
		
	}

}
