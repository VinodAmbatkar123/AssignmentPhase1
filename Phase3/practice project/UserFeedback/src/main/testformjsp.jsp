<%@taglibprefix="form"uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<metacharset="ISO-8859-1">
<title>Spring test App</title>
</head>
<body>
<form:formaction ="/test_form" method="post"comman Name="testUser">
<labelfor="user">User:</label><br>
<inputtype="text"id="user"name="user"placeholder="John"><br>
<labelfor="comments">Comments:</label><br>
<inputtype="text"id="comments"name="comments"placeholder="Doe"><br><br>
<inputtype="submit"value="Submit">
<labelfor="rating">Rating:</label><br>

<inputtype="range"name="rating"id="rating"min="0"max="10"value="5"class="slider">
</form:form>
</body>
</html>	
