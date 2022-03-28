<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="DisplayProduct" method="post">
<table>
			<tr>
				<td align="right"> Product ID</td>
				<td><input type="number" name="pid" ></td>
			</tr>
			<tr>
				<td align="right"> Product Name</td>
				<td><input type="text" name="pname" ></td>
			</tr>
			<tr>
				<td align="right"> Product Description</td>
				<td><input type="text" name="pdescription" ></td>
			</tr>
			<tr>
				<td align="right"> Product Price</td>
				<td><input type="number" name="pprice" ></td>
			</tr>
			<tr>
			<td align="center" colspan="2">
			<input type="submit" name="b1"  value="submit"></td>
			</tr>
			</table>
			</form>
			</center>
</body>
</html>