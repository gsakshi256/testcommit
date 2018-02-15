package com.dev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userpro")
public class UserPro {
	@Column(name = "name")
	String name;
	@Id
	@Column(name = "email")
	String email;
	@Column(name = "age")
	int age;
	@Column(name = "city")
	String city;
	@Column(name = "file")
	byte[] file;

	public UserPro() {
	}

	public UserPro(String name, String email, int age, String city, byte[] file) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.city = city;
		this.file = file;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

}
