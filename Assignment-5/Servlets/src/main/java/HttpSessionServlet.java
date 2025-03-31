import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HttpSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        String theme = (String) session.getAttribute("theme");

        out.println("<html><body>");
        if (theme != null) {
            out.println("<h2>Current Theme: " + theme + "</h2>");
        } else {
            out.println("<h2>Theme not set.</h2>");
            out.println("<form action='HttpSessionServlet' method='post'>");
            out.println("Choose Theme: ");
            out.println("<select name='theme'>");
            out.println("<option value='Light'>Light</option>");
            out.println("<option value='Dark'>Dark</option>");
            out.println("</select>");
            out.println("<input type='submit' value='Set Theme'>");
            out.println("</form>");
        }
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String theme = request.getParameter("theme");
        HttpSession session = request.getSession();
        session.setAttribute("theme", theme);

        response.sendRedirect("HttpSessionServlet");
    }
}