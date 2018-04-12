package module2.task4;

import java.sql.*;

public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void putLike(User u) {
        String query = "select * from Photos;";
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/social", "root", "161617Kk");
             //2 create Statement = wrapper for queries
             Statement statement = connection.createStatement();
             //3 create result set
             ResultSet resultSet = statement.executeQuery(query))

        {
            while (resultSet.next()) {
               

                // count= resultSet.getInt(1);



            }
            resultSet.close();
            statement.close();





        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

