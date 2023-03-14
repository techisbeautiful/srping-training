package com.trainning.services;

import com.trainning.entities.Book;

import java.util.Collection;

public interface BookService {
    Collection<Book> getBooks();
    Book addBook(Book book);
}
