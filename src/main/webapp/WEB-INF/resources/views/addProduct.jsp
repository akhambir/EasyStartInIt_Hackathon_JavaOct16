<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="header.jsp"%>

    <div class="container">
        <div class="jumbotron">
    <form style="color: #0f0f0f" action="/addProduct?_csrf=${_csrf.token}" method="post" enctype="multipart/form-data">
        <div class="form-group">
        <input class="form-control" type="text" name="name" placeholder="Name: ">
        </div>
        <div class="form-group">
        <input class="form-control" type="text" name="description" placeholder="Description: ">
        </div>
        <div class="form-group">
        <input class="form-control" type="number" step="0.01" name="price"  placeholder="Price: ">
        </div>
        <div class="form-group">
        <select class="form-control" name="category.id" size="1">
            <c:forEach items="${categories}" var="category">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>
        </div>
        <div class="form-group">
        <input type="file"  class="form-control-file"  name="image">
        </div>
        <button type="submit" class="btn btn-primary">Add Product</button>
    </form>
    <c:if test="${not empty message}">
        ${message}
    </c:if>
        </div>
    </div>
</body>
</html>
