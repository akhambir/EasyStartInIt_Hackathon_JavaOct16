<%@include file="/WEB-INF/resources/views/header.jsp"%>
<%--<style>
<%@include file="../css/login.css"%>
</style>--%>
<div class="container">

    <form class="form-signin" action="/j_spring_security_check" method="POST">

        <h2 class="form-signin-heading">Login Page</h2>


        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="text" name="username"  id="inputEmail" class="form-control" placeholder="Email address" required autofocus>

        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password"  id="inputPassword" class="form-control" placeholder="Password" required>

        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign In</button>

    </form>
    <form class="form-signin" action="/registration">
        <p>For the first time on site?</p>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign Up</button>
    </form>

    <c:if test="${not empty error}">
        <div class="alert alert-danger" role="alert">
            <p>${error}</p>
        </div>
    </c:if>
    <c:if test="${not empty logout}">
        <div class="alert alert-info" role="alert">
            <p>${logout}</p>
        </div>
    </c:if>

</div>

<%@include file="/WEB-INF/resources/views/footer.jsp"%>
