<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
  <title>Product Page</title>
</head>
<body>

<table cellpadding="2" cellspacing="2" border="1">
  <tr>
    <th>productID</th>
    <th>quantity</th>
    <th>Remove</th>
  </tr>
  <c:forEach var="product" items="${cart}">
    <tr>
      <td>${product.productID }</td>
      <td>${product.quantity }</td>
      <td align="center">
        <a href="${pageContext.request.contextPath }/cart?&action=remove&id=${product.productID}">Remove</a>
      </td>
    </tr>
  </c:forEach>
</table>

</body>
</html>