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
        font-family: Montserrat,"Helvetica Neue",Helvetica,Arial,sans-serif;
        font-weight: 700;
        color: #fff;
        background-color: #003D76;

    }
    .logo {
        width: 100px;
        height: 100px;
        border-radius: 0%;
        overflow: auto;
        margin-top: -6px;
    }
    .navbar-home {
        border-color: #ae142a;
        text-transform: lowercase;
        font-family: Montserrat,"Helvetica Neue",Helvetica,Arial,sans-serif;
        font-weight: 700;
        color: #ffffff;
        background-color: #003D76;

    }
    /* Modify brand and text color */


</style>
<nav class="navbar navbar-expand-md navbar-dark fixed-top navbar-custom ">
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
                <a class="nav-link" href="#">Kontakt <span class="sr-only">(current)</span></a>

            </li>

        </ul>
        <form class="form-inline mt-2 mt-md-0">

            <button class="Login-button" type="submit" enabled> Log ind</button>
        </form>
    </div>
</nav>