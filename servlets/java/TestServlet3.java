import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/TestServlet3")
public class TestServlet3 extends HttpServlet {
    public static final String UserId = "UserID" ;

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

         String dbURL = "jdbc:mysql://localhost:3306/loginForm";
         String dbUser = "root";
         String dbPass = "161617Kk";


/*

        Cookie[] cookies = httpServletRequest.getCookies();

        String query = "select FirstName, UserEmail from users where UserID=7;";
        String firstName = "";

        for (Cookie c : cookies) {
            if (c.getName().equals(UserId)) {
                try {
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
                    PreparedStatement statement = conn.prepareStatement(query);

                    ResultSet rs= statement.executeQuery(query);
                    while (rs.next()) {

          //             firstName = rs.getString(2);
//                        String email = rs.getString(3);

                    }

*/
                    httpServletRequest.setAttribute("name", "TEST");
                    httpServletRequest.getRequestDispatcher("/test3.jsp").forward(httpServletRequest, httpServletResponse);

/*
                } catch (SQLException e) {
                    e.printStackTrace();


                }
            }else{

                httpServletResponse.sendRedirect("webapp/test2.jsp");
            }
*/

        }
    }

