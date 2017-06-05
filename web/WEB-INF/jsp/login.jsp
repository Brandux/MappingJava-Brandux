<%-- 
    Document   : login
    Created on : 01/06/2017, 09:11:46 PM
    Author     : UPEU
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: Login :. || Acceso al medio</title>
        <link href="<c:url value="recursos/css/stilos.css"/>" rel="stylesheet" type="text/css"/>
        <%@include file="../../jspf/head.jspf" %>
    </head>
    <body>
        <div class="container">
            <div class="card card-container">
                <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
                <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
                <p id="profile-name" class="profile-name-card"></p>
                <form class="form-signin" method="post" action="logueo">
                    <span id="reauth-email" class="reauth-email"></span>
                    <input type="text" id="user" name="user" class="form-control" placeholder="ingresa User" required autofocus>
                    <input type="password" id="pass" name="pass" class="form-control" placeholder="Password" required>
                    <div id="remember" class="checkbox">
                        <label>
                            <input type="checkbox" value="remember-me"> Remember me
                        </label>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block btn-signin"  type="submit">Sign in</button>
                    <input type="hidden" value="1" name="conta" id="conta"/>
                </form><!-- /form -->
                <a href="#" class="forgot-password">
                    Forgot the password?
                </a>
            </div><!-- /card-container -->
        </div><!-- /container -->
        <script src="<c:url value="recursos/js/login.js"/>" type="text/javascript"></script>
        <%@include file="../../jspf/scripts.jspf" %>
    </body>
</html>
