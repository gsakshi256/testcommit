package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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

	@RequestMapping(value = "/getbyid/{id}")
	@ResponseBody
	public UserPro getuserByemail(@PathVariable int id) {
		UserPro user = userrepo.findById(id);
		return user;
	}

	@RequestMapping(value = "/updateuser")
	public UserPro updateUser(@RequestBody UserPro userpro) {
		UserPro user = userrepo.findById(userpro.getId());
		if (user != null) {
			user.setName(userpro.getName());
			user.setEmail(userpro.getEmail());
			user.setCity(userpro.getCity());
			user.setRole(userpro.getRole());

		}
		return user;
	}

}
