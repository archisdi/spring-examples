package com.practice.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> findAllBooks() {
        return Arrays.asList(
                new Book(1, "Mastering Code 1.3", "Archie Isdiningrat"),
                new Book(2, "Mastering Love", "Angga Isdiningrat")
        );
    }
}
