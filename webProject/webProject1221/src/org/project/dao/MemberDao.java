package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.project.dbconnect.DBConnect;

public class MemberDao {
	
	Connection conn = null;
	PreparedStatement pstm = null;
	String query = "";
	int result = 0;
	ResultSet rs = null;
	
	
	private static class Singleton {
		private static MemberDao INSTANCE = new MemberDao();
	}
	
	private MemberDao() {
		System.out.println("MemberDao");
	}

	public static MemberDao getInstance() {
		return Singleton.INSTANCE;
	}

	public int login1221InsertDo(String userid, String userpw, String gender, String hobbys, String city, String memo) {
		
		try {
			conn = DBConnect.getConection();
			query = "insert into login1221(userid,userpw,gender,hobbys,city,memo)"
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

	public int login1221OkDo(String userid, String userpw) {
		
		try {
			conn = DBConnect.getConection();
			query = "select count(*) from login1221 where userid=? and userpw=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userid);
			pstm.setString(2, userpw);
			
			rs = pstm.executeQuery();
			
			if (rs!=null) {
				while (rs.next()) {
					result=rs.getInt(1);					
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
}
