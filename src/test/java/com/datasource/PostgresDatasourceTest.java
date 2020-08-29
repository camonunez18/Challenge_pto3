package com.datasource;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Assert;
import org.junit.Test;

public class PostgresDatasourceTest {
    PostgresDatasource postgresDatasource = new PostgresDatasource();

    @Test
    public void testHikariDataSource() throws Exception {
        HikariDataSource result = postgresDatasource.hikariDataSource();
        Assert.assertNotNull(result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme