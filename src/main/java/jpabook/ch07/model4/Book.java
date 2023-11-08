package jpabook.ch07.model4;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class Book extends Item {

    private String author;
    private String isbn;

}
