import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class FormHandlerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        out.println("<html><body>");
        out.println("<h2>GET Request</h2>");
        out.println("<p>Hello, " + (name != null ? name : "Guest") + "!</p>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");
        out.println("<html><body>");
        out.println("<h2>POST Request</h2>");
        out.println("<p>Your email is: " + (email != null ? email : "Not provided") + "</p>");
        out.println("</body></html>");
    }
}
