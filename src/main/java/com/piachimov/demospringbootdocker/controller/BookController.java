package com.piachimov.demospringbootdocker.controller;

import com.piachimov.demospringbootdocker.model.Book;
import com.piachimov.demospringbootdocker.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.apache.coyote.BadRequestException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping("/message")
    public String getMessage() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String getTest() {
        return "Test Hello World";
    }

    @GetMapping("/docker-image")
    public String getDockerImage() {
        return "docker-image new ONE ONE open source!!!!1  RAS RAS KRK  KEK";
    }

    @SneakyThrows
    @GetMapping("/{id}")
    public Book getBook(@PathVariable Integer id) {
        return bookRepository.findById(id).orElseThrow(() -> new BadRequestException("No Book found"));
    }

    @GetMapping
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }
}
