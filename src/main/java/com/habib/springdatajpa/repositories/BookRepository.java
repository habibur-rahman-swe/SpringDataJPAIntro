package com.habib.springdatajpa.repositories;

import com.habib.springdatajpa.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
