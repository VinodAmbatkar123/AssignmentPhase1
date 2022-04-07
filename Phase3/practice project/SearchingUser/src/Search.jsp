<%@pagelanguage="java"contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglibprefix="form"uri="http://www.springframework.org/tags/form"%>
<!DOCTYPEhtmlPUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<style>
table {
	float: left;
}

th {
	border-bottom: 1px solid black;
	text-align: left;
}
</style>
<body>

	<h2>Search for User</h2>

	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<tr>
			<td>${userSearch.id}</td>
			<td>${userSearch.name}</td>
			<td>${userSearch.email}</td>
			<td>${userSearch.password}</td>
		</tr>
	</table>

	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<form:form action="update"method="post"commandName="update">
		<h3>Update This User?</h3>
			<p>User ID: ${userSearch.id}</p>
			<inputtype="hidden"name="id"id="id"value="${userSearch.id}"required/>
			<labelfor="name">New Name:</label><br/>
			<inputtype="text"name="name"id="name"value="${userSearch.name}"required/><br/>
			<labelfor="email">New Email:</label><br/>
			<inputtype="text"name="email"id="email"value="${userSearch.email}"required/><br/>
			<labelfor="password">New Password:</label><br/>
		<inputtype="text"name="password"id="password"value="${userSearch.password}"required/><br/><br/>
			<inputtype="submit"value="Submit"/>
	</form:form>
	<br/>
	<br/>
	<ahref="/">Return to Menu</a>
</body>
</html>
