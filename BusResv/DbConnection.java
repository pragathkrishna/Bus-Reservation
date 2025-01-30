package BusResv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String url="jdbc:mysql://localhost:3306/jdbcdemo";
    private static final String userName=System.getenv("DB_USERNAME");
    private static final String passWord=System.getenv("DB_PASSWORD");
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,userName,passWord);
    }
}
