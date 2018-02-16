package com.dev.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.model.File;
import com.dev.repo.FileRepo;

@RestController
public class BaseController {
	@Autowired
	FileRepo fileRepo;

	@RequestMapping(value = "/baseImage", method = RequestMethod.POST)
	public @ResponseBody String baseimage(@RequestParam("baseimage") String encodedImage, @RequestParam("id") int id) {
		byte[] imageByte = Base64.getDecoder().decode(encodedImage);
		File file = new File();
		file.setFile(imageByte);
		file.setId(id);
		fileRepo.save(file);
		return null;
	}

	@RequestMapping(value = "/object", method = RequestMethod.POST)
	public @ResponseBody String object(@RequestBody File file) {
		String encodedImage = file.getFile1();
		byte[] imageByte = Base64.getDecoder().decode(encodedImage);
		file.setFile(imageByte);
		fileRepo.save(file);
		return "success";
	}
}
