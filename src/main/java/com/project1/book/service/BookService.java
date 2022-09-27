package com.project1.book.service;

import java.util.List;

import com.project1.book.model.Book;
public interface BookService {
	
	 public Book findById(int id);

	public List<Book> getAllbookinfo();

	public Book insertBook(Book book);

	public void removeBookById(int id);

	public Book updateBookById(Book book, int id);	

}