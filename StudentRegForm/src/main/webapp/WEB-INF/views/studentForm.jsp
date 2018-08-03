<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="./resources/script/myScript.js"></script>

<title>Student Registration Form</title>
</head>
<body >
<h1 align="center">Student Registration Form</h1>
<form name="studform" method="post" action="next" onsubmit="return validateStudForm()">
<table align="center">

<tr>
<td>First Name</td>
<td><input type="text" name="firstName"></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName"></td>
</tr>
<tr>
<td>Address</td>
<td><textarea name="address"></textarea></td>
</tr>
<tr>
<td>City</td>
<td><select name="city">
    <option value="Hyderabad">Hyderabad</option>
    <option value="Chennai">Chennai</option>
    <option value="Mumbai">Mumbai</option>
      </select></td>
</tr>
<tr>
<td>State</td>
<td><select name="state">
    <option value="telangana">Telangana</option>
    <option value="tamilnadu">Tamilnadu</option>
    <option value="maharastra">Maharastra</option>
      </select></td>
</tr>
<tr>
<td>Gender</td>
<td> <input type="radio" name="gender" value="male" id="m" > Male<br>
  <input type="radio" name="gender" value="female" id="f"> Female<br>
  </td>
</tr>
<tr>
<td>Choose course</td>
<td><select name="course">
    <option value="be">BE</option>
    <option value="me">ME</option>
    <option value="mba">MBA</option>
      </select></td>
</tr>
<tr>
<td>Mobile Number</td>
<td><input type="text" name="mobilenum"></td>
</tr>
<!-- <tr>
<td><a href="payment">Next</a>
</td>
</tr> -->
<tr>
<td>
<input type="submit" value="Next" id="Next"/>
</td>
</tr>
</table>
</form>
</body>
</html>