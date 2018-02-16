package com.dev.service;

import com.dev.model.UserPro;

public interface UserDetailsService {

	UserPro loadUserByUsername(String username) ;

}
