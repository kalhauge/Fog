<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html;charset=UTF-8"%>
<style>
    .container {
        margin: 5px;
        margin-right: 5px;
    }
</style>
<form method="post">
    <input type="hidden" name="oprettelse" value="oprettelse">
<div class="container">
    <div class="form-group">

        <label for="name">Fulde navn:</label>
        <input type="text" class="form-control" id="name"
               aria-describedby="kundeNavn" name="name">
    </div>

    <div class="form-group">
        <label for="address">Adresse:</label>
        <input type="text" class="form-control" id="address"
               aria-describedby="kundeAdresse" name="address">
    </div>

    <div class="form-group">
        <label for="postBy">Postnummer & By:</label>
        <input type="text" class="form-control" id="postBy"
               aria-describedby="kundePostBy" name="postBy">
    </div>

    <div class="form-group">
        <label for="tlfNummer">Telefon:</label>
        <input type="number" class="form-control" id="tlfNummer"
               aria-describedby="kundeTlfNummer" name="tlfNummer">
    </div>
    <div class="form-group">
        <label for="email">Email-adresse:</label>
        <input type="email" class="form-control" id="email"
               aria-describedby="kundeEmail" name="email">
    </div>
    <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" id="password"
               aria-describedby="kundepassword" name="password">
    </div>
    <div class="form-group">
        <label for="passwordrepeat">Gentag Password:</label>
        <input type="password" class="form-control" id="passwordrepeat"
               aria-describedby="passwordrepeat" name="passwordrepeat">
    </div>

    <div class="col-md-1">
                <form method="post" >
                    <input type="hidden" name="Opret" value="">
                    <button type="submit" class="btn btn-primary" >Opret</button>
                </form>
            </div>


</div>
</form>