import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/TestServlet2")

public class TestServlet2 extends HttpServlet {

    public static String lastid;

    public static int id=1;

    // database connection settings
    private String dbURL = "jdbc:mysql://localhost:3306/loginForm";
    private String dbUser = "root";
    private String dbPass = "161617Kk";


    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        // gets values of text fields
        String firstName = httpServletRequest.getParameter("firstname");
        String lastName = httpServletRequest.getParameter("lastname");
        String email = httpServletRequest.getParameter("email");
        String password = httpServletRequest.getParameter("password");


        Connection conn = null; // connection to the database
        String message = null;  // message will be sent back to client

        // connects to the database

        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);


            // constructs SQL statement

            String sql = "INSERT INTO users (FirstName, LastName, UserEmail,UserPassword) values (?, ?, ?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, email);
            statement.setString(4, password);




            ResultSet resultS = statement.executeQuery ("select MAX(UserID)  from users");

            while (resultS.next()){
               id= resultS.getInt(1);
                Cookie userId = new Cookie("UserID", String.valueOf(id));
                httpServletResponse.addCookie(userId);
            }

            // ResultSet resultS = statement.executeQuery("select last_insert_id() as last_id from users");
           // lastid = resultS.getString("last_id");
            /*Cookie userId = new Cookie("UserID", lastid);
            httpServletResponse.addCookie(userId);*/


            // sends the statement to the database server
            int row = statement.executeUpdate();
            if (row > 0) {
               // message = "Data was saved into database";
                httpServletResponse.sendRedirect("test3.jsp");


            }
        } catch (SQLException ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }

            // sets the message in request scope
            httpServletRequest.setAttribute("Message", message);

            // forwards to the message page

           // getServletContext().getRequestDispatcher("/Message.jsp").forward(httpServletRequest, httpServletResponse);

            // forwards to the test3 page
            // getServletContext().getRequestDispatcher("/test3.jsp").forward(httpServletRequest, httpServletResponse);


        }


    }
}
