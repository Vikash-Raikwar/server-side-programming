import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ClientInfoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String age = request.getParameter("age");

        String ipAddress = request.getRemoteAddr();
        String userAgent = request.getHeader("User-Agent");

        out.println("<html><body>");
        out.println("<h2>Client Request Details</h2>");
        out.println("<p>Name: " + (name != null ? name : "Not provided") + "</p>");
        out.println("<p>Age: " + (age != null ? age : "Not provided") + "</p>");
        out.println("<p>IP Address: " + ipAddress + "</p>");
        out.println("<p>User-Agent: " + userAgent + "</p>");
        out.println("</body></html>");
    }
}
