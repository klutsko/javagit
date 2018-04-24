import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;


@WebServlet("/TestServlet3")
public class TestServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

         String dbURL = "jdbc:mysql://localhost:3306/loginForm";
         String dbUser = "root";
         String dbPass = "161617Kk";


        Cookie[] cookies = httpServletRequest.getCookies();

        int userID = 1;

        String query = "select FirstName, UserEmail from users where id like ?;";


        for (Cookie c : cookies) {
            if (c.getName().equals(TestServlet2.id)) {
                userID = Integer.valueOf(c.getValue());
                try {
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
                    PreparedStatement statement = conn.prepareStatement(query);
                    ResultSet rs= statement.executeQuery(query);

                   /* String firstName = httpServletRequest.getParameter("firstname");
                    String email = httpServletRequest.getParameter("email");*/

                    while (rs.next()) {

                        String firstName = rs.getString(2);
                        String email = rs.getString(3);
                    }




                } catch (SQLException e) {
                    e.printStackTrace();


                }
            }else{
                httpServletResponse.sendRedirect("webapp/test2.jsp");
            }


        }
    }}

