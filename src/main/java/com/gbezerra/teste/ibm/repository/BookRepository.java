package com.gbezerra.teste.ibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gbezerra.teste.ibm.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
	

}
