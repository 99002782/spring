package com.bookapp.service;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface BookService{
	Book addBook(Book book);
    boolean deleteBook(Integer bookid) throws BookNotFoundException;
    Book getBookById(Integer bookid) throws BookNotFoundException;
    Book updateBook(Book book);
   
    List<Book> getAllBooks();
    List<Book> getBookbyAuthor(String author) throws BookNotFoundException;
    List<Book> getBookbycategory(String category)throws BookNotFoundException;
    @Query("from Book b where b.title=?1 and price>?2")
    List<Book> findBookByTitleAndPrice(String title,Double price);
    
    List<Book> findByTitleAndAuthor(String title,String author);
 
}