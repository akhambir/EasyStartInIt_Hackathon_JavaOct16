<%@include file="/WEB-INF/resources/views/header.jsp"%>

<div class="container">

    <div class="row row-offcanvas row-offcanvas-right">

        <div class="col-xs-12 col-sm-9">
            <div class="jumbotron">
                <h1>Admin Category Page</h1>
                <p>This page with all products categories</p>

                <div class="row">
                    <c:forEach var="category" items="${categories}">
                        <div class="col-xs-6 col-lg-4">
                            <a href="/products?category=${category.name}">
                                <h2><c:out value="${category.name}"/></h2>
                            </a>
                            <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                            <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>

                            <% //TODO - add EDIT & DELETE buttons near category row %>

                        </div>
                    </c:forEach>
                </div>
            </div>

            <p class="pull-right visible-xs">
                <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
            </p>
        </div>
    </div>
</div> <!-- /container -->


<!-- Bootstrap core JavaScript-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>

<script>
    <%@include file="resources/js/bootstrap.min.js"%>
</script>


