package com.example.bookProj;

import com.example.bookProj.model.Book;
import com.example.bookProj.model.BookApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class MyControllers {
    private final Logger logger = LoggerFactory.getLogger(BookRepository.class);

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
        logger.info("book", book);
        try {
            bookService.addBook(book);
            BookApiResponse response = new BookApiResponse(201, true, "Book added successfully", List.of(book));
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (Exception e) {
            BookApiResponse errorResponse = new BookApiResponse(400, false, e.getMessage(), null);
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

        }
    }

    @PutMapping("/modifyBook")
    public ResponseEntity<BookApiResponse> updateBook(@RequestBody Book book) {
        logger.info("log", book);
        try {
            bookService.updateBook(book);
            BookApiResponse response = new BookApiResponse(200, true, "Book updated successfully", List.of(book));
            return  new ResponseEntity<>(response, HttpStatus.OK);

        } catch (Exception e){
            BookApiResponse errorResponse = new BookApiResponse(400, false, e.getMessage(), null);
            return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);

        }
    }

}
