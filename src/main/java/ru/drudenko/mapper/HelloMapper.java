package ru.drudenko.mapper;

import ru.drudenko.dto.HelloDto;
import ru.drudenko.model.Hello;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public final class HelloMapper {

    HelloMapper() {
    }

    public static HelloDto entityToDto(Hello entity) {
        return new HelloDto(entity.getName());
    }

    public static List<HelloDto> entitiesToListDto(Collection<Hello> entities) {
        return entities.stream().map(HelloMapper::entityToDto).collect(Collectors.toList());
    }
}
