package com.example.bookProj;

import com.example.bookProj.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    List<Book> getAllBook(){
        return bookRepository.getAllBooksFromDatabase();

    }

    void addBook(Book book){
        bookRepository.addBook(book);

    }

    void updateBook(Book book){
        bookRepository.updateBook(book);
    }

}
