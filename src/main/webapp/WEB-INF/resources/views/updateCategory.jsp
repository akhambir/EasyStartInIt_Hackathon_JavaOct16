<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>

<div class="container">
    <div class="jumbotron">
<form style="color: #0f0f0f" action="/categories/update?_csrf=${_csrf.token}" method="POST" enctype="multipart/form-data">
    <h2 class="form-signin-heading">Edit category</h2>
    <div class="form-group">
    <label for="addCategoryName" class="sr-only">Category name</label>
    <input type="text" name="name" value="${category.name}"  id="addCategoryName" class="form-control" placeholder="New category" required autofocus>
    </div>
    <div class="form-group">
    <label for="addCategoryDescription" class="sr-only">Description</label>
    <input type="text" name="description"  value="${category.description}" id="addCategoryDescription" class="form-control" placeholder="Description"><br>
    </div>
    <div class="form-group">
    <input type="file" name="image" class="form-control"><br>
    <input type="hidden" name="category_id" value="${category.id}">
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Create</button>
</form>
    </div>
</div>

<%@include file="/WEB-INF/resources/views/footer.jsp" %>
</body>
</html>
