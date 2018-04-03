import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBPractice {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        String fN;
        String lN;
        Date hD;
        int i = 0;

        //File-Project Structure - Libraries - mysql - connector java 5.146
                       String query = "select distinct first_name, last_name, hire_date from employees;";
                //"select count(*) from  employees;";
                // int count = 0;
                {
                    //1 connect driver for connecting to DB
                    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "161617Kk");
                         //2 create Statement = wrapper for queries
                         Statement statement = connection.createStatement();
                         //3 create result set
                         ResultSet resultSet = statement.executeQuery(query))

                    {
                        while (resultSet.next() && i < 10) {
                            fN=resultSet.getString(1);
                            lN=resultSet.getString(2);
                            hD=resultSet.getDate(3);
                            employees.add(new Employee(fN, lN, hD));
                            i++;

                            // count= resultSet.getInt(1);



                        }
                        resultSet.close();
                        statement.close();
                        for(Employee e: employees){
                            System.out.println(e.toString());
                        }




                    } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}

class Employee {
    String firstName;
    String lastName;
    Date hireDate;


    public Employee(String firstName, String lastName, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hireDate = hireDate;

    }

    @Override
    public String toString() {
        return  firstName + lastName + hireDate;
    }
}
