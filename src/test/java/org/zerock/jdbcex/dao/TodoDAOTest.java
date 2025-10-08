package org.zerock.jdbcex.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TodoDAOTest {

    private TodoDAO todoDAO;

    @BeforeEach //테스트 수행전 수행
    public void ready() {
        todoDAO = new TodoDAO();
    }

    @Test
    public void testTime() throws Exception {
        System.out.println(todoDAO.getTime());
    }
}