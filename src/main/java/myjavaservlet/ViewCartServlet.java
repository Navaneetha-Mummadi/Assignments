package myjavaservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewCartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        out.println("<h2>Your Cart Items:</h2>");
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (!cookie.getName().equals("JSESSIONID")) {
                    out.println("<p>" + cookie.getValue() + "</p>");
                }
            }
        } else {
            out.println("<p>No items in cart.</p>");
        }
    }
}
