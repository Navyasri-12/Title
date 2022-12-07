package com.app.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.pojo.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
	 
		User uObj = new User();
		 
		uObj.setUserName(rs.getString("userName"));
		uObj.setPwd(rs.getString("pwd"));
		uObj.setFirstName(rs.getString("firstName"));
		uObj.setLastName((rs.getString("lastName")));
		uObj.setRole(rs.getString("role"));
		uObj.setEmailId(rs.getString("emailId"));
		uObj.setUserId(rs.getInt("userId"));
		return uObj;
	}

}
