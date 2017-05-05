package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BookMapper;
import com.example.model.Book;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookMapper bookMapper;

	public void insertBook(Book book) {
		bookMapper.saveBook(book);
	}

	public Book getBookById(Integer isbn) {
		return null;
	}

	public List<Book> findAll() {
		return bookMapper.findAll();
	}

	public void updateBook(Book book) {
        bookMapper.updateBook(book);
	}

	public void deleteBook(Integer isbn) {

	}

}
