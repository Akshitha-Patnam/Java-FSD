package com.test.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.test.Entity.Book;
@Component
public interface Book_service {
	

	public Book createBook(Book book);
	public List<Book> readAllBooks();
	public List<Book> updateBook(Book book);
	public List<Book> deleteBook(int book_id);
	
}
