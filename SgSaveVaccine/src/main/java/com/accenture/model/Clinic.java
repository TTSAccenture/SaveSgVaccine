package com.accenture.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Clinic {
	
	@Id
	@GeneratedValue	
	private int id;
	private String name;
	private String address;
	private int phno;
	private int dosecount;
	
	
	
	public Clinic() {
		
	}
	public Clinic(int id, String name, String address, int phno, int dosecount) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phno = phno;
		this.dosecount = dosecount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public int getDosecount() {
		return dosecount;
	}
	public void setDosecount(int dosecount) {
		this.dosecount = dosecount;
	}
	@Override
	public String toString() {
		return "Clinic [id=" + id + ", name=" + name + ", address=" + address + ", phno=" + phno + ", dosecount="
				+ dosecount + "]";
	}
	
	
	

}
