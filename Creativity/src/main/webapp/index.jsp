<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
    <div class="container">
        <h2 class="mt-4">Registration Form</h2>
        <form action="add" method="post">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" class="form-control"  id="name" name="name" required>
                <h2>${Name}</h2>
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" name="email" required>
                <h2>${Email}</h2>
            </div>

            <div class="form-group">
                <label for="phoneNumber">Phone Number:</label>
                <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" required>
                <h2>${PhoneNumber}</h2>
            </div>

            <div class="form-group">
                <label for="dob">Date of Birth:</label>
                <input type="date" class="form-control" id="dob" name="dob" required>
                
            </div>

            <div class="form-group">
                <label for="location">Location:</label>
                <input type="text" class="form-control" id="location" name="location" required>
            <h2>${Location}</h2>
            </div>

            <div class="form-group">
                <label for="fatherName">Father's Name:</label>
                <input type="text" class="form-control" id="fatherName" name="fatherName" required>
            <h2>${FatherName}</h2>
            </div>

            <div class="form-group">
                <label for="motherName">Mother's Name:</label>
                <input type="text" class="form-control" id="motherName" name="motherName" required>
                <h2>${MotherName}</h2>
            </div>

            <button type="submit" class="btn btn-primary">Register</button>
        </form>
    </div>

</body>
</html>