<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Page Title</title>
    <!-- Include Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            min-height: 100vh; /* Ensure the page takes at least the full viewport height */
        }

        header {
            background-color: black;
            color: green;
            text-align: center;
            padding: 10px;
        }

        header a {
            color: white;
            text-decoration: none;
        }

        .content {
            flex-grow: 2;
            text-align: center;
            padding-top: 4rem;
        }

        footer {
            background-color: black;
            color: white;
            text-align: center;
            padding: 10px;
        }

        #footerButton {
            background-color: #000; /* Black background color */
            color: #fff; /* White text color */
            padding: 10px 20px;
            text-align: center;
            cursor: pointer;
        }

        #footerButton a {
            color: #fff;
            text-decoration: none;
        }

        /* Add CSS for right-aligned links */
        .nav-links {
            text-align: right;
            margin-right: 20px;
            margin-top: 10px;
        }

        .nav-links a {
            color: white;
            text-decoration: none;
            margin-left: 20px;
        }

        .form {
            /* Add any specific form styles here */
        }

        .form-lbl {
            /* Add any label styles here */
        }

        /* Add specific styles for form inputs and error messages as needed */

        .btn-primary {
            /* Add any button styles here */
        }
    </style>
</head>
<body>
    <header>
        <!-- Right-aligned navigation links -->
        <div class="nav-links">
            <a href="viewrecords.jsp">ViewRecords</a>
        </div>
    </header>
    <div class="content">
        <form class="form" action="editRecords" method="get">
            <div class="row">
                <div class="col-md-3">
                    <label class="form-lbl"><b>OwnerName</b></label>
                    <input type="text" name="ownerName" class="form-control">
                    <h5 style="color: red">${ownerNameError}</h5>
                </div>
                <div class="col-md-3">
                    <label class="form-lbl"><b>MobileNumber</b></label>
                    <input type="number" name="mobileNumber" class="form-control">
                    <h5 style="color: red">${mobileNumberError}</h5>
                </div>
                <div class="col-md-3">
                    <label class="form-lbl"><b>Adhar number</b></label>
                    <input type="number" name="aadharNumber" class="form-control">
                    <h5 style="color: red">${aadharNumberError}</h5>
                </div>
                <div class="col-md-3">
                    <label class="form-lbl"><b>Year</b></label>
                    <input type="number" name="year" class="form-control" >
                    <h5 style="color: red">${yearError}</h5>
                </div>
                <div class="col-md-3">
                    <label class="form-lbl"><b>survey Number</b></label>
                    <input type="number" name="surveyNumber" class="form-control" readonly="readonly">
                    <h5 style="color: red">${surveyNumberError}</h5>
                </div>
                <div class="col-md-3">
                    <label class="form-lbl"><b>Hosue Number</b></label>
                    <input type="number" name="houseNumber" class="form-control" readonly="readonly">
                </div>
                <div>
                    <button type="submit" class="btn btn-primary">edit</button>
                </div>
            </div>
        </form>
    </div>
    <footer id="footerButton">
        <p>
            &copy; 2023 <a href="mailto:ulaga774xworkz@gmail.com">ulaga774xworkz@gmail.com</a>
        </p>
    </footer>
</body>
</html>
