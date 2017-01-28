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
                <h1>Product Page</h1>
                <h2>Price ${product.price}</h2>
                <p>${product.description}</p>
                <p>${product.description}</p>
                <p>${product.description}</p>
                <p>${product.description}</p>


            </div>
        </div><!--/.col-xs-12.col-sm-9-->

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar">
            <div class="list-group">
                <c:forEach var="name" items="${nameOfProducts}">
                    <c:if test="${name==product.name}">
                        <a href="/product?name=${name}" class="list-group-item active">
                            <c:out value="${name}"/>
                        </a>
                    </c:if>
                    <c:if test="${name!=product.name}">
                        <a href="/product?name=${name}" class="list-group-item">
                            <c:out value="${name}"/>
                        </a>
                    </c:if>
                </c:forEach>

            </div>
        </div><!--/.sidebar-offcanvas-->
    </div><!--/row-->

</div><!--/.container-->


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


