<%@include file="/WEB-INF/resources/views/header.jsp"%>

<%@include file="resources/css/offcanvas.css"%>

<div class="container">

    <div class="row row-offcanvas row-offcanvas-right">

        <div class="col-xs-12 col-sm-9">
            <p class="pull-right visible-xs">
                <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
            </p>
            <div class="jumbotron">
                <h1>Categories page</h1>
                <p>Description of products</p>
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
            </div><!--/row-->
        </div><!--/.col-xs-12.col-sm-9-->

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar">
            <div class="list-group">
                <a href="#" class="list-group-item active">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
                <a href="#" class="list-group-item">Link</a>
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
    <%@include file="resources/js/bootstrap.min.js"%>
</script>
<script>
    <%@include file="resources/js/offcanvas.js"%>
</script>

