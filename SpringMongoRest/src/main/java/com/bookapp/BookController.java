package com.bookapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;

@RestController
@RequestMapping("/book-api")
public class BookController {
	@Autowired
	BookService bookService;
	@PostMapping("/books")
	Book addBook(@RequestBody Book book) {
		// TODO Auto-generated method stub
		return bookService.addBook(book);
		
	}
	@DeleteMapping("/books/delete-one/{bookId}")
    boolean deleteBook(@PathVariable("bookId")Integer bookId) throws BookNotFoundException{
		// TODO Auto-generated method stub
		  // TODO Auto-generated method stub
		 // TODO Auto-generated method stub
		return bookService.deleteBook(bookId);
       
	}
	@GetMapping("/books/get-one/{bookId}")
Book getBookById(@PathVariable("bookId")Integer bookid) throws BookNotFoundException {
		// TODO Auto-generated method stub
return bookService.getBookById(bookid);
	}
	@PutMapping("/books/update-one")
	Book updateBook(Book book) {
		// TODO Auto-generated method stub
		   return bookService.updateBook(book);
	}
	@GetMapping("/books")
	List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		 return bookService.getAllBooks();
	}
	@GetMapping("/books/author/{author}")
    List<Book> getBookbyAuthor(@PathVariable("author")String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return bookService.getBookbyAuthor(author);
	}
	@GetMapping("/books/category/{category}")
	List<Book> getBookbycategory(@PathVariable("category")String category) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return bookService.getBookbycategory(category);
	}
	@GetMapping("/books/titleauthor/{title}/{author}")
	public List<Book> findBookByTitleAndAuthor(@PathVariable("title")String title, @PathVariable("author")String author) {
		// TODO Auto-generated method stub
		return bookService.findByTitleAndAuthor(title,author);
	}
	@GetMapping("/books/titleprice/{title}/{price}")
	public List<Book> findByTitleAndPrice(@PathVariable("title")String title,@PathVariable("price")Double price) {
		// TODO Auto-generated method stub
		return bookService.findBookByTitleAndPrice(title, price);
	}
}
	
	


