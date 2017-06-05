<%-- 
    Document   : Entro
    Created on : 03/06/2017, 09:17:06 AM
    Author     : Brandukosky
--%>

<%@page import="pe.edu.upeu.model.Personadto"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Personadto p = (Personadto) session.getAttribute("Persona");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.: Inicio :.</title>
        <%@include file="../../jspf/head.jspf" %>

    </head>
    <body>
        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">WebSiteName</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Page 1-1</a></li>
                            <li><a href="#">Page 1-2</a></li>
                            <li><a href="#">Page 1-3</a></li>
                        </ul>
                    </li>
                    <% if (p.getIdRol()==1){ %>
                    <li><a href="#">Ver Notas</a></li>
                    <%}%>

                    <% if (p.getIdRol() == 2) { %>
                    <li><a href="#">Agregar Notas</a></li>
                    <%}%>
                    
                    
                    
                    <!-- Aqui va el modal para el perfil del cliente-->
                    <li><a href="" data-toggle="modal" data-target="#myModal"><%= p.getUsuario()%> </a></li>
                    <!-- Fin-->
                    
                    <!--Modal para el usuario -->
                    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                                    <h4 class="modal-title" id="myModalLabel">Acerca del Usuario</h4>
                                </div>
                                <div class="modal-body">
                                    <center>
                                        <img src="https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRbezqZpEuwGSvitKy3wrwnth5kysKdRqBW54cAszm_wiutku3R" name="aboutme" width="140" height="140" border="0" class="img-circle"></a>
                                        <h3 class="media-heading"><%= p.getNonbre() %> , <%= p.getApllido()%></h3>
                                        <span class="label label-warning">Curso : <%= p.getCurso() %></span>
                                        </center>
                                    <hr>
                                    <center>
                                        <p class="text-left"><strong>Descripcion: </strong><br>
                                            Usted es el usuario con codigo <strong> <%=p.getCodigo() %> </strong>
                                            Bienvenido al Sistema Academico <strong><%= p.getNonbre() %> , <%= p.getApllido()%> </strong> 
                                            Que tengas un buen dia..!!
                                        </p>
                                        <br>
                                    </center>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- FIN DE MODAL-->
                    
                    
                    
                    
                    
                    <li><a style="float: right" href="cerrar">Cerrar Session</a></li>
                </ul>
            </div>
        </nav> 
        <div class="container">

            <% if (p.getIdRol() == 1) { %>
                <h1> Hola Alumno: <strong><%= p.getNonbre()%>  <%= p.getApllido()%></strong> </h1>
            <%}else if (p.getIdRol() == 2){%>
                <h1> Hola Profesor: <strong><%= p.getNonbre()%>  <%= p.getApllido()%></strong> </h1>
            <%}%>
        </div>
        <%@include file="../../jspf/scripts.jspf" %>
    </body>
</html>
