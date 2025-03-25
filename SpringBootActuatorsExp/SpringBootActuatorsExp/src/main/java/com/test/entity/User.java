package com.test.entity;

import org.springframework.beans.factory.annotation.Value;

public class User {
	
	
	private String fname;
	
	private String email;
	

	private String desgrole;
	
	
	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDesgrole() {
		return desgrole;
	}


	public void setDesgrole(String desgrole) {
		this.desgrole = desgrole;
	}


	@Override
	public String toString() {
		return "User [fname=" + fname + ", email=" + email + ", desgrole=" + desgrole + "]";
	}

	
	
}
