package com.ezwel.be.pilot.domain.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {

	private static final long serialVersionUID = -8199727816205478220L;

	private Long id;
	private String user_name;
	private String user_password;
}
