package org.project.dto;

public class TestTb1219Dto {
	
	private String userId;
	private String userPw;
	private String userName;
	private String gender;
	private String hobbys;
	private String phone;
	private String memo;
	
	public TestTb1219Dto(String userId, String userPw, String userName, String gender, String hobbys, String phone,
			String memo) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.gender = gender;
		this.hobbys = hobbys;
		this.phone = phone;
		this.memo = memo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobbys() {
		return hobbys;
	}

	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	
	

}
