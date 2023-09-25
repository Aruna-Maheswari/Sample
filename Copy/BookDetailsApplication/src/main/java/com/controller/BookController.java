package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.book.Book;
import com.service.BookService;

@RestController
public class BookController {
	@Autowired
	BookService bookservice;

	@PostMapping("/bookDetails")
	public Map<String, Object> addBookDetails(@RequestBody Book book) {

		return bookservice.addBookDetails(book);

	}

	@PutMapping("/bookDetails")
	public Map<String, Object> updateBookDetails(@RequestBody Book book) {
		return bookservice.updateBookDetails(book);
	}

	@DeleteMapping("/bookDetails/{id}")
	public Map<String, Object> deletebookDetails(@PathVariable int bookId) {
		return bookservice.deletebookDetails(bookId);
	}
	@GetMapping("/bookDetails/{id}")
	public List<Map<String,Object>> getbookByIdandName(@PathVariable int bookId)
			{
		        return bookservice.getBookByIdandName(bookId);
			}
	
	
	
	
}

