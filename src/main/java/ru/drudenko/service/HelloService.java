package ru.drudenko.service;

import ru.drudenko.dto.HelloDto;

import java.util.List;

public interface HelloService {
    HelloDto hello(String s);

    List<HelloDto> getAll();
}
