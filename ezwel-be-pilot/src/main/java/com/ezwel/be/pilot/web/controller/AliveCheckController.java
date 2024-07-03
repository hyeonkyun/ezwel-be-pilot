package com.ezwel.be.pilot.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ezwel.be.pilot.domain.model.User;
import com.ezwel.be.pilot.service.IUserService;

@RestController
public class AliveCheckController {

	@Autowired
	IUserService userService;

	@GetMapping("/alive")
	public Map<String, Object> alive() throws Exception {
		System.out.println("=========== [/alive in] ===========");
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("responseCode", "1000");
		response.put("responseMessage", "alive");
		
		List<User> users = userService.getUsers();		
		
		response.put("responseData", users);
		
		return response;
	}
}
