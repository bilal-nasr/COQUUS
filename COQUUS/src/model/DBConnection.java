package model;
import java.sql.*;
public class DBConnection {
    
    String dbUrl = "jdbc:mysql://localhost/coquus";
    String user = "root";
    String pass = "";
    
    public Connection getDbConnection(){
        try {
            Connection myConnection = DriverManager.getConnection(dbUrl, user, pass);
            return myConnection;
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return null;
    }
}
