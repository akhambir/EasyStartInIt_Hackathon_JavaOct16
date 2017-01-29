<%@include file="/WEB-INF/resources/views/header.jsp"%>
<style>
<%@include file="../css/offcanvas.css"%>
</style>

<div class="container">

    <div class="row row-offcanvas row-offcanvas-right">
        <div class="col-xs-12 col-sm-9">

            <p class="pull-right visible-xs">
                <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
            </p>
            <div class="jumbotron">
                <h1>Products Page</h1>
                <p>Description of products of this category</p>
            </div>
            <div class="row">
                <c:forEach var="product" items="${products}">
                    <div class="col-xs-6 col-lg-4">
                        <img width="100px" height="100px" class="img-circle" src="<c:url value="/images/products/${product.image}"/>"/>
                        <a href="/product?category=${currentCategory}&id=${product.id}">
                            <h2><c:out value="${product.name}"/></h2>
                        </a>
                        <p><c:out value="${product.description}"/> </p>
                        <h3><c:out value="${product.price}"/> </h3>
                        <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                    </div>
                </c:forEach>
            </div>
        </div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script>
    <%@include file="../js/bootstrap.min.js"%>
</script>
<script>
    <%@include file="../js/offcanvas.js"%>
</script>

<%@include file="/WEB-INF/resources/views/footer.jsp"%>

