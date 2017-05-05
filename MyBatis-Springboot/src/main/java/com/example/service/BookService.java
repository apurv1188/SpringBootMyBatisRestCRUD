package com.example.service;

import java.util.List;

import com.example.model.Book;

public interface BookService {

	public void insertBook(Book book);

	public Book getBookById(Integer isbn);

	public List<Book> findAll();

	public void updateBook(Book book);

	public void deleteBook(Integer isbn);

}
