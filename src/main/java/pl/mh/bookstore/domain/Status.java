package pl.mh.bookstore.domain;

public enum Status {
    ACCEPTED("Accepted"),
    EXECUTED("Executed"),
    SENT("Sent");

    private final String name;

    Status(String name) {
        this.name = name;
    }
}
