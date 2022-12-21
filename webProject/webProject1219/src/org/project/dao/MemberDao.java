package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberDao {
	
//	// 싱글톤 패턴으로 생성 => 인스턴스를 한번만 생성 (final)
//	private final MemberDao INSTANCE = new MemberDao();
//	
//	// 기본생성자 설정 => 외부에서 호출하지 못하도록 private로 설정
//	private MemberDao() {
//		System.out.println("MemberDao 기본생성자");
//	}
//	
//	public static MemberDao = getInstance() {
//		return INSTANCE;
//	}
	
	
	// 내부클래스(static) 생성 => static 메소드로 참조. private로 외부에서 생성 못하게
	// crud 커멘드별로 각각 객체를 만들어 메소드를 호출하지 않고, dao에서 미리 객체를 만들어 해당 객체에서 필요한 메소드만 호출
	
	Connection conn = null;
	PreparedStatement pstm = null;
	String query = "";
	ResultSet rs = null;
	ArrayList<MemberDto> lists = new ArrayList<MemberDto>();
	int result = 0;

	private static class Singleton{
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	private MemberDao() {
		System.out.println("MemberDao");
	}

	public static MemberDao getInstance() {  // 미리 생성한 객체를 불러오는 메소드
		return Singleton.INSTANCE;
	}

	public int insertDo(String userId, String userPw, String email) {
		
		try {
			
			conn = DBConnect.getConection();
			query = "insert into member1219(userid,userpw,email) values(?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, email);
			
			result = pstm.executeUpdate();
			
			if (conn!= null) conn.close();
			if (pstm!= null) pstm.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return result;
	}

	public ArrayList<MemberDto> SelectDo() {
		
		try {
			conn = DBConnect.getConection();
			query = "select * from member1219";
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			if (rs!=null) {
				while (rs.next()) {
					lists.add(new MemberDto(rs.getString(1), rs.getString(2), rs.getString(3)));
					}
				}
			
			if (conn!=null) conn.close();
			if (pstm!=null) pstm.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lists;
	}

	public int JoinOkDo(String userId, String userPw, String userName, String gender, String hobbys, String phoneNum,
			String memo) {
		
		try {
			conn = DBConnect.getConection();
			query = "insert into test_tb_1219(userId, userPw, userName, gender, hobbys, phone, memo) "
					+ "values(?,?,?,?,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userName);
			pstm.setString(4, gender);
			pstm.setString(5, hobbys);
			pstm.setString(6, phoneNum);
			pstm.setString(7, memo);
			
			result = pstm.executeUpdate();
			
			if (conn!=null) conn.close();
			if (pstm!=null) pstm.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
