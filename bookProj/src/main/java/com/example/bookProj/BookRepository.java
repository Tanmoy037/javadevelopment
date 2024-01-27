package com.example.bookProj;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Component
class BookRepository {

    HashMap<Integer,Book> books = new HashMap<>();

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


}
