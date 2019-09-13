package ru.drudenko.service;

import ru.drudenko.dto.HelloDto;
import ru.drudenko.mapper.HelloMapper;
import ru.drudenko.model.repository.HelloRepository;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

@Singleton
public class HelloServiceImpl implements HelloService {

    private final HelloRepository helloRepository;

    @Inject
    public HelloServiceImpl(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @Override
    public HelloDto hello(String s) {
        return HelloMapper.entityToDto(helloRepository.create(s));
    }

    @Override
    public List<HelloDto> getAll() {
        return HelloMapper.entitiesToListDto(helloRepository.getAll());
    }
}
