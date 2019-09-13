package ru.drudenko.model.repository;

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession;
import io.micronaut.spring.tx.annotation.Transactional;
import ru.drudenko.model.Hello;

import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Collection;

@Singleton
public class HelloRepository {
    private final EntityManager em;

    public HelloRepository(@CurrentSession EntityManager em) {
        this.em = em;
    }

    @Transactional
    public Collection<Hello> getAll() {
        Query query = em.createQuery("SELECT e FROM Hello e");
        return (Collection<Hello>) query.getResultList();
    }

    @Transactional
    public Hello create(String name) {
        Hello entity = new Hello(name);
        em.persist(entity);
        return entity;
    }

}
