package com.app.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private int userId;
	private String userName;
	private String pwd;
	private String firstName;
	private String lastName;
	private String role;
	private String emailId;
	
	
}