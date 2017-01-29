<%@include file="/WEB-INF/resources/views/header.jsp"%>

<style>
<%@include file="../css/stylesheet.css"%>
</style>
<div class="container">

    <div class="row row-offcanvas row-offcanvas-right">

        <div class="col-xs-12 col-sm-12">
            <p class="pull-right visible-xs">
                <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
            </p>
            <div class="jumbotron">
                <h1>Categories page</h1>
                <p>Description of our products</p>

                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <p>
                        <a class="btn btn-lg btn-primary" href="/createcategory" role="button">Create new category</a>
                    </p>
                </sec:authorize>

            </div>

            <div class="row">
                <c:forEach var="category" items="${categories}">
                    <div class="col-xs-6 col-lg-4">
                            <img class="img-circle" width="100px" height="100px" src="<c:url value="/images/categories/${category.image}"/>"/>
                            <h2><c:out value="${category.name}"/></h2>
                        <p><a class="btn btn-default" href="/products?category=${category.name}" role="button">View details &raquo;</a></p>
                        <sec:authorize access="hasRole('ROLE_ADMIN')">
                            <a class="btn btn-default" href="/categories/update?category_id=${category.id}" role="button">Edit category</a>
                            <a class="btn btn-default" href="/categories/delete?categoryId=${category.id}" role="button">Delete category</a>
                        </sec:authorize>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script>
    <%@include file="../js/bootstrap.min.js"%>
</script>
<script>
    <%@include file="../js/offcanvas.js"%>
</script>

<%@include file="/WEB-INF/resources/views/footer.jsp"%>
