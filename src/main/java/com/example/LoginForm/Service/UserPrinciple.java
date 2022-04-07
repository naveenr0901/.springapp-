package com.example.LoginForm.Service;

import java.util.Collection;
import java.util.Collections;

import com.example.LoginForm.domain.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserPrinciple implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User login;
	

	public UserPrinciple(User login) {
		super();
		this.login = login;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() 
	{
		System.out.println("Role="+login.getRoles());
		
		return Collections.singleton(new SimpleGrantedAuthority("ROLE_"+login.getRoles()));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		
		return login.getPassword();
	}

	@Override
	public String getUsername() {
		
		return login.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
