package com.model.repository;

import com.model.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, String> {

    @Query(value = "SELECT * FROM spring_boot_db.person", nativeQuery = true)
    List<Person> selectAllPeople() ;

}
