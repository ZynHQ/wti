<%@page contentType="text/html" %>
<html><body>
<h2>Review Cart & Shipping</h2>
<c:forEach var="item" items="${sessionScope.cart}">
  <p>${item.name} - ${item.qty} x ${item.price}</p>
</c:forEach>

<form action="checkout" method="post">
  Name: <input name="name" required/><br/>
  Address: <input name="address" required/><br/>
  <button type="submit">Complete Purchase</button>
</form>
</body></html>

