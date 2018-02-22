package com.anyang.study.repository;

import com.anyang.study.configuration.ApplicationContextConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationContextConfig.class)
public class MySQLConnectionTest {

    @Autowired
    private DataSource ds;

    @Test
    public void testConnection() throws Exception{
        try (Connection conn = ds.getConnection()) {
            System.out.println(conn);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
