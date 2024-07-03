package com.ezwel.be.pilot.domain.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ezwel.be.pilot.domain.model.User;

@Mapper
public interface IUserRepository {
	
	public User selectUser(String username);
	
	@Select("select * from users")
	public List<User> selectUsers();

}
