<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
    /* Modify the background color */

    .navbar-custom {
        background-color: #003D76;
    }
    .navbar-brand {
        border-color: #ae142a;
        text-transform: uppercase;
        font-family: Montserrat, "Helvetica Neue", Helvetica, Arial, sans-serif;
        font-weight: 700;
        color: #fff;
        background-color: #003D76;
    }
    .navbar-home {

        color: #ffffff;
        background-color: #003D76;
        margin: 5px;

    }
    .logo {
        width: 80px;
        height: 80px;
        border-radius: 0%;
        overflow: auto;
        margin-top: 0px;

    }
    .navbar-kontakt {
        color: #ffffff;
        margin: 5px;

    }
    .navbar-carporte {
        color: #FFFFFF;
        margin: 5px;

    }




    /* Modify brand and text color */


</style>
<nav class="navbar navbar-expand-md navbar-dark static-top navbar-custom ">
   <a class="logo" href="">
       <div class="logo">
           <img src="<c:url value="/images/fog2.png"/>" class="img-fluid">
       </div>
   </a>

    <a class="navbar-home" href=""> Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarCollapse">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">

            </li>

        </ul>
        <a class="navbar-carporte" href="">Carporte</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse3">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                </li>
            </ul>

        <a class="navbar-kontakt" href="">Kontakt</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarCollapse2">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item active">


                </li>

            </ul>

        <form class="form-inline mt-2 mt-md-0">

            <button class="Login-button" type="submit" enabled> Log ind</button>
        </form>
    </div>
</nav>