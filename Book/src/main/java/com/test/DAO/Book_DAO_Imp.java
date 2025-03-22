package com.test.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.Entity.Book;
import com.test.repository.BookRepo;


@Repository
@Transactional
public class Book_DAO_Imp implements Book_DAO {
	
	@Autowired
	private  BookRepo repository; 
	
	@Override
	public Book createBook(Book book)
	{
		return repository.save(book);
	}
	
	@Override
	public List<Book> readAllBooks()
	{
		return repository.findAll();
	}
	
	@Override
	public List<Book> updateBook(Book book) {
		
		repository.save(book);
		return repository.findAll();
	}

	@Override
	public List<Book> deleteBook(int book_id) {
		
		repository.deleteById(book_id);
		
		return repository.findAll();
	}

	

	
	
	
}
