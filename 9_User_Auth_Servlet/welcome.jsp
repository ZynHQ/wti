<%@ page import="javax.servlet.http.*,javax.servlet.jsp.*" %>
<%@ page session="true" %>
<%
  if (session.getAttribute("user") == null) {
    response.sendRedirect("login.jsp");
  }
%>
<h1>Welcome, <%= session.getAttribute("user") %></h1>
<a href="logout.jsp">Logout</a>