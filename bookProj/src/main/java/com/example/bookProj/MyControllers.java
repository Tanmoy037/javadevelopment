package com.example.bookProj;

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
    ResponseEntity<List<Book>> getAllBooks(){
        return new ResponseEntity<>(bookService.getAllBook(), HttpStatus.OK);
    }

    @PostMapping("/addBook")
    ResponseEntity<String>  addBook(@RequestBody()Book book){
        try{
            bookService.addBook(book);
            return new ResponseEntity<>("Success",HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);

        }
    }

}
