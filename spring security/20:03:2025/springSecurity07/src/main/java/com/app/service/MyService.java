package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.app.UserDetailsImpl;
import com.app.dao.UserRepo;
import com.app.entity.User;


@Service
public class MyService implements UserDetailsService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		Optional<User> opt = userRepo.findByUsername(username);
		if(opt.isPresent()) {
			User user=opt.get();
			
			System.out.println(user);
			
			return new UserDetailsImpl(user);
			
		}else {
			//exp throw
			throw new UsernameNotFoundException("USER NOT FOUND");
		}
	}
	
	
	
	
	
}