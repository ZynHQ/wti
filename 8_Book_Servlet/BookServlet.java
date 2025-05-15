import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class BookServlet extends HttpServlet {
  protected void doGet(HttpServletRequest r, HttpServletResponse s) throws ServletException, IOException {
    s.setContentType("text/html");
    PrintWriter o = s.getWriter();
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bookdb", "root", "pass");
      Statement t = c.createStatement();
      ResultSet rs = t.executeQuery("SELECT * FROM books");
      o.println("<html><body><h2>Books</h2><ul>");
      while(rs.next())
        o.println("<li>"+rs.getString("title")+" by "+rs.getString("author")+"</li>");
      o.println("</ul></body></html>");
      c.close();
    } catch(Exception e) {
      o.println("Error");
    }
  }
}
