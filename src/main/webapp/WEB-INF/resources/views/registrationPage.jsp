<%@include file="/WEB-INF/resources/views/header.jsp"%>

<%--<style>
<%@include file="../css/registration.css"%>
</style>--%>
<div class="container">

    <form class="form-signin" action="/registration/addUser" method="POST">

        <h2 class="form-signin-heading">Registration</h2>

        <p>${message}</p>

        <label for="inputUserName" class="sr-only">User Name</label>
        <input type="text" name="username"  id="inputUserName" class="form-control" placeholder="User Name" required autofocus>

        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="text" name="email"  id="inputEmail" class="form-control" placeholder="Email address" required >

        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password"  id="inputPassword" class="form-control" placeholder="Password" required>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign Up</button>
    </form>

</div>

<%@include file="/WEB-INF/resources/views/footer.jsp"%>
