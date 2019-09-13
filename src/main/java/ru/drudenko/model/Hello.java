package ru.drudenko.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hello {
    @Id
    private String name;

    public Hello() {
    }

    public Hello(String name) {
        this.name = "Hello " + name;
    }

    public String getName() {
        return name;
    }
}
