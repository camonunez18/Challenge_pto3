package com.api_controller;
import com.services.PersonService;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import com.model.entity.Person;

import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {

        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@NonNull @RequestBody Person person) {

        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople() {

        return personService.getAllPeople();
    }

    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") String id) {
        personService.deletePerson(id);
    }
}
