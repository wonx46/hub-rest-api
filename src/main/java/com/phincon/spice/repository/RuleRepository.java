package com.phincon.spice.repository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.phincon.spice.common.utility.Log;
import com.phincon.spice.model.Rule;
import com.phincon.spice.model.User;

@Repository
public class RuleRepository {

	
	@Autowired
	private JdbcTemplate c3p0JdbcTemplate;
	
	@Value("${phincon.spice.table.rule}")
	private String ruleTableName;
	
	public Rule getRule(String ruleName) {
		Map<String, Object> row = null;
		try {
			StringBuilder query = new StringBuilder();
			
			String sql = "SELECT * FROM "+ruleTableName+ " WHERE rule_name = ?";
			
			query.append(sql);
			
			Log.getLogger().debug(String.format("Executing query getRule: %s with param:ruleName=%s", query.toString(),ruleName));
			
			row = c3p0JdbcTemplate.queryForMap(sql, ruleName);
			
		}catch (EmptyResultDataAccessException e) {
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		if (row == null)
			return null;
		
		Rule rule = new Rule();
		rule.setName((String) row.get("rule_name"));
		rule.setDesc_1((String) row.get("description_1"));
		rule.setDesc_2((String) row.get("description_2"));
		
		return rule;
	}
}
