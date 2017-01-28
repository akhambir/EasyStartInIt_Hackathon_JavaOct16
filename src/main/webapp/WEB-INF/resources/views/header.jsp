
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Main Page</title>

    <style>
        <%@include file="../css/bootstrap.min.css"%>
        <%@include file="../css/navbar-fixed-top.css"%>
    </style>
</head>

<body>

<!-- Fixed navbar -->
<nav class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Project name</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/">Home</a></li>
                <li><a href="/categories">Categories</a></li>
                <li><a href="/contact">Contacts</a></li>

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <sec:authorize access="isAnonymous()">
                <li><a href="/login">Sign In</a></li>
                <li><a href="/registration">Sign Up<span class="sr-only">(current)</span></a></li>
                </sec:authorize>
                <sec:authorize access="isAuthenticated()">
                    <li>${pageContext.request.userPrincipal.name}</li>
                    <li><a href="/j_spring_security_logout">Log Out</a></li>
                </sec:authorize>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
