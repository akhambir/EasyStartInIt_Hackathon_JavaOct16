<%@include file="/WEB-INF/resources/views/header.jsp"%>

<style>
    <%@include file="../css/stylesheet.css"%>
</style>

<div class="container">

    <div class="jumbotron">

        <h1>Edit Category</h1>
        <p>Enter new category name</p>

        <form class="form-signin" action="/products/edit/update?_csrf=${_csrf.token}" method="POST" enctype="multipart/form-data">

            <h2 class="form-signin-heading">Edit product</h2>

            <p>${message}</p>

            <label for="editProductName" class="sr-only">Product name</label>
            <input type="text" name="name" value="${product.name}" id="editProductName" class="form-control" placeholder="Product name" required autofocus>

            <label for="editProductDescription" class="sr-only">Description</label>
            <input type="text" name="description" value="${product.description}" id="editProductDescription" class="form-control" placeholder="Description">

            <label for="editProductPrice" class="sr-only">Price</label>
            <input type="text" name="price" value="${product.price}" id="editProductPrice" class="form-control" placeholder="Price">

            <label for="editProductCategory" class="sr-only">Category</label>
            <select id="editProductCategory" name="category.id" size="1">
                <c:forEach items="${categories}" var="category">
                    <option value="${category.id}">${category.name}</option>
                </c:forEach>
            </select>

            <input type="file" name="image" class="form-control"><br>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Update</button>
        </form>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>

<script>
    <%@include file="../js/bootstrap.min.js"%>
</script>

<%@include file="/WEB-INF/resources/views/footer.jsp"%>

