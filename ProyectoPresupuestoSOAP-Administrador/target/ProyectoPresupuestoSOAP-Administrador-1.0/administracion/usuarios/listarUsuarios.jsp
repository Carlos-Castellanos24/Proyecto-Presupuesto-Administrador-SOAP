<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%--META--%>
    <jsp:include page="../../WEB-INF/estructuras/head.jsp"/>
    <body>
        <%--NAV--%>
        <jsp:include page="../../WEB-INF/estructuras/nav.jsp"/>

        <section class="dashboard">
            <div class="top">
                <i class="uil uil-bars sidebar-toggle"></i>

                <div class="search-box">
                    <i class="uil uil-search"></i>
                    <input type="text" id="busqueda" onkeyup="buscarUsuario()" placeholder="Buscar usuario por nombre">
                </div>

                <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="">
            </div>
            <div class="dash-content">
                <div class="activity">
                    <div class="activity-data-table">
                        <div class="title-table">
                            <span class="text-table">Listado de Usuarios</span>
                            <a href="${pageContext.request.contextPath}/usuario?accion=formularioAgregar">Agregar Usuario</a>
                        </div>
                        <table class="table-list" id="datos">
                            <thead>
                                <tr>
                                    <th><div class="data names">
                                            <span class="data-title">Id Usuario</span>
                                        </div></th>
                                    <th><div class="data names">
                                            <span class="data-title">Nombre</span>
                                        </div></th>
                                    <th><div class="data">
                                            <span class="data-title">Apellido</span>
                                        </div></th>
                                    <th><div class="data">
                                            <span class="data-title">DUI</span>
                                        </div></th>
                                    <th><div class="data">
                                            <span class="data-title">Telefono</span>
                                        </div></th>
                                    <th><div class="data">
                                            <span class="data-title">Estado</span>
                                        </div></th>
                                    <th><div class="data">
                                            <span class="data-title">Accion</span>
                                        </div></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="usuario" items="${usuarios}">
                                    <tr>
                                        <td><div class="data">
                                                <span class="data-list">${usuario.idUsuario}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">${usuario.nombre}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">${usuario.apellido}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">${usuario.dui}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">${usuario.telefono}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <c:if test="${usuario.estadoUsuario != null}">
                                                    <c:choose>
                                                        <c:when test="${usuario.estadoUsuario == 'A'}">
                                                            <span class="data-list">Activo</span>
                                                        </c:when>
                                                        <c:when test="${usuario.estadoUsuario == 'I'}">
                                                            <span class="data-list">Inactivo</span>
                                                        </c:when>
                                                        <c:otherwise>
                                                            <span class="data-list">No Definido</span>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </c:if>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">
                                                    <a href="${pageContext.request.contextPath}/usuario?accion=formularioEditar&idUsuario=${usuario.idUsuario}" title="Editar Usuario"><i class="uil uil-edit"></i></a>
                                                    <a href="${pageContext.request.contextPath}/usuario?accion=inhabilitarUsuario&idUsuario=${usuario.idUsuario}" title="Inhabilitar Usuario"><i class="uil uil-trash-alt"></i></a>
                                                    <a href="${pageContext.request.contextPath}/usuario?accion=detalles&idUsuario=${usuario.idUsuario}" title="Detalles Usuario"><i class="uil uil-info-circle"></i></a>
                                                </span>
                                            </div></td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                    <p class="mensajeErrorLista"  id="mensajeError"><span></span></p>
                </div>
            </div>
        </section>
        <%--SCRIPTS--%>
        <jsp:include page="../../WEB-INF/estructuras/scripts.jsp"/>
    </body>
</html>
