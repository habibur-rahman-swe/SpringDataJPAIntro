package com.habib.springdatajpa;

import com.habib.springdatajpa.domain.Book;
import com.habib.springdatajpa.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class SpringBootJpaTestSlice {

    @Autowired
    BookRepository bookRepository;

    @Test
    void testJpaTestSplice() {
        long countBefore = bookRepository.count();

        bookRepository.save(new Book("A", "B", "C"));

        long countAfter = bookRepository.count();

        assertThat(countBefore).isLessThan(countAfter);

    }

}
