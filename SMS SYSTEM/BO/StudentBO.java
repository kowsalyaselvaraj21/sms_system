package com.techymeet.SMS.BO;
public class StudentBO {
	 
	  int studentId;
	  String studentName;
      String emailId;
      String password;
      long Mobileno;
	  String Address;
	  String city;
	  String country;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId= studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String  emailId) {
		this.emailId = emailId;
	}
	public long getMobileno() {
		return Mobileno;
	}
	public void setMobileno(long mobileno) {
		this.Mobileno =mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password =password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}

	
