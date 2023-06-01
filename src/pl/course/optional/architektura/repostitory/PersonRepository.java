package pl.course.optional.architektura.repostitory;

import pl.course.optional.architektura.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class PersonRepository {
    private List<Person> people = new ArrayList<>();

    public List<Person> findAllPeople() {
        return people;
    }

    public Person findPersonByFirstname(String firstname) {
        return people.stream()
                .filter(p -> p.getImie().equals(firstname))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }

    /*
    CRUD
    Create
    Read
    Update
    Delete
     */
    //addPerson
    //delePerson
    //findPersonById ByName
    //upatePersonById
}
