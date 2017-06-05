<%-- 
    Document   : Admin
    Created on : 03/06/2017, 09:17:20 AM
    Author     : Brandukosky
--%>
<%@page import="pe.edu.upeu.model.Personadto"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (session !=null){
        Personadto p = (Personadto) session.getAttribute("Persona");
    
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>.:Admin || Brandux :.</title>
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
                    <li><a href="#">Page 2</a></li>
                    
                    <li><a href="#"><%= p.getNonbre()%></a></li>
                    <li><a style="float: right" href="cerrar">Cerrar Session</a></li>

                </ul>
            </div>
        </nav> 
        <div class="container">
            
            <h2>Listado de Persona Normal </h2>
            <p>Aqui estan las tablas de todas las personas registradas:</p>            
            <table class="table">
                <thead>
                    <tr>   
                        <th>ID </th>
                        <th>Persona </th>
                        <th>Curso</th>
                        <th>Codigo</th>
                        <th>Usuario</th>
                        <th>Clave</th>
                        <th>Rol</th>
                        <th colspan="2">Opciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="d" begin="0" items="${ListaNormal}">                

                        <tr>
                            <td><c:out value="${d.idPersona}"></c:out></td>
                            <td><c:out value="${d.nonbre}"></c:out> , <c:out value="${d.apllido}"></c:out></td>
                            <td><c:out value="${d.curso}"></c:out></td>
                            <td><c:out value="${d.codigo}"></c:out></td>
                            <td><c:out value="${d.usuario}"></c:out></td>
                            <td><c:out value="${d.clave}"></c:out></td>
                            <td><c:out value="${d.idRol}"></c:out></td>
                                <td><input type="submit"class="btn btn-danger" value="Entrar"></td>
                            </tr>
                    </c:forEach>
                </tbody>
            </table>
            
            <!-- Listado Cempleando el Mapping -->
            
            <h2>Listado de Persona con Mappeo </h2>
            <p>Aqui estan las tablas de todas las personas registradas:</p>            
            <table class="table">
                <thead>
                    <tr>
                        <th>Persona </th>
                        <th>Curso</th>
                        <th>Codigo</th>
                        <th>Usuario</th>
                        <th>Clave</th>
                        <th>Rol</th>
                        <th colspan="2">Opciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="datos" begin="0" items="${persona}">                

                    <tr>
                        <td><c:out value="${datos.nombre}"></c:out> , <c:out value="${datos.apllido}"></c:out></td>
                        <td><c:out value="${datos.curso}"></c:out></td>
                        <td><c:out value="${datos.codigo}"></c:out></td>
                        <td><c:out value="${datos.user}"></c:out></td>
                        <td><c:out value="${datos.pass}"></c:out></td>
                        <td><c:out value="${datos.idrol}"></c:out></td>
                        <td><input type="submit"class="btn btn-danger" value="Entrar"></td>
                    </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <%@include file="../../jspf/scripts.jspf" %>
    <%}%>
    </body>
</html>
