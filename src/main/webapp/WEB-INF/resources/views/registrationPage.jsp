
<%@include file="/WEB-INF/resources/views/header.jsp"%>

<style>
<%@include file="../css/registration.css"%>
</style>
<div class="container">

    <form class="form-signin" action="SignUp" method="POST">
        <h2 class="form-signin-heading">Registration</h2>
        <label for="inputUserName" class="sr-only">User Name</label>
        <input type="text" name="userName"  id="inputUserName" class="form-control" placeholder="User Name" required autofocus>
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="text" name="email"  id="inputEmail" class="form-control" placeholder="Email address" required >
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password"  id="inputPassword" class="form-control" placeholder="Password" required>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> Remember me
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign Up</button>
        <h4>${resultOfValidation}</h4>
    </form>

</div> <!-- /container -->

