package com.dev.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.model.UserPro;

@Repository
public interface UserRepo extends CrudRepository<UserPro, String> {

	public UserPro findById(int id);
}
