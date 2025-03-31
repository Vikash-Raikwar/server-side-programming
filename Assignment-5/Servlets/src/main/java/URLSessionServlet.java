import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class URLSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user = (String) request.getAttribute("user");

        out.println("<html><body>");
        if (user != null) {
            out.println("<h2>Hello, " + user + "!</h2>");
        } else {
            out.println("<h2>Welcome, Guest!</h2>");
            out.println("<a href='URLSessionServlet?user=JohnDoe'>Click here to log in</a>");
        }
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");

        if (user != null) {
            request.setAttribute("user", user);
        }

        doGet(request, response);
    }
}