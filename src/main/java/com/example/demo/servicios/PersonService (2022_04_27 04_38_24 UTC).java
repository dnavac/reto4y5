package com.example.demo.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entidades.Person;

@Repository
public interface PersonService extends JpaRepository<Person, Integer> {

}
