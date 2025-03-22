package com.test.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.DAO.Book_DAO;
import com.test.Entity.Book;
import com.test.Service.Book_service;


@Service
@Transactional
public class Book_Service_Imp implements Book_service{
	
	@Autowired
	private Book_DAO bookdao;
	
	
	public void setBookDao(Book_DAO bookdao) {
		this.bookdao = bookdao;
	}

	@Override
	public Book createBook(Book book) {
		return bookdao.createBook(book);
	}

	@Override
	public List<Book> readAllBooks() {
		
		List<Book> list = bookdao.readAllBooks();
		
		
		if(list.size() < 0)
		{
			System.out.println("no content");
		}
		
		return list;
	}

	@Override
	public List<Book> updateBook(Book book) {
		
		bookdao.updateBook(book);
		
		
		return bookdao.readAllBooks();
	}

	@Override
	public List<Book> deleteBook(int book_id) {
		
		bookdao.deleteBook(book_id);
		
		
		return bookdao.readAllBooks();
	}

}

