package tasks;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/kcs","root","");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * from students");

        while (resultSet.next()){
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getString("surname"));
            System.out.println(resultSet.getString("phone"));
            System.out.println(resultSet.getString("email"));


        }
    }
}
