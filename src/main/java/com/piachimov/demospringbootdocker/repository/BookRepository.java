package com.piachimov.demospringbootdocker.repository;

import com.piachimov.demospringbootdocker.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
