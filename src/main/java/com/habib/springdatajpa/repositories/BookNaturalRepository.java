package com.habib.springdatajpa.repositories;

import com.habib.springdatajpa.domain.BookNatural;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookNaturalRepository extends JpaRepository<BookNatural, String> {
}
