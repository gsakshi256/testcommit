package com.dev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "basefile")
public class File {
	@Id
	@Column(name = "id")
	int id;
	@Lob
	@Column(name = "file")
	byte[] file;

	String file1;

	public File() {
	}

	public File(byte[] file, int id, String file1) {
		this.file = file;
		this.id = id;
		this.file1 = file1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFile1() {
		return file1;
	}

	public void setFile1(String file1) {
		this.file1 = file1;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

}
