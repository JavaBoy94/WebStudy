package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.project.dto.MemberDto;

public class MemberDao {
	
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	int result;
	ArrayList<MemberDto> lists = new ArrayList<>();

}
