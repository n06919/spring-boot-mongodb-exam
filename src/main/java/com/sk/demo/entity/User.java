package com.sk.demo.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	@Id
	private String id;

	private String name;
	private String email;
	private String pwd;
	// getters and setters
}