import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    String user = req.getParameter("username");
    String pass = req.getParameter("password");

    if("admin".equals(user) && "password".equals(pass)) {
      req.getSession().setAttribute("user", user);
      res.sendRedirect("welcome.jsp");
    } else {
      res.sendRedirect("login.jsp?error=1");
    }
  }
}

