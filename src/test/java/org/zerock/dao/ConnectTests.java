package org.zerock.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
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

    @Test
    public void testHikariConfig() throws Exception {

        HikariConfig config = new HikariConfig();
        config.setDriverClassName("org.mariadb.jdbc.Driver");
        config.setJdbcUrl("jdbc:mariadb://localhost:3306/webdb");
        config.setUsername("root");
        config.setPassword("wjdthddl");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

        HikariDataSource ds = new HikariDataSource(config);
        Connection connection = ds.getConnection();

        System.out.println(connection);

        connection.close();
    }
}
