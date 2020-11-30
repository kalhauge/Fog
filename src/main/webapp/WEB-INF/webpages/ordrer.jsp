<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html;charset=UTF-8"%>
<div class="container">
    <br>
    <br>
<div class="row">
    <div class="col-md-2">
        Ordre nummer
    </div>
    <div class="col-md-2">
        Navn
    </div>
    <div class="col-md-2">
        Email
    </div>
    <div class="col-md-2">
        Pris
    </div>
    <div class="col-md-2">

    </div>
    <div class="col-md-2">

    </div>
</div>
<hr>
<c:forEach items="${requestScope.Orders}" var="ordreLinje" >
<div class="row">
    <div class="col-md-2">
            ${ordreLinje.orderID}

    </div>
    <div class="col-md-2">
        ${ordreLinje.customer.name}
    </div>
    <div class="col-md-2">
        ${ordreLinje.customer.email}
    </div>
    <div class="col-md-2">
        ${ordreLinje.price}
    </div>
    <div class="col-md-2">
    </div>
    <div class="col-md-2">
    </div>
</div>
</c:forEach>

<hr>
</div>
<form method="post" >
    <div class="text-right">
        <input type="hidden" name="afslut" >
        <button type="submit" class="btn btn-primary" >Afslut</button
    </div>
</form>


