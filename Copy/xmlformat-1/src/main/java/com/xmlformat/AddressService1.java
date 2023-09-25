package com.xmlformat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import com.details.AddressDetails;

@Service
public class AddressService1 {
	@Autowired
	NamedParameterJdbcTemplate namedparameterjdbctemplate;
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Map<String,Object> addingAddress(AddressDetails12 addressdetails)
	{
	  
	  String address=addressdetails.getAddress();
	  String state=addressdetails.getState();
	  int pincode=addressdetails.getPincode();
		
	Map<String,Object> response=new HashMap<>();	
	try
	{
		String query="INSERT INTO addressdetails(address,state,pincode)VALUES(:useraddress,:userstate,:userpincode)";
		SqlParameterSource sqlparametersource = new MapSqlParameterSource().addValue("useraddress",address).addValue("userstate",state).addValue("userpincode",pincode);
		int result=namedparameterjdbctemplate.update(query,sqlparametersource);
		if(result==1)
		{
			response.put("msg", "inserted");
		}
		else
		{
			response.put("msg", "this data is mismatch");
		}
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return response;
	}
	 public Map<String,Object> updateAddress(AddressDetails12 addressdetails)
	  {
	       Map<String,Object> response=new HashMap<>();
	       try
	       {
	    	   int id=addressdetails.getId();
	    	   String address=addressdetails.getAddress();
	    	   String query="UPDATE addressdetails SET id=:Id WHERE address=:useraddress";
	    	   SqlParameterSource sqlparametersource = new MapSqlParameterSource().addValue("Id",id).addValue("useraddress", address);
	    	   int result=namedparameterjdbctemplate.update(query,sqlparametersource);
	    	   if(result==1)
	   		{
	   			response.put("msg", "updated");
	   		}
	   		else
	   		{
	   			response.put("msg", "update failed");
	   		}
	   		
	   	}
	   	catch(Exception e)
	   	{
	   		e.printStackTrace();
	   	}
	   	return response;
	    	   
	       }
	 public Map<String,Object> deleteaddressById(int id)
	  {
	       Map<String,Object> response=new HashMap<>();
	       try
	       {
	    	  
	    	   
	    	   String query="DELETE FROM addressdetails WHERE id=:Id";
	    	   SqlParameterSource sqlparametersource = new MapSqlParameterSource().addValue("Id", id);
	    	   int result=namedparameterjdbctemplate.update(query,sqlparametersource);
	    	   if(result>0)
	   		{
	   			response.put("msg", "deleted");
	   		}
	   		else
	   		{
	   			response.put("msg", "delete failed");
	   		}
	   		
	   	}
	   	catch(Exception e)
	   	{
	   		e.printStackTrace();
	   	}
	   	return response;

}
	 public List<Map<String,Object>> getAddressById(int id)
	  {
		  String query="SELECT *FROM addressdetails WHERE id=:Id";
		  SqlParameterSource sqlparametersource = new MapSqlParameterSource().addValue("Id", id);
		  return namedparameterjdbctemplate.queryForList(query,sqlparametersource);
		  
	  }
	 public Map<String, Object> retrieveAddress() {

			Map<String, Object> response = new HashMap<>();

			try {
				List<Map<String, Object>> finalList = new ArrayList<>();

				String query = "SELECT address,state,pincode,date FROM addressdetails ";

				List<Map<String, Object>> addressList = jdbcTemplate.queryForList(query);

				for (Map<String, Object> map : addressList) {

					
					String address = (String) map.get("address");
					String state = (String) map.get("state");
					int pincode = (Integer) map.get("pin");
					LocalDateTime date = (LocalDateTime) map.get("date");

					Map<String, Object> Map = new HashMap<>();
					Map.put("address", address);
					Map.put("state", state);
					Map.put("pin", pincode);
					Map.put("date", date);

					finalList.add(Map);
					System.out.println( address + " " + state + " " + pincode + " " + date);

				}

				response.put("userAddressList", finalList);

			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return response;

		}
	
}
