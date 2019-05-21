package com.phincon.spice.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.phincon.spice.common.utility.Log;
import com.phincon.spice.model.User;

@Repository
public class UserRepository {

	
	@Autowired
	private JdbcTemplate c3p0JdbcTemplate;
	
	@Value("${phincon.spice.table.user}")
	private String userTableName;
	
	public User getUser(String userName) {
		Map<String, Object> row = null;
		try {
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT * FROM "+userTableName+ " WHERE user_name = ?";
			
			query.append(sql);
			
			Log.getLogger().debug(String.format("Executing query getUser: %s with param:userName=%s", query.toString(),userName));
			
			row = c3p0JdbcTemplate.queryForMap(sql, userName);
			
		}catch (EmptyResultDataAccessException e) {
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		if (row == null)
			return null;
		
		User user = new User();
		user.setUserName((String) row.get("user_name"));
		user.setPassword((String) row.get("password"));
		
		return user;
	}
}
