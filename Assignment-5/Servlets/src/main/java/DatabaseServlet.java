import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class DatabaseServlet extends HttpServlet {
    private String dbURL;
    private String dbUser;
    private String dbPassword;

    public void init(ServletConfig config) throws ServletException {
        dbURL = config.getInitParameter("dbURL");
        dbUser = config.getInitParameter("dbUser");
        dbPassword = config.getInitParameter("dbPassword");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Database Configuration Details</h2>");
        out.println("<p>DB URL: " + dbURL + "</p>");
        out.println("<p>DB User: " + dbUser + "</p>");
        out.println("<p>DB Password: " + dbPassword + "</p>");
        out.println("</body></html>");
    }
}