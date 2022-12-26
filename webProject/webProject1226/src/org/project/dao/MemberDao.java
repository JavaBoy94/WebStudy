package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.project.dbconnect.DBConnect;
import org.project.dto.MemberDto;

public class MemberDao {
	
	Connection conn = null;
	PreparedStatement pstm = null;
	String query = "";
	ResultSet rs = null;
	int result = 0;
	ArrayList<MemberDto> members = new ArrayList<MemberDto>();
	
	
	private static class SingleTon{
		private static final MemberDao INSTANCE = new MemberDao();
	}

	private MemberDao() {
		System.out.println("MemberDao");
	}
	
	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}

	public int memberInsertDo(String userid, String userpw, String gender, String hobbys, String city, String memo) {
		
		try {
			conn = DBConnect.getConection();
			query = "insert into login1223(userid,userpw,gender,hobbys,city,memo)"
					+ "values(?,?,?,?,?,?)";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			pstm.setString(3, gender);
			pstm.setString(4, hobbys);
			pstm.setString(5, city);
			pstm.setString(6, memo);
			
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

	public int loginOkDo(String userid, String userpw) {

		try {
			conn = DBConnect.getConection();
			query = "select count(*) from login1223 where userid=? and userpw=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			
			rs = pstm.executeQuery();
			
			if (rs!=null) {
				while(rs.next()) {
					result = rs.getInt(1);
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
		
		return result;
	}

	public MemberDto memberInfo(String userid) {
		MemberDto member=null;
		
		System.out.println("userId"+ userid);
		try {
			conn = DBConnect.getConection();
			query = "select * from login1223 where userid=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userid);
			
			rs = pstm.executeQuery();
			
			if (rs!=null) {
				while(rs.next()) {
				member=new MemberDto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
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
		return member;
	}
}
