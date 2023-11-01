package com.app.enrollment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "student")
@Data

public class Student  {
	
	@Id
	private Integer student_id;
	private String classes;	
	private String name;				
	private String father_name;		
	private String gender;
    private int dob;		
	private String emailid;	
	private String mobile_no;	
	private String address;
	private int pincode;		
	private String password;	
	
	public Student() {
		
	}

	public Student( int student_id, String classes, String name, String father_name,
			String gender, int dob, String emailid, String mobile_no, String address, int pincode,
			String password) {
		super();
		this.student_id = student_id;
		this.classes = classes;
		this.name = name;
		this.father_name = father_name;
		this.gender = gender;
		this.dob = dob;
		this.emailid = emailid;
		this.mobile_no = mobile_no;
		this.address = address;
		this.pincode = pincode;
		this.password = password;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [ student_id=" + student_id + ", classes=" + classes
				+ ", name=" + name + ", father_name=" + father_name + ", gender=" + gender + ", dob=" + dob
				+ ", emailid=" + emailid + ", mobile_no=" + mobile_no + ", address=" + address + ", pincode=" + pincode
				+ ", password=" + password + "]";
	}
		
}
