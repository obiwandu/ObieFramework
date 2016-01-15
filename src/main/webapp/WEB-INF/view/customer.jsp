<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12/7/2015
  Time: 8:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Management</title>
</head>
<body>

  <h1>Customer List</h1>

  <table>
    <tr>
      <th>Customer Name</th>
      <th>Contact</th>
      <th>Phone Number</th>
      <th>Email</th>
      <th>Operation</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
      <tr>
        <td>${customer.name}</td>
        <td>${customer.contact}</td>
        <td>${customer.telephone}</td>
        <td>${customer.email}</td>
        <td>
          <a hred="${BASE}/customer_edit?id=${customer.id}">Edit</a>
          <a hred="${BASE}/customer_delete?id=${customer.id}">Delete</a>
        </td>
      </tr>
    </c:forEach>
  </table>

</body>
</html>
