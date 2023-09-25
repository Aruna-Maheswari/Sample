package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import com.model.Employee;

@Service
public class EmployeeService {
	    @Autowired
		JdbcTemplate jdbc;     //Performing crud operations using jdbc template
	    
	    @Autowired
	    NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	    
	//Inserting the values	
	public int insert(Employee emp) {
		int empid=emp.getEmpid();
		String empname=emp.getEmpName();
		String empbranch=emp.getEmpbranch();
		String empphno=emp.getEmpphno(); 
		
		SqlParameterSource params = new Mapsql
		
		String s="insert into employee(id,name,branch,pnhno) values(:empid,:empname,:empbranch,:empphno)";
		return namedParameterJdbcTemplate.update(s,);
	}
	public int update(Employee emp) {
		String empname=emp.getEmpName();
		int empid=emp.getEmpid();
		String s=("update employe set empname=? where empid=?");
		return jdbc.update(s,empname,empid);
		}

}
