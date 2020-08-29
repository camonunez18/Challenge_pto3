package com.api_dao;
import com.model.entity.Person;
import java.util.List;

public interface PersonDAO {

    void insertPerson(Person person);

    List<Person> selectAllPeople();

    void deletePersonById(String id);
}
