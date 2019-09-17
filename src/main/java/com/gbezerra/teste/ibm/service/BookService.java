package com.gbezerra.teste.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbezerra.teste.ibm.model.Book;
import com.gbezerra.teste.ibm.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book searchBookById(Long id) {
		Book bookSaved = bookRepository.findById(id).orElse(null);

		return bookSaved;
	}

}
