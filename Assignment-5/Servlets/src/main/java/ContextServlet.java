import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ContextServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletContext context = getServletContext();
        String appName = (String) context.getAttribute("appName");
        String appVersion = (String) context.getAttribute("appVersion");

        out.println("<html><body>");
        out.println("<h2>Application Context Data</h2>");
        out.println("<p>App Name: " + appName + "</p>");
        out.println("<p>App Version: " + appVersion + "</p>");
        out.println("</body></html>");
    }

    public void init() throws ServletException {
        ServletContext context = getServletContext();
        context.setAttribute("appName", "Jakarta EE Example App");
        context.setAttribute("appVersion", "1.0.0");
    }
}