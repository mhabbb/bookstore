package pl.mh.bookstore.domain;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Order {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;
}
