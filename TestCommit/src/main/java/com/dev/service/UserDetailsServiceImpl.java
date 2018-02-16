//package com.dev.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.dev.model.UserPro;
//import com.dev.repo.UserRepo;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//	@Autowired
//	private UserRepo userrepo;
//	@Autowired
//	private UserPro userpro;
//
//	@Override
//	@Transactional(readOnly = true)
//	public UserPro loadUserByUsername(String email) throws BadCredentialsException, UsernameNotFoundException {
//	
//		UserRepo user = (UserRepo) userrepo.findByEmail(email);
//		
//		String role =userpro.getRole();
//		
//		List<GrantedAuthority> auth = AuthorityUtils.commaSeparatedStringToAuthorityList(role.getName());
//		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), auth);
//	}
//}
