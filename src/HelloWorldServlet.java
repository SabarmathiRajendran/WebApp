import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type to HTML
        response.setContentType("text/html");

        // Get the output stream to write the response
        PrintWriter out = response.getWriter();

        // Write HTML content to the browser
        out.println("<html><body>");
        out.println("<h1>Hello, World!</h1>");
        out.println("<p>This is the Java servlet.</p>");
        out.println("</body></html>");
    }
}
