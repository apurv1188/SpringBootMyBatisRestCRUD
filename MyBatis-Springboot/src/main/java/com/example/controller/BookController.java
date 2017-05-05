package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.service.BookService;


@RestController
@RequestMapping("books")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(method=RequestMethod.POST)
	public Book create(@RequestBody Book book){
		bookService.insertBook(book);
		return book;
	}

	@RequestMapping(method=RequestMethod.GET)
	public List<Book> books() {
		return bookService.findAll();
	}

	@RequestMapping("/books/{isbn}")
	public Book bookByIsbn(@PathVariable("isbn") Integer isbn) {
		return bookService.getBookById(isbn);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Book update(@RequestBody Book book ) {
		bookService.updateBook(book);
		return book;
	}
	
	
	
	
	
	
	
		}