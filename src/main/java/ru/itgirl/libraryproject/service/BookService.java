package ru.itgirl.libraryproject.service;

import ru.itgirl.libraryproject.dto.BookCreateDto;
import ru.itgirl.libraryproject.dto.BookDto;
import ru.itgirl.libraryproject.dto.BookUpdateDto;

public interface BookService {
    BookDto getByNameV1 (String name);
    BookDto getByNameV2 (String name);
    BookDto getByNameV3 (String name);

    BookDto createBook (BookCreateDto bookCreateDto);

    void deleteBook (Long id);
    BookDto updateBook (BookUpdateDto bookUpdateDto);
}
