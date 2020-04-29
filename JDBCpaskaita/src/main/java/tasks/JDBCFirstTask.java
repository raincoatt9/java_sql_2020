package tasks;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCFirstTask {
    public static void main(String[] args) {
        try {

            Connection connection = MyJDBCutils.getConnection();
            if(connection == null){
                return;
            }
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from students");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+ " ");
                System.out.println(resultSet.getString("name")+ " ");
                System.out.println(resultSet.getString("surname")+ " ");
                System.out.println(resultSet.getString("phone")+ " ");
                System.out.println(resultSet.getString("email")+ "\n ");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
