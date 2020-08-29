package com.api_dao;
import com.model.repository.PersonRepository;
import org.slf4j.Logger;
import org.springframework.stereotype.Repository;
import com.model.entity.Person;

import java.util.List;

@Repository("postgres")
public class PersonDataAccessService implements PersonDAO {

    private PersonRepository personRepository;
    private Logger logger;

    @Override
    public void insertPerson(Person person) {
        try {
            personRepository.save(person);
        } catch (Exception ex){
            logger.error("No se pudo insertar " + ex.getMessage());
        }
    }

    @Override
    public List<Person> selectAllPeople() {
        return personRepository.selectAllPeople();
    }

    @Override
    public void deletePersonById(String id) {
       try {
           personRepository.deleteById(id);
       } catch (Exception ex){
           logger.error("No se pudo eliminar " + ex.getMessage());
       }
    }
}
