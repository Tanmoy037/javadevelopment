package com.example.bookProj;

import com.example.bookProj.model.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Component
class BookRepository {

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

    void updateBook(Book book){
        Book existingBook = books.get(book.getId());
        if(existingBook != null) {

            existingBook.setName(book.getName());
            existingBook.setAuthor(book.getAuthor());

            books.put(existingBook.getId(), existingBook);

        }
    }



}
