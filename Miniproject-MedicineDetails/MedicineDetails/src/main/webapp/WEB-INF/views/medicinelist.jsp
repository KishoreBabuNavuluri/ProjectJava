<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><a href="/expirymedicins">List Of Expired Medicins</a></h4>
<h4><a href="/home">Add Medicine</a></h4>
<h4><a href="/listofmedicins">List Of Medicins</a></h4>
<table border="1">
<caption><h1>List Of Medicins</h1></caption>
<thead>
<tr>
 <th>Medicine Name</th>
  <th>Manufacturing Date</th>
 <th>Expiry Date</th>
 <th>Medicine description</th>
 <th>Medicine price</th>
 <th>Medicine company</th>
 </tr>
 </thead>
 <tbody>
<c:forEach items="${allmedicineslist}" var="Medicine">
<tr>
<td>${Medicine.medicineName}</td>
<td>${Medicine.mfg}</td>
<td> ${Medicine.expiryDate}</td>
<td>${Medicine.description}</td>
<td>${Medicine.price}</td>
<td>${Medicine.company}</td>
</tr>
 </c:forEach>
 </tbody>
 </table>

 

</body>
</html>