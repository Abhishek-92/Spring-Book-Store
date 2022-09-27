package com.project1.book.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project1.book.model.Book;
import com.project1.book.service.BookService;


@RestController
@RequestMapping("/api")
public class WebController {
	
	    @Autowired
	    BookService bookService;
	
	    @RequestMapping(path="/hello",method=RequestMethod.GET)
	    public String sayHello() {
	    	return ("Hello world from Rest");
	    }
	
	    @GetMapping(path="/book/{id}")
         public Book getBookById(@PathVariable int id) {
	    	 
	    	return bookService.findById(id);	    	
	    }
	    @GetMapping(path="/book")
         public List<Book> getAllCars(){
	    	   return bookService.getAllbookinfo();
	    }
	    
	    @PostMapping(path="/book")
	    public Book insertBook (@RequestBody Book book) {
	    	return   bookService.insertBook(book);
	    }
	    
	    @DeleteMapping("/book/{id}")
	   public void removeBookById(@PathVariable int id) {
		   
	    	bookService.removeBookById(id);
	   }
	    @PutMapping("/book/{id}")
	    public Book updateCar (@RequestBody Book book,@PathVariable int id) {
	    	return bookService.updateBookById(book,id);
	    }
	    

}
