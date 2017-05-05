package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.model.Book;

@Mapper
public interface BookMapper {

	@Select("SELECT * FROM BOOKS") // SQL
	List<Book> findAll();

	@Select("SELECT * FROM BOOKS WHERE GENRE = #{genre}")
	List<Book> findByGenre(@Param("genre") String genre);
	
	
	//@Insert("INSERT INTO BOOKS (ISBN, TITLE, AUTHOR, GENRE, PRICE, DESCRIPTION)VALUES(#{isbn}, #{title},#{author},#{genre},#{price},#{description})")
	void saveBook(Book book);
		
    @Update("UPDATE BOOKS SET AUTHOR=#{author},GENRE=#{genre} where ISBN=#{isbn} ")
	void updateBook(Book book);
	
//	@Delete("DELETE FROM BOOKS WHERE ISBN =#{isbn}")
	void deleteBook(Book book);
	
	}