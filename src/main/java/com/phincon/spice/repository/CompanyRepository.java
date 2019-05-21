package com.phincon.spice.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.phincon.spice.common.utility.Log;

@Repository
public class CompanyRepository {
	
	@Autowired
	private JdbcTemplate c3p0JdbcTemplate;
	
	@Value("${phincon.spice.table.company}")
	private String companyTableName;
	
	public String getProfileCompany(String companyName) {
		Map<String, Object> row = null;
		try {
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT * FROM "+companyTableName+ " WHERE company_name = ?";
			
			query.append(sql);
			
			Log.getLogger().debug(String.format("Executing query getProfileCompany: %s with param:companyName=%s", query.toString(),companyName));
			
			row = c3p0JdbcTemplate.queryForMap(sql, companyName);
			
		}catch (EmptyResultDataAccessException e) {
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		if (row == null)
			return null;
		
		String desc_1 = (String) row.get("description_1");
		String desc_2 = (String) row.get("description_1");
		String result = desc_1.concat("##").concat(desc_2);
		
		return result;
	}

}
