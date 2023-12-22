<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <form action="send" method="post">
        <label for="brandName">Brand Name:</label>
        <input type="text" id="brandName" name="brandName" required><br><br>

        <label for="startedIn">Started In:</label>
        <input type="number" id="startedIn" name="startedIn" required><br><br>

        <label for="type">Type:</label>
        <input type="text" id="type" name="type" required><br><br>

        <label for="founder">Founder:</label>
        <input type="text" id="founder" name="founder" required><br><br>

        <label for="rating">Rating:</label>
        <input type="number" id="rating" name="rating" step="0.1" required><br><br>

        <input type="submit" value="Submit">
    </form>

   


</body>
</html>

  