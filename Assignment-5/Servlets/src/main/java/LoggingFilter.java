import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

public class LoggingFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest) request;
        String ipAddress = request.getRemoteAddr();
        String requestedURL = httpReq.getRequestURI();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println("[" + timestamp + "] IP: " + ipAddress + " accessed " + requestedURL);

        chain.doFilter(request, response);
    }

    public void destroy() {}
}