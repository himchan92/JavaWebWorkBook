package org.zerock.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.jupiter.api.Test;

public class ConnectTests {

    @Test
    public void testConnection() throws Exception {

        //JDBC Driver Setting
        Class.forName("org.mariadb.jdbc.Driver");

        //JDBC CONNECTION Class
        Connection connection = DriverManager.getConnection(
            "jdbc:mariadb://localhost:3306/webdb",
            "root",
            "wjdthddl"
        );

        assertNotNull(connection);

        connection.clearWarnings();
    }
}
