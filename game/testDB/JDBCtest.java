package com.game.testDB;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCtest {
    @Test
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver"); // Загрузка класса драйвера
        String url = "jdbc:mysql://localhost:3306/rpg?serverTimezone=UTC&characterEncoding=UTF-8";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password); // Использование параметров для получения объекта подключения
        System.out.println("Соединение прошло успешно!");
        System.out.println(conn);


    }

}
