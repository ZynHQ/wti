<!DOCTYPE html>
<html>
<body>
  <form action="LoginServlet" method="post">
    <label>Username:</label><input type="text" name="username"><br>
    <label>Password:</label><input type="password" name="password"><br>
    <button type="submit">Login</button>
  </form>
  <c:if test="${param.error != null}">
    <p style="color:red;">Invalid login details.</p>
  </c:if>
</body>
</html>
