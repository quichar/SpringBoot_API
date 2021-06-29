<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo API</title>
</head>
<body>
<form action="calculate">
	Enter Parcel Weight :<input type ="number" name="kg" required /><br>
	<input type="submit" value="Check Parcel Price" />
	<br>
	
</form>
Parcel Price cost : ${weight} 
</body>
</html>