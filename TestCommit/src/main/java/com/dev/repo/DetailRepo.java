package com.dev.repo;

import org.springframework.data.repository.CrudRepository;

import com.dev.model.UserDetails;
import com.dev.model.UserPro;

public interface DetailRepo extends CrudRepository<UserDetails, String> {

	public UserPro findByEmail(String email);

}
