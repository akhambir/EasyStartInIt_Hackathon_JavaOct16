
<%@include file="/WEB-INF/resources/views/header.jsp"%>
<style>
    <%@include file="../css/userPage.css"%>
</style>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-6">
            <h2>Products</h2>
            <ul class="nav nav-sidebar">
                <div class="row">
                <c:forEach var="product" items="${products}">
                    <div class="col-md-8">
                    <li><a href="#"><c:out value="${product.name} ${product.price} $"/></a></li>
                    </div>
                    <div class="col-md-4">
                    <p><a class="btn btn-warning" href="#" role="button">Delete &raquo;</a></p>
                    </div>
                </c:forEach>
                </div>
            </ul>
        </div>
        <div class="col-md-6">
            <h1 class="page-header">User Cabinet</h1>
            <h2>Total price: ${price}</h2>
            <div class="button">
                <p><a class="btn btn-default" href="#" role="button">Oplatit &raquo;</a></p>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
<%@include file="/WEB-INF/resources/js/bootstrap.min.js"%>
</script>
<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<script src="../../assets/js/vendor/holder.min.js"></script>



<%@include file="/WEB-INF/resources/views/footer.jsp"%>
