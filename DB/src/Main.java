import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class Main {
    public static void main(String[] args) throws Exception{
        Connection connection = getConnection("DB:ucanaccess://\"C:\\Users\\Light\\OneDrive - Rangsit University\\New OneDrive\\OneDrive - Rangsit University\\Documents\\Database10.accdb\"");
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("Select * from table");
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2));
            connection.close();
        }
    }
}
