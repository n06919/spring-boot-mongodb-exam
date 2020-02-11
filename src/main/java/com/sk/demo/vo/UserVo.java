package com.sk.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserVo {

	private String id;
	private String name;
	private String email;
	private String pwd;
	// getters and setters
}