<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
        }
        header {
            background-color: black;
            color: green;
            padding: 10px;
        }
        header a {
            color: white;
            text-decoration: none;
        }
        main {
            flex: 1;
        }
        footer {
            background-color: black;
            color: white;
            text-align: center;
            padding: 10px;
            position: absolute;
            bottom: 0;
            width: 100%;
        }
        #footerButton {
            background-color: #000;
            color: #fff;
            padding: 10px 20px;
            text-align: center;
            cursor: pointer;
        }
        #footerButton a {
            color: #fff;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <header>
        <div>
            <a href="index.jsp">Home</a>
        </div>
    </header>
    <div class="container">
        <form action="save" method="post">
            <div class="form-group">
              <label>Email:</label>
              <input type="text" class="form-control" id="email" name="email" value="${Email}">
              <span class="text-danger">${EmailInvalid}</span>
              <button type="submit" class="btn btn-primary" id="sendOTP" name="action" value="otp">Send OTP</button>
            </div>
            <div class="form-group">
              <label for="otp">OTP:</label>
               <input type="text" class="form-control" id="otp" name="otp" value="${otp}">
               <span class="text-danger">${findOtp1}</span>
            </div>
            <div>
                <button type="submit" class="btn btn-success" id="submitData" name="action" value="submit">Login</button>
            </div>
        </form>
    </div>
    <footer id="footerButton">
        <p>&copy; 2023 <a href="mailto:ulaga774xworkz@gmail.com">ulaga774xworkz@gmail.com</a></p>
    </footer>
</body>
</html>
