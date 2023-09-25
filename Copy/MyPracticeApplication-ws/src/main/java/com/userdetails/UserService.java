package com.userdetails;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	@Autowired
	NamedParameterJdbcTemplate namedparameterjdbctemplate;

	@Autowired
	JdbcTemplate jdbctemplate;

	public Map<String, Object> addingUser(UserDetails userdetails) {
		String name = userdetails.getName();
		String mail = userdetails.getMail();
		String password = userdetails.getPassword();
		int age = userdetails.getAge();

		Map<String, Object> response = new HashMap();
		try {
			String query = "INSERT INTO userdetails (name,mail,password,age)VALUES(:userName,:usermail,:userPassword,:userAge)";
			SqlParameterSource sqlparametersource = new MapSqlParameterSource().addValue("userName", name)
					.addValue("usermail", mail).addValue("userPassword", password).addValue("userAge", age);
			int result = namedparameterjdbctemplate.update(query, sqlparametersource);
			if (result == 1) {
				response.put("msg", "inserted");
			} else {
				response.put("msg", "this data is mismatch");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	public Map<String, Object> updateUser(UserDetails userdetails) {
		Map<String, Object> response = new HashMap<>();
		try {
			int id = userdetails.getId();
			String name = userdetails.getName();
			String query = "UPDATE userdetails SET id=:userId WHERE name=:userName";
			SqlParameterSource sqlparametersource = new MapSqlParameterSource().addValue("userId", id)
					.addValue("userName", name);
			int result = namedparameterjdbctemplate.update(query, sqlparametersource);
			if (result == 1) {
				response.put("msg", "updated");
			} else {
				response.put("msg", "update failed");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;

	}

	public Map<String, Object> deleteUserById(int id) {
		Map<String, Object> response = new HashMap<>();
		try {

			String query = "DELETE FROM userdetails WHERE id=:Id";
			SqlParameterSource sqlparametersource = new MapSqlParameterSource().addValue("Id", id);
			int result = namedparameterjdbctemplate.update(query, sqlparametersource);
			if (result > 0) {
				response.put("msg", "**deleted success**");
			} else {
				response.put("msg", "!!delete failed!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	public List<Map<String, Object>> getEmail(UserDetails userdetails) {

		String query = "SELECT *FROM userdetails ";

		SqlParameterSource sqlparametersource = new MapSqlParameterSource().addValue(query, sqlparametersource);
		return namedparameterjdbctemplate.queryForList(query, sqlparametersource);

	}

	
}


