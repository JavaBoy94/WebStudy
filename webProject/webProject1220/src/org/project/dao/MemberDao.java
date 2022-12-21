package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberDao {
	
	int result = 0;
	Connection conn = null;
	PreparedStatement pstm = null;
	String query = "";
	ResultSet rs = null;
	ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

	// 내부클래스 (static) 생성 => private (외부접근불가)
	private static class SingleTon{
		// final 상수 선언(instance) => 반환타입 : MemberDao 객체
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	// 기본생성자 설정 => private (외부접근불가)
	private MemberDao(){
		System.out.println("MemberDao");
	}
	
	// getInstance 메소드 생성(public) => 반환타입 : MemberDao 객체 => 내부클래스(SingleTon)의 final상수 호출
	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
		
	}

	public int memberInsertDo(String userId, String userPw, String email) {

		try {
			conn = DBConnect.getConection();
			query = "insert into member1220(userid,userpw,email) values(?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, email);
			
			result = pstm.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if (conn!=null) conn.close();
					if (pstm!=null) pstm.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		
		return result;
	}

	public ArrayList<MemberDto> memberSelectDo() {
		
		try {
			conn = DBConnect.getConection();
			query = "select * from member1220";
			pstm = conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			if (rs!=null) {
				while(rs.next()) {
					lists.add(new MemberDto(rs.getString(1), rs.getString(2), rs.getString(3)));					
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if (conn!=null)
						conn.close();
					if (pstm!=null)
						pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		return lists;
	}

	public int memberUpdateDo(String userid, String userpw, String email) {
		
		try {
			conn = DBConnect.getConection();
			query = "update member1220 set userPw=?,email=? where userId=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userpw);
			pstm.setString(2, email);
			pstm.setString(3, userid);
			
			result = pstm.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if (conn!=null)
						conn.close();
					if (pstm!=null)
						pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		return result;
	}

	public int memberDeleteDo(String userid, String userpw) {
		
		try {
			conn = DBConnect.getConection();
			query = "delete from member1220 where userid=? and userpw=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			
			result = pstm.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if (conn!=null)
						conn.close();
					if (pstm!=null)
						pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return result;
	}
}
