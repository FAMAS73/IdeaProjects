package domainDao;

import domain.Employee;

public class EmployeeDAO {//data access object
    public void saveEmployee(Employee employee){
        //establish a connection with the database(sql)
       // DatabaseConnectionManager connectionManager=DatabaseConnectionManager.getManagerInstance();
        System.out.println("saved employee to the database: "+employee);
    }
    public void deleteEmployee(Employee employee){
        System.out.println("deleted employee from the database: "+employee);
    }
}
