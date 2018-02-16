package com.dev.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dev.model.UserDetails;
import com.dev.repo.DetailRepo;
import com.google.gson.Gson;

@RestController
public class FileController {
	@Autowired
	DetailRepo detailRepo;

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = { "multipart/form-data",
			"application/json" })
	public UserDetails adduserf(@RequestParam(value = "file") MultipartFile file,
			@RequestParam(value = "user") String userdetail) throws IOException {
		Gson gson = new Gson();
		UserDetails user = gson.fromJson(userdetail, UserDetails.class);
		byte[] contents = file.getBytes();
		user.setFile(contents);
		detailRepo.save(user);
		return user;
	}

}
