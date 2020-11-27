package infrastructure;

import java.sql.*;
import java.util.TimeZone;

public class Database {
    
    // Database configuration
    static final String DB_SERVER = "localhost";
    static final String DB_USER = "fog";
    static final String DB_PASS = "fog";
    static final String SCHEMA_NAME = "fog";
    

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://" + DB_SERVER + "/" + SCHEMA_NAME + "?serverTimezone=" + TimeZone.getDefault().getID();
    
    
    // Database version
    private static final int version = 1;
    
    public Database() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        

    }
    

    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        
    }
    
    public static int getVersion() {
        return version;
    }
}
