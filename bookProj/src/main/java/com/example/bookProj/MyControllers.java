package com.example.bookProj;

import com.example.bookProj.model.Book;
import com.example.bookProj.model.BookApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class MyControllers {

    @Autowired
    BookService bookService;

    @GetMapping("/getBooks")
    public ResponseEntity<BookApiResponse> getAllBooks() {
        try {
            List<Book> allBooks = bookService.getAllBook();
            BookApiResponse response = new BookApiResponse(200, true, "Here is all books", allBooks);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            BookApiResponse errorResponse = new BookApiResponse(500, false, e.getMessage(), null);
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/addBook")
    public ResponseEntity<BookApiResponse> addBook(@RequestBody Book book) {
        try {
            bookService.addBook(book);
            BookApiResponse response = new BookApiResponse(201, true, "Book added successfully", List.of(book));
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            BookApiResponse errorResponse = new BookApiResponse(400, false, e.getMessage(), null);
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
        }
    }

}
