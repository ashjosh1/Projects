<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="./resources/script/myScript.js"></script>
<title>Payment</title>
</head>
<body>
<h1 align="center">Student Registration </h1>
<form name="payform" method="get" action="pay" onsubmit="return validatePayForm()">
<table align="center">
<tr>
<td>Card Holder name</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>Debit/credit card number</td>
<td><input type="text" name="cardNo"></td>
</tr>
<tr>
<td>CVV number</td>
<td><input type="text" name="cvvNo"></td>
</tr>
<tr>
<td>Expairy date</td>
<td><input type="text" name="exDate"></td>
</tr>
<tr>
<td><input type="submit" value="Pay">
</td>
</tr>
</table>
</form>
</body>
</html>