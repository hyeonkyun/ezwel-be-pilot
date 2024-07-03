package com.ezwel.be.pilot.service;

import java.util.List;

import com.ezwel.be.pilot.domain.model.User;

public interface IUserService {

	public User getUser(String userName) throws Exception;
	
	public List<User> getUsers() throws Exception;
}
