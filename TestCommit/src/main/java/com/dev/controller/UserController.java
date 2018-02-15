package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.model.UserPro;
import com.dev.repo.UserRepo;

@RestController
public class UserController {
	@Autowired
	UserRepo userrepo;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public @ResponseBody Iterable<UserPro> getAllUsers() {
		return userrepo.findAll();
	}

}
