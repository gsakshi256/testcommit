package com.dev.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.model.UserPro;

@Repository
public interface UserRepo extends CrudRepository<UserPro, Long> {

	public UserPro findById(int id);

	public UserPro findByEmail(String email);
}
