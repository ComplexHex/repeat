package com.game.testDB;


import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class TestDB {
    @Test
    public void test() throws ClassNotFoundException, SQLException {
        Connection connection = SQLUtil.getDbConnection();
        String result = SQLUtil.doRequest(connection, "SELECT * FROM PLAYER");
        System.out.println(result);
    }
}

