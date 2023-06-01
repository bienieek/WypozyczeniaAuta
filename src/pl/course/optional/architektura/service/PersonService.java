package pl.course.optional.architektura.service;

import pl.course.optional.architektura.model.Person;
import pl.course.optional.architektura.repostitory.PersonRepository;

import java.util.*;

public class PersonService {
    PersonRepository personRepository;

    public Person findPersonWithMaxSalary() { //null, [], p1,p2,null,null,p3
        return personRepository.findAllPeople()
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingDouble(Person::getPensja))
                .orElseThrow(() -> new NoSuchElementException("PERSON_NOT_FOUND"));//customowych swoj blad i nim rzuic
    }

    //sumSalaryOFAllEmployees
}
