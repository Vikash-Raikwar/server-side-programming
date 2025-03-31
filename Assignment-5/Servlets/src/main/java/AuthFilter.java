import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AuthFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest) request;
        HttpServletResponse httpRes = (HttpServletResponse) response;
        HttpSession session = httpReq.getSession(false);

        String requestedURL = httpReq.getRequestURI();

        if (session != null && session.getAttribute("username") != null) {
            chain.doFilter(request, response);
        } else if (requestedURL.equals("/web/protected")) {
            httpRes.sendRedirect("index.html"); 
        } else {
            chain.doFilter(request, response); 
        }
    }

    public void destroy() {}
}