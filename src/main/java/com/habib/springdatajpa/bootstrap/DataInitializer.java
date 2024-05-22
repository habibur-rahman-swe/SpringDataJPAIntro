package com.habib.springdatajpa.bootstrap;

import com.habib.springdatajpa.domain.AuthorUuid;
import com.habib.springdatajpa.domain.Book;
import com.habib.springdatajpa.domain.BookUuid;
import com.habib.springdatajpa.repositories.AuthorUuidRepository;
import com.habib.springdatajpa.repositories.BookRepository;
import com.habib.springdatajpa.repositories.BookUuidRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Profile({"local", "default"})
@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorUuidRepository authorUuidRepository;
    private final BookUuidRepository bookUuidRepository;

    public DataInitializer(BookRepository bookRepository, AuthorUuidRepository authorUuidRepository, BookUuidRepository bookUuidRepository) {
        this.bookUuidRepository = bookUuidRepository;
        this.bookRepository = bookRepository;
        this.authorUuidRepository = authorUuidRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.deleteAll();

        Book book1 = new Book("Domain Driven", "123", "CTC", null);
        Book book2 = new Book("Domain Driven", "123", "CTC", null);
        Book book3 = new Book("Domain Driven", "123", "CTC", null);

        List<Book> bookList = bookRepository.saveAll(Arrays.asList(book1, book2, book3));

        System.out.println("Number of Books: " + bookList.size());

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });

        AuthorUuid authorUuid = new AuthorUuid();
        authorUuid.setFirstName("Joe");
        authorUuid.setLastName("Buck");
        AuthorUuid savedAuthor = authorUuidRepository.save(authorUuid);
        System.out.println("Saved Author UUID: " + savedAuthor.getId() );


        BookUuid bookUuid = new BookUuid();
        bookUuid.setTitle("All About UUIDs");
        BookUuid savedBookUuid = bookUuidRepository.save(bookUuid);
        System.out.println("Saved Book UUID: " + savedBookUuid.getId());
    }
}
