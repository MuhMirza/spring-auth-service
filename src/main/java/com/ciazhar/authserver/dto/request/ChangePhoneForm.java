package com.ciazhar.authserver.dto.request;

public class ChangePhoneForm {

	private String id;
	private String phone;
	
	public ChangePhoneForm() {
	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}