<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
    <form action="/addProduct?_csrf=${_csrf.token}" method="post" enctype="multipart/form-data">
        <input type="text" name="name" placeholder="Name: ">
        <input type="text" name="description" placeholder="Description: ">
        <input type="number" step="0.01" name="price"  placeholder="Price: ">
        <select name="category.id" size="1">
            <c:forEach items="${categories}" var="category">
                <option value="${category.id}">${category.name}</option>
            </c:forEach>
        </select>
        <input type="file" name="image">
        <input type="submit" value="Add Product">
    </form>
    <c:if test="${not empty message}">
        ${message}
    </c:if>
</body>
</html>
