<%@include file="/WEB-INF/resources/views/header.jsp" %>

<div class="container">

    <form class="form-signin" action="/categories/update?_csrf=${_csrf.token}" method="POST"
          enctype="multipart/form-data">
        <h2 class="form-signin-heading">New category</h2>
        <label for="addCategoryName" class="sr-only">Category name</label>
        <input type="text" name="name" value="${category.name}" id="addCategoryName" class="form-control"
               placeholder="New category" required autofocus>
        <label for="addCategoryDescription" class="sr-only">Description</label>
        <input type="text" name="description" value="${category.description}" id="addCategoryDescription"
               class="form-control" placeholder="Description"><br>
        <input type="file" name="image" class="form-control"><br>
        <input type="hidden" name="category_id" value="${category.id}">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Create</button>
    </form>

</div>

<%@include file="/WEB-INF/resources/views/footer.jsp" %>
