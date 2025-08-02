package myjavaservlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] selectedItems = request.getParameterValues("item");
        if (selectedItems != null) {
            for (String item : selectedItems) {
                Cookie cookie = new Cookie(item, item);
                cookie.setMaxAge(60 * 60); // 1 hour
                response.addCookie(cookie);
            }
        }
        response.sendRedirect("addItem.html");
    }
}
