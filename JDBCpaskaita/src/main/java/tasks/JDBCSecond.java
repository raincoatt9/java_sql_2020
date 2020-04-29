package tasks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCSecond {
    public static void main(String[] args) {
        Connection connection = MyJDBCutils.getConnection();

        if (connection == null) {
            return;
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE students SET name =?,surname=?,email=?,phone=? where id =?");
            preparedStatement.setString(1, "newName");
            preparedStatement.setString(2, "newSurname");
            preparedStatement.setString(3, "newEmail@googl.com");
            preparedStatement.setString(4, "++55771447");
            preparedStatement.setInt(5,5);

            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
