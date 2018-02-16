package com.dev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class UserDetails {
	@Column(name = "name")
	String name;
	@Id
	@Column(name = "email")
	String email;
	@Column(name = "city")
	String city;
	@Column(name = "file")
	byte[] file;

	public UserDetails() {
	}

	public UserDetails(String name, String email, String city, byte[] file) {
		this.name = name;
		this.email = email;
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
