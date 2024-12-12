package org.example.libraryaop.service;

import org.example.libraryaop.annotation.ExceptionAnnotation;
import org.example.libraryaop.annotation.Log;
import org.example.libraryaop.annotation.Performance;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {

    private Map<Integer, String> books = new HashMap<>();

    @Log
    @Performance
    public void addBook(int id, String name) {
        books.put(id, name);
    }

    @Log
    @Performance
    @ExceptionAnnotation
    public void removeBook(int id) {
        books.remove(id);
    }

    @Log
    @Performance
    @ExceptionAnnotation
    public String getBook(int id) {
        if (!books.containsKey(id)) {
            throw new IllegalArgumentException("Book not found");
        }
        return books.get(id);
    }
}
