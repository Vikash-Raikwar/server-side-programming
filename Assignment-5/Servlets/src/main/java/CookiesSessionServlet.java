import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class CookieSessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        String username = null;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName())) {
                    username = cookie.getValue();
                }
            }
        }

        out.println("<html><body>");
        if (username != null) {
            out.println("<h2>Welcome back, " + username + "!</h2>");
        } else {
            out.println("<h2>Welcome, Guest!</h2>");
            out.println("<form action='CookieSessionServlet' method='post'>");
            out.println("Enter Username: <input type='text' name='username' required>");
            out.println("<input type='submit' value='Save Username'>");
            out.println("</form>");
        }
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");

        Cookie cookie = new Cookie("username", username);
        cookie.setMaxAge(60 * 60);
        response.addCookie(cookie);

        response.sendRedirect("CookieSessionServlet");
    }
}