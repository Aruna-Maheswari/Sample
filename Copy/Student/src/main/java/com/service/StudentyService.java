package com.service;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Jdbc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import com.model.Student;

@Service
public class StudentyService<SET> {

	// private static final String UPDATE = null;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	private List<Map<String, Object>> data;

	public List<Map<String, Object>> getData() {
		try {
			List<Map<String, Object>> data = new ArrayList<>();

			data = jdbcTemplate.queryForList("SELECT * FROM student");

			// System.out.println(data);

			// return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public String addStudent(Student s) {
		try
		{
		String sql = "INSERT INTO student(id,name) VALUES(:id,:name)";

		SqlParameterSource param = new MapSqlParameterSource().addValue("id", s.getId()).addValue("name", s.getName());

		int response = namedParameterJdbcTemplate.update(sql, param);

		if (response > 0) {
			return "Add";
		} else {
			return "Not";
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public String update(Student s) {

		String sql = "UPDATE student set name=:name WHERE id=:id";

		SqlParameterSource param = new MapSqlParameterSource().addValue("id", s.getId()).addValue("name", s.getName());

		int response = namedParameterJdbcTemplate.update(sql, param);

		if (response > 0) {
			return "updated";
		} else {
			return "Not";
		}
	}

	public String delete(int id) {

		int resp = jdbcTemplate.update("DELETE FROM student WHERE id=" + id);

		if (resp > 0) {
			return "Record Deleted";
		} else {
			return "Not";
		}
	}

}
