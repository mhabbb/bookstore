package pl.mh.bookstore.exception;

import pl.mh.bookstore.domain.Book;

public class NotEnoughProductsInStockException extends Exception {

    private Book book;
    private static final String DEFAULT_MESSAGE = "Not enough products in stock";

    public NotEnoughProductsInStockException() {
        super(DEFAULT_MESSAGE);
    }

    public NotEnoughProductsInStockException(Book book) {
        super("Not enough " + book.getTitle() + " products in stock. Only " + book.getQuantity() + " left");

        this.book = book;
    }

}
