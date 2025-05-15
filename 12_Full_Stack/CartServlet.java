import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String itemId = request.getParameter("itemId");
        String quantity = request.getParameter("quantity");

        // Logic to update the cart based on itemId and quantity (e.g., updating a session attribute)
        HttpSession session = request.getSession();
        session.setAttribute(itemId, quantity);

        // Respond with the updated cart HTML
        PrintWriter out = response.getWriter();
        out.println("<h3>Updated Cart:</h3>");
        out.println("<p>Item " + itemId + ": " + quantity + " units</p>");
    }
}