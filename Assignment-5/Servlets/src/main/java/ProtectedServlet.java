import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ProtectedServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Protected Page - Welcome!</h2>");
        out.println("</body></html>");
    }
}