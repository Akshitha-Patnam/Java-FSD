package com.test.DAO;

import java.util.List;

import com.test.Entity.Book;

public interface Book_DAO {
	
	public Book createBook(Book book);
	public List<Book> readAllBooks();
	public List<Book> updateBook(Book book);
	public List<Book> deleteBook(int book_id);
	

}
