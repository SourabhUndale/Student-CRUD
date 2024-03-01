package com.xadmin.SpringBootCrud.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	private int id;
	private String name;
	private String divsion;
	private String address;
	
	
	
	
	public Student() {
		super();
	}
	public Student(int id, String name, String divsion, String address) {
		super();
		this.id = id;
		this.name = name;
		this.divsion = divsion;
		this.address = address;
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
	public String getDivsion() {
		return divsion;
	}
	public void setDivsion(String divsion) {
		this.divsion = divsion;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
