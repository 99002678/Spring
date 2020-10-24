package com.bookapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookRepository;
import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	public BookServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Book addBook(Book book) {
		Book newBook = bookRepository.save(book);
		return newBook;
	}

	@Override
	public boolean deleteBook(Integer bookid) throws BookNotFoundException {
		bookRepository.deleteById(bookid);
		return true;
	}

	@Override
	public Book getBookById(Integer bookid) throws BookNotFoundException {
		return bookRepository.findById(bookid)
		.orElseThrow(()->new BookNotFoundException("Id not available"));
		
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws BookNotFoundException {
		List<Book> bookList = bookRepository.findByAuthor(author);
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Author not available");
		}
		return bookList;
	}

	@Override
	public List<Book> getBookbycategory(String category) throws BookNotFoundException {
		List<Book> bookList = bookRepository.findByCategoryOrderByTitleAsc(category);
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Category not available");
		}
		return bookList;
	}

	@Override
	public List<Book> findBooksByTitleAndPrice(String title, Double price) {
		return bookRepository.findBooksByTitleAndPrice(title, price);
	}

	@Override
	public List<Book> findByTitleAndAuthor(String title, String author) {
		return bookRepository.findByTitleAndAuthor(title, author);
	}

}
