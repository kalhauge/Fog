<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html;charset=UTF-8"%>
<div class="container">
    <br>
    <br>
<div class="row">
    <div class="col-md-1">
        Ordre nummer
    </div>
    <div class="col-md-1">
        tilbuds dato
    </div>
    <div class="col-md-1">
        ordre dato
    </div>
    <div class="col-md-1">
        levering
    </div>
    <div class="col-md-2">
        Navn
    </div>
    <div class="col-md-1">
        bredde
    </div>
    <div class="col-md-1">
        længde
    </div>
    <div class="col-md-1">
        bredde
    </div>
    <div class="col-md-1">
        længde
    </div>
    <div class="col-md-1">
        status
    </div>
</div>
<hr>
<c:forEach items="${requestScope.Orders}" var="ordreLinje" varStatus="loop">
<div class="row">
    <div class="col-md-1">
            ${ordreLinje.orderID}
    </div>
    <div class="col-md-1">
        ${ordreLinje.tilbudsdato}
    </div>
    <div class="col-md-1">
            ${ordreLinje.ordredato}
    </div>
    <div class="col-md-1">

    </div>
    <div class="col-md-2">
            ${requestScope.navne[loop.index]}
    </div>
    <div class="col-md-1">
        ${requestScope.carportbredder[loop.index]}
    </div>
    <div class="col-md-1">
            ${requestScope.carportlaengder[loop.index]}

    </div>
    <div class="col-md-1">

    </div>
    <div class="col-md-1">

    </div>
    <div class="col-md-1">
        ${ordreLinje.status}
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


