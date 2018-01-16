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
    HISTORICAL("Historical"),
    ALL("Temporary value for all"),
    SETBOOK("Set book"),
    YOUNGADULT("Young adult"),
    WAR("War");
    private final String name;

    BookCategory(String name) {
        this.name = name;
    }
}
