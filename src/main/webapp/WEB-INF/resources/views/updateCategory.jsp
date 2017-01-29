<%--
  Created by IntelliJ IDEA.
  User: maxt28
  Date: 29.01.17
  Time: 6:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form class="form-signin" action="/categories/update?_csrf=${_csrf.token}" method="POST" enctype="multipart/form-data">
    <h2 class="form-signin-heading">New category</h2>
    <label for="addCategoryName" class="sr-only">Category name</label>
    <input type="text" name="name" value="${category.name}"  id="addCategoryName" class="form-control" placeholder="New category" required autofocus>
    <label for="addCategoryDescription" class="sr-only">Description</label>
    <input type="text" name="description"  value="${category.description}" id="addCategoryDescription" class="form-control" placeholder="Description"><br>
    <input type="file" name="image" class="form-control"><br>
    <input type="hidden" name="category_id" value="${category.id}">
    <button class="btn btn-lg btn-primary btn-block" type="submit">Create</button>
</form>

</body>
</html>
