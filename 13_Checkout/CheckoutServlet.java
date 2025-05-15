import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    req.getRequestDispatcher("/checkout.jsp").forward(req, res);
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String name = req.getParameter("name");
    String address = req.getParameter("address");
    req.getSession().removeAttribute("cart");
    req.setAttribute("msg", "Order placed successfully for " + name);
    req.getRequestDispatcher("/confirmation.jsp").forward(req, res);
  }
}

