package com.services;

import com.api_dao.PersonDAO;
import com.model.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonDAO personDAO;

    @Autowired
    public PersonService(@Qualifier("postgres") PersonDAO personDAO) {

        this.personDAO = personDAO;
    }

    public void addPerson(Person person) {
        personDAO.insertPerson(person);
    }

    public List<Person> getAllPeople() {

        return personDAO.selectAllPeople();
    }

    public void deletePerson(String id) {

         personDAO.deletePersonById(id);
    }

}
