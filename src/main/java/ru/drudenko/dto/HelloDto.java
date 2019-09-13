package ru.drudenko.dto;

public class HelloDto {
    private String name;

    public HelloDto() {
    }

    public HelloDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
