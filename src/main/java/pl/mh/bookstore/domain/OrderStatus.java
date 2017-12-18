package pl.mh.bookstore.domain;

public enum OrderStatus {
    SHIPPED("Shipped"),
    ACCEPTED("Accepted"),
    FULFILLED("Fulfilled");

    private final String name;

    OrderStatus(String name) {
        this.name = name;
    }
}
