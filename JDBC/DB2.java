import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB2 {
    public static void main(String[] args) {
        List<Employee2> employeess = new ArrayList<>();
        String fN;
        String lN;
        long sal;
        int i = 0;

        //File-Project Structure - Libraries - mysql - connector java 5.146
        String query = "select em.first_name, em.last_name, sal.salary\n" +
                "from employees em \n" +
                "inner join salaries sal on (em.emp_no=sal.emp_no) \n" +
                "where sal.to_date like '?';";
        //"select count(*) from  employees;";
        // int count = 0;

        //1 connect driver for connecting to DB
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "161617Kk");

            //2 create Statement = wrapper for queries

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "2000%");
            //3 create result set
            ResultSet resultSet = preparedStatement.executeQuery(query);


            while (resultSet.next() && i < 10) {
                fN = resultSet.getString(1);
                lN = resultSet.getString(2);
                sal = resultSet.getLong(3);
                employeess.add(new Employee2(fN, lN, sal));
                i++;
            }


            resultSet.close();
            connection.close();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }


    }
}


class Employee2 {
    String firstName;
    String lastName;
    long salary;


    public Employee2(String firstName, String lastName, long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return firstName + lastName + salary;
    }
}
