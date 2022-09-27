package com.project1.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.book.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
