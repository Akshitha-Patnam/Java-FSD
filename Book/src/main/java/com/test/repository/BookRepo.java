package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.test.Entity.Book;
//@Repository
@Transactional
public interface BookRepo extends JpaRepository<Book, Integer> {

}
