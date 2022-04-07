<%@pagelanguage="java"contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglibprefix="form"uri="http://www.springframework.org/tags/form"%>

<!DOCTYPEhtml>
<html>
<head>
<metacharset="ISO-8859-1">
<title>Authentication Page</title>
</head>
<h2>Login Page</h2>
<body>
welcome to the authentication page

<form:formaction="Auth"method="post"commandName="login">
	<labelfor="username">Username:</label>
	<inputname="username"id="username"type="text"placeholder="Username"required/>
	<labelfor="password">Password:</label>
	<inputname="password"id="password"type="password"placholder="Password"required/>
	<inputtype="submit"name="Submit"/>
</form:form>
</body>
</html>
