package com.model.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Date;
import java.sql.Timestamp;

public class PersonTest {
    @Mock
    Date birth;
    @Mock
    Timestamp created;
    @Mock
    Timestamp updated;
    @InjectMocks
    Person person;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void TestFullname() {
        person.setFullname("Test");
        String result = person.getFullname();
        Assert.assertEquals("Test", result);
    }

    @Test
    public void TestBirth(){
        person.setBirth("2020/07/07");
        String result = person.getBirth();
        Assert.assertNotNull(result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme