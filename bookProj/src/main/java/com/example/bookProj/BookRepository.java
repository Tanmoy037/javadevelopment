package com.example.bookProj;


import com.example.bookProj.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




@Component
class BookRepository {
    private final Logger logger = LoggerFactory.getLogger(BookRepository.class);


    HashMap<Integer, Book> books = new HashMap<>();



    List<Book> getAllBooksFromDatabase(){

        List<Book> bookList = new ArrayList<>();

        for (Book book : books.values()){
            bookList.add(book);
        }
        return bookList;

    }

    void addBook(Book book){
        books.put(book.getId(), book);
    }

    void updateBook(Book book) {
        logger.info("books", books.get(1));
        Book existingBook = books.get(book.getId());
        if (existingBook != null) {
            existingBook.setName(book.getName());
            existingBook.setAuthor(book.getAuthor());
            // Add any other fields you need to update here

            // Put the updated book back into the HashMap
            books.put(existingBook.getId(), existingBook);
            logger.info("Book updated successfully: {}", existingBook);
        } else {
            // Optionally handle the case where the book does not exist
            logger.error("No book found with id: {}", book.getId());
        }
    }

    void deleteBook(Book book) {
        books.remove(book.getId());
    }




}
