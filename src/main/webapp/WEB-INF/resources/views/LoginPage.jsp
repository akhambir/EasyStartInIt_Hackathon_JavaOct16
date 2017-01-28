<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 01.12.16
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Please Sign In</title>

    <style>
        <%@include file="css/bootstrap.min.css"%>
        <%@include file="css/loginCSS/signin.css"%>
    </style>


</head>

<body>

<div class="container">

    <form class="form-signin" action="SignIn" method="POST">
        <h2 class="form-signin-heading">Login Page</h2>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="text" name="email"  id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password"  id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign In</button>
    </form>
    <form class="form-signin" action="/SignUp">
        <p>For the first time on site?</p>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign Up</button>
    </form>

</div> <!-- /container -->



</body>
</html>
