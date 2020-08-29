package com.services;

import com.api_dao.PersonDAO;
import com.model.entity.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class PersonServiceTest {
    @Mock
    PersonDAO personDAO;
    @InjectMocks
    PersonService personService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddPerson() throws Exception {
        personService.addPerson(new Person());
    }

    @Test
    public void testGetAllPeople() throws Exception {
        when(personDAO.selectAllPeople()).thenReturn(Arrays.<Person>asList(new Person()));

        List<Person> result = personService.getAllPeople();
        Assert.assertNotNull(result);
    }

    @Test
    public void testDeletePerson() throws Exception {
        personService.deletePerson("id");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme