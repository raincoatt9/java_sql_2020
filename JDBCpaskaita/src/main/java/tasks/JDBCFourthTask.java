package tasks;

import java.sql.Connection;


public class JDBCFourthTask {
    public static void main(String[] args) {
        Connection connection = MyJDBCutils.getConnection();

        if(connection == null){
            return;
        }
        if(JDBCQueryUtils.isTableExist(connection,"students")){
            System.out.println("tokia lentele egzistuoja");
        }
        else{
            System.out.println("tokios lenteles nera");
        }

    }
}
