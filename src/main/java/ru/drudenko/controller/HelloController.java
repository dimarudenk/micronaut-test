package ru.drudenko.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.reactivex.Single;
import ru.drudenko.dto.HelloDto;
import ru.drudenko.service.HelloService;

import javax.inject.Inject;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Controller("/")
@Validated
public class HelloController {

    private final HelloService helloService;

    @Inject
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @Get(uri = "/hello/{name}", produces = MediaType.APPLICATION_JSON)
    public Single<HelloDto> create(@NotBlank String name) {
        return Single.just(helloService.hello(name));
    }

    @Get(uri = "/hello", produces = MediaType.APPLICATION_JSON)
    public Single<List<HelloDto>> getAll() {
        return Single.just(helloService.getAll());
    }
}
