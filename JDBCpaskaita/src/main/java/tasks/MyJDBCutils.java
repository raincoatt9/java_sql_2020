package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyJDBCutils {


    private static final String URL="jdbc:mysql://localhost:3308/kcs";
    private static final String NAME="root";
    private static final String PASSWORD="";

    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL,NAME,PASSWORD);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;

    }
}
