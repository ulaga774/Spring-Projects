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
            min-height: 100vh;
            /* Ensure the page takes at least the full viewport height */
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
            padding-top: 11rem;
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
    </style>
</head>
<body>
    <header>
        <!-- Right-aligned navigation links -->
        <div class="nav-links">
            <a href="admin.jsp">Admin</a>
            <a href="user.jsp">User</a>
             <a href="view.jsp">sigin</a>
            
            
           
        </div>
    </header>
    <div class="content">
        <h1>Welcome To LandRecords</h1>
    </div>
    <footer id="footerButton">
        <p>
            &copy; 2023 <a href="mailto:ulaga774xworkz@gmail.com">ulaga774xworkz@gmail.com</a>
        </p>
    </footer>
</body>
</html>
