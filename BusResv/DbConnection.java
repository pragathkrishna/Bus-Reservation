package BusResv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String url="jdbc:mysql://localhost:3306/jdbcdemo";
    private static final String userName="root";
    private static final String passWord="SQLforpragath";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,userName,passWord);
    }
}
