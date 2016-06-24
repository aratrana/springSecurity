package com.arat.budget.service;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.arat.budget.dao.UserDao;
import com.arat.budget.model.UserRoles;


//@Service(value = "userService")
public class HbUserDetailsService implements UserDetailsService {
	private UserDao userDao;
	 
	@SuppressWarnings("unchecked")
	public UserDetails loadUserByUsername(final String username) 
               throws UsernameNotFoundException {
 
		com.arat.budget.model.Users user = userDao.findByUserName(username);
		List<GrantedAuthority> authorities = buildUserAuthority(user.getUserRoleses());
 
		return buildUserForAuthentication(user, authorities);
 
 
	}
 
	// Converts com.mkyong.users.model.User user to
	// org.springframework.security.core.userdetails.User
	private User buildUserForAuthentication(com.arat.budget.model.Users user, 
		List<GrantedAuthority> authorities) {
		return new User(user.getUsername(), 
			user.getPassword(), user.isEnabled(), 
                        true, true, true, authorities);
	}
 
	private List<GrantedAuthority> buildUserAuthority(Set<UserRoles> userRoles) {
 
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
 
		// Build user's authorities
		for (UserRoles userRole : userRoles) {
			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
 
		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);
 
		return Result;
	}
 
	public UserDao getUserDao() {
		return userDao;
	}
 
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
