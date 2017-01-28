<%@include file="/WEB-INF/resources/views/header.jsp"%>

<div class="container">

    <div class="jumbotron">

        <h1>Add Category</h1>
        <p>Enter new categories name</p>

        <form class="form-signin" action="#" method="POST">
            <h2 class="form-signin-heading">New category</h2>
            <p>${message}</p>
            <label for="addCategoryName" class="sr-only">Category name</label>
            <input type="text" name="name"  id="addCategoryName" class="form-control" placeholder="New category" required autofocus>
            <label for="addCategoryDescription" class="sr-only">Description</label>
            <input type="text" name="description"  id="addCategoryDescription" class="form-control" placeholder="Description" ><br>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Create</button>
        </form>

    </div>

</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>

<script>
    <%@include file="../js/bootstrap.min.js"%>
</script>

<%@include file="/WEB-INF/resources/views/footer.jsp"%>

