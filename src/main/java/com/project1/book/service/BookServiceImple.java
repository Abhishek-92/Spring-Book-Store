package com.project1.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.book.dao.BookRepository;
import com.project1.book.model.Book;

@Service
public class BookServiceImple implements BookService {
 
	@Autowired
	BookRepository bookRepo;
	
	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		return bookRepo.findById(id).get();
	}

	@Override
	public List<Book> getAllbookinfo() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public Book insertBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}

	@Override
	public void removeBookById(int id) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(id);
	}

	@Override
	public Book updateBookById(Book book, int id) {
		// TODO Auto-generated method stub
		Book toUpdate = bookRepo.findById(id).get();
		toUpdate.setTitle(book.getTitle());
		toUpdate.setAuthor(book.getAuthor());
		toUpdate.setPrice(book.getPrice());
		toUpdate.setGenre(book.getGenre());
	
		return bookRepo.save(toUpdate);
	}
	
	
}
