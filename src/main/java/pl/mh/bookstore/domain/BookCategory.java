package pl.mh.bookstore.domain;

import lombok.Getter;

@Getter
public enum BookCategory {
    CRIMINAL("Criminal"),
    HORROR("Horror"),
    DRAMA("Drama"),
    SF("SF"),
    ADVENTURE("Adventure"),
    ROMANCE("Romance"),
    FOREIGN("Foreign"),
    TODO("Temporary value for all");

    private final String name;

    BookCategory(String name) {
        this.name = name;
    }
}
