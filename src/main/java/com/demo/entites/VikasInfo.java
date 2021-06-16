package com.demo.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vikas_info")
public class VikasInfo implements Serializable {
	@Id
	@Column(name = "vikas_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int vikasId;
	protected int height;
	protected int age;
	@Column(name = "mobile_no")
	protected String mobileNo;
	@Column(name = "email_add")
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

}
