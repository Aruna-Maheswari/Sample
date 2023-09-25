 
package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.book.Book;

@Service
public class BookService {

	@Autowired
	JdbcTemplate jdbctemplate;
	private PreparedStatementSetter bookId;
	
//inserting
	public Map<String, Object> addBookDetails(Book book) {
		Map<String, Object> response = new HashMap();
		try {
			int bookId = book.getBookId();
			String bookName = book.getBookName();
			String bookPrice = book.getBookPrice();
			String s = "insert into BookDetails values(?,?,?)";
			int result = jdbctemplate.update(s, bookId, bookName, bookPrice);
			if (result > 0) {
				response.put("msg", "insertion success");
			} else {
				response.put("msg", "not inserted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
	}
//Updating
	public Map<String, Object> updateBookDetails(Book book) {
		Map<String, Object> response = new HashMap<>();
		try {
			int bookId = book.getBookId();
			String bookName = book.getBookName();
			String query = "UPDATE bookDetails set bookName=? WHERE bookId=?";
			int result = jdbctemplate.update(query, bookName, bookId);
			if (result > 0) {
				response.put("msg", "updated success");
			} else {
				response.put("msg", "it is invalid bookId");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;

	}
//deleting
	public Map<String, Object> deletebookDetails(int id) {
		Map<String, Object> response = new HashMap<>();
		try {
			// String query="Delete from bookDetails where bookId=?";
			int result = jdbctemplate.update("Delete from bookDetails where bookId=" + bookId);
           
			if (result > 0) {
				response.put("yaah!", "record deleted");
			} else {
				response.put("msg", " record available by this id");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return response;
 
	}
//retrieving
	public List<Map<String, Object>> getBookByIdandName(int bookId) {
		List<Map<String, Object>> response = new ArrayList<>();
		try {
			String query = "select * from bookDetails where 3=3";
			
			if(bookId>0)
			{
				query +=" and bookId=?";
			}
			//if(name != null)
			//{
				//query +=" and bookName=?";
			//}
			
			response = jdbctemplate.queryForList(query,bookId);


		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return response;
	}


}

