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
                <h1>Categories page</h1>
                <p>Description of our products</p>
            </div>
            <div class="row">
                <c:forEach var="category" items="${categories}">
                    <div class="col-xs-6 col-lg-4">
                        <a href="/products?category=${category.name}">
                            <h2><c:out value="${category.name}"/></h2>
                        </a>
                        <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                        <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
                    </div><!--/.col-xs-6.col-lg-4-->
                </c:forEach>

                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <p>
                        <a class="btn btn-lg btn-primary" href="/addCategory" role="button">Create new category</a>
                    </p>
                </sec:authorize>
            </div><!--/row-->
        </div><!--/.col-xs-12.col-sm-9-->
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

<%@include file="/WEB-INF/resources/views/footer.jsp"%>
