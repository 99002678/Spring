package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bookapp.model.Book;

@Service
public class BookDAOImpl implements BookDAO {

	@Override
	public List<Book> getAllBooks() {
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		List<Book> newBookList = new ArrayList<>();
		for (Book book : showBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		return newBookList;
				
	}

	@Override
	public List<Book> getByCategory(String category) {
		List<Book> newBookList = new ArrayList<>();
		for (Book book : showBookList()) {
			if(book.getCategory().equals(category))
				newBookList.add(book);
		}
		return newBookList;
	}

	@Override
	public Book getById(int id) {
		for (Book book : showBookList()) {
			if(book.getBookId()==id)
				return book;
		}
		return null;
	}
	
	private List<Book> showBookList(){
		return Arrays.asList(
				new Book(11, "Learn Java", "Tech", "Kathy", 900.0),
				new Book(12, "7 Habits", "SelfHelp", "Steve", 1900.0),
				new Book(13, "Ikigai", "SelfHelp", "Kathy", 1700.0));
	}

}
