package ru.itgirl.libraryproject.dto;

import lombok.*;
import ru.itgirl.libraryproject.model.Genre;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class BookCreateDto {

    private String name;
    private String genre;



}
