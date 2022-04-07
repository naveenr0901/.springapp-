package com.example.LoginForm.Service;

import com.example.LoginForm.domain.User;
import com.example.LoginForm.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;





@Service
public class UserServices implements UserDetailsService
{
	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User login=repo.findByUsername(username);
		
		
		if(login==null)
			throw new UsernameNotFoundException("404 user");
		
		return new UserPrinciple(login);
	}
}
