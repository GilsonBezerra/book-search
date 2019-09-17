package com.gbezerra.teste.ibm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gbezerra.teste.ibm.model.Book;
import com.gbezerra.teste.ibm.repository.BookRepository;
import com.gbezerra.teste.ibm.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookService bookService;

	// To show all books registereds
	@GetMapping
	public List<Book> showAllBooks() {

		return bookRepository.findAll();
	}

	// To find a book by id
	@GetMapping("/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Long id) {
		Book bookSaved = bookService.searchBookById(id);

		return bookSaved != null ? ResponseEntity.ok(bookSaved) : ResponseEntity.notFound().build();
	}

	//To save a new book
	@PostMapping
	public ResponseEntity<Book> saveNewBook(@Valid @RequestBody Book book) {

		Book newBook = bookRepository.save(book);

		return ResponseEntity.ok(newBook);

	}

}
