package com.habib.springdatajpa.bootstrap;

import com.habib.springdatajpa.domain.Book;
import com.habib.springdatajpa.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("Domain Driven", "123", "CTC");
        Book book2 = new Book("Domain Driven", "123", "CTC");
        Book book3 = new Book("Domain Driven", "123", "CTC");

        List<Book> bookList = bookRepository.saveAll(Arrays.asList(book1, book2, book3));

        System.out.println("Number of Books: " + bookList.size());

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });
    }
}
