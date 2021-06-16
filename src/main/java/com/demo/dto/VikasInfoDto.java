package com.demo.dto;

public class VikasInfoDto {

	protected int vikasId;
	protected int height;
	protected int age;
	protected String mobileNo;
	protected String emailAddress;

	public int getVikasId() {
		return vikasId;
	}

	public void setVikasId(int vikasId) {
		this.vikasId = vikasId;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "VikasInfoDto [vikasId=" + vikasId + ", height=" + height + ", age=" + age + ", mobileNo=" + mobileNo
				+ ", emailAddress=" + emailAddress + "]";
	}

}
