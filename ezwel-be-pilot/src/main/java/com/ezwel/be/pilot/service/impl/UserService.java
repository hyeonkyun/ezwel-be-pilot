package com.ezwel.be.pilot.service.impl;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezwel.be.pilot.domain.model.User;
import com.ezwel.be.pilot.domain.repository.IUserRepository;
import com.ezwel.be.pilot.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired 
	IUserRepository userRepository;
	
	@Override
	public User getUser(String username) throws Exception {
		return userRepository.selectUser(username);		 
	}

	@Override
	public List<User> getUsers() throws Exception {
		return userRepository.selectUsers();
	}
}
