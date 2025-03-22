package com.test.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.Entity.Book;
import com.test.Service.Book_service;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")


public class Controller {

	@Autowired
	private Book_service bookservice;
	
	
	public void setBookservice(Book_service bookservice) {
		this.bookservice = bookservice;
	}

	@PostMapping("/create")
	public ResponseEntity<Book> saveBook(@RequestBody Book book) {
		 
		Book bdata=bookservice.createBook(book);
		return new ResponseEntity<>(bdata, HttpStatus.NO_CONTENT);
		
	}
	
	@GetMapping("/books-list")
	public List<Book> listallbooks() {
		 return bookservice.readAllBooks();
	}
	
	@PutMapping("/update-book/{book_id}")
	public List<Book> updateBook(@RequestBody Book book,@PathVariable("book_id") int book_id) 
	{
		book.setBook_id(book_id);
		return bookservice.updateBook(book);
	}
	
	@DeleteMapping("/delete-book/{book_id}")
	public List<Book> deleteBook(@PathVariable("book_id") int book_id) {
		return bookservice.deleteBook(book_id);
	}

}
	

