package com.game.testDB;

import java.sql.*;

public class SQLUtil {

    public static Connection getDbConnection() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/rpg?serverTimezone=UTC&characterEncoding=UTF-8";
        String username = "root";
        String password = "root";

        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public static String doRequest(Connection conn, String request) throws SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(request);
            StringBuilder stringBuilder = new StringBuilder();
            while (rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                for (int i = 1; i <= numColumns; i++) {
                    // Column numbers start at 1.
                    // Also there are many methods on the result set to return
                    //  the column as a particular type. Refer to the Sun documentation
                    //  for the list of valid conversions.
                    Object obj = rs.getObject(i);
                    stringBuilder.append((obj != null) ? obj.toString() : "null");
                    if (i < numColumns)
                        stringBuilder.append(",");
                }
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();
        } finally {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
        }
    }

}

