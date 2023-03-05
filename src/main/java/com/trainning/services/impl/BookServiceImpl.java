package com.trainning.services.impl;

import com.trainning.entities.Book;
import com.trainning.repository.BookRepository;
import com.trainning.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    // constructors, other override methods

    @Override
    public Collection<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book addBook(Book book) {
        final Book savedBook = bookRepository.save(book);
        return savedBook;
    }
}
