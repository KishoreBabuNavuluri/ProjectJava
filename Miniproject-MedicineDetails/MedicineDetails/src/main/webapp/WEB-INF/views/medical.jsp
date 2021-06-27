<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form method="post">
<pre>
MedicineName     :<input type="text" name="medicineName" pattern="^[A-Za-z]+$" title="Use only letters" required /><br>
ManufacturingDate:<input type="date" name="mfg" required/><br>
ExpiryDate :      <input type="date" name="expiryDate" required/><br>
Description:      <input type="text" name="description" required/><br>
Company:          <input type="text" name="company" required/><br>
Price:            <input type="number" name="price" required/><br>
Quantity:         <input type="number" name="quantity" required/><br>

                          <input type="submit" name="submit" value="submit" />

</pre>
</form>
</body>
</html>