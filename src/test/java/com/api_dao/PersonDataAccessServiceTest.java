package com.api_dao;

import com.model.entity.Person;
import com.model.repository.PersonRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class PersonDataAccessServiceTest {
    @Mock
    PersonRepository personRepository;
    @Mock
    Logger logger;
    @InjectMocks
    PersonDataAccessService personDataAccessService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInsertPerson() throws Exception {
        personDataAccessService.insertPerson(new Person());
    }

    @Test
    public void testSelectAllPeople() throws Exception {
        when(personRepository.selectAllPeople()).thenReturn(Arrays.<Person>asList(new Person()));

        List<Person> result = personDataAccessService.selectAllPeople();
        Assert.assertNotNull(result);
    }

    @Test
    public void testDeletePersonById() throws Exception {
        personDataAccessService.deletePersonById("id");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme