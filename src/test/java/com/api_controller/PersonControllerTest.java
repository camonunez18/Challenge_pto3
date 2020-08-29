package com.api_controller;

import com.model.entity.Person;
import com.services.PersonService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class PersonControllerTest {
    @Mock
    PersonService personService;
    @InjectMocks
    PersonController personController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddPerson() throws Exception {
        personController.addPerson(new Person());
    }

    @Test
    public void testGetAllPeople() throws Exception {
        when(personService.getAllPeople()).thenReturn(Arrays.<Person>asList(new Person()));

        List<Person> result = personController.getAllPeople();
        Assert.assertNotNull(result);
    }

    @Test
    public void testDeletePersonById() throws Exception {
        personController.deletePersonById("id");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme