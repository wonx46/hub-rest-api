package com.phincon.spice.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.phincon.spice.common.utility.Log;

@Repository
public class HolidayRepository {

	@Autowired
	private JdbcTemplate c3p0JdbcTemplate;
	
	@Value("${phincon.spice.table.holiday}")
	private String holidayTableName;
	
	public List<String> listHoliday() {
		List<String> listHoliday = new ArrayList<>();
		List<Map<String, Object>> listRow;
		try {
			StringBuilder query = new StringBuilder();
			
			String sql = " SELECT * FROM "+holidayTableName+ " WHERE DATE(holiday_date) >  DATE(CURDATE()) "
					+ " AND (DAYNAME(holiday_date) != 'Saturday' && DAYNAME(CURDATE()) != 'Sunday') ";
			
			query.append(sql);
			
			Log.getLogger().debug(String.format("Executing query listHolidayForThisMonth", query.toString()));
			listRow = c3p0JdbcTemplate.queryForList(sql);
			for(Map<String, Object> row : listRow) {
				String holiday_date = (String) row.get("holiday_date").toString();
				String description = (String) row.get("description");
				listHoliday.add(holiday_date.concat("#").concat(description));
			}
			System.out.println(listRow);
		}catch (EmptyResultDataAccessException e) {
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return listHoliday;
	}
}
