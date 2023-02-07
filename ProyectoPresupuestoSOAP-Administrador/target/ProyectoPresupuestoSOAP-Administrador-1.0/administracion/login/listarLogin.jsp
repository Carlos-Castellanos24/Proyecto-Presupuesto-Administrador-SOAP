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
                    <input type="text" id="busqueda" onkeyup="buscarLogin()" placeholder="Buscar login por correo">
                </div>

                <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="">
            </div>
            <div class="dash-content">
                <div class="activity">                   
                    <div class="activity-data-table">
                        <div class="title-table">
                            <span class="text-table">Listado de Registros</span>
                            <a href="${pageContext.request.contextPath}/login?accion=formularioAgregar">Agregar Login</a>
                        </div>
                        <table class="table-list" id="datos">
                            <thead>
                                <tr>
                                    <th><div class="data names">
                                            <span class="data-title">Id Login</span>
                                        </div></th>
                                    <th><div class="data names">
                                            <span class="data-title">Usuario</span>
                                        </div></th>
                                    <th><div class="data">
                                            <span class="data-title">Correo</span>
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
                                <c:forEach var="log" items="${login}">
                                    <tr>
                                        <td><div class="data">
                                                <span class="data-list">${log.idLogin}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">${log.usuario.nombre} ${log.usuario.apellido}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">${log.correo}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <c:if test="${log.estadoLogin != null}">
                                                    <c:choose>
                                                        <c:when test="${log.estadoLogin == 'A'}">
                                                            <span class="data-list">Activo</span>
                                                        </c:when>
                                                        <c:when test="${log.estadoLogin == 'I'}">
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
                                                    <a href="${pageContext.request.contextPath}/login?accion=formularioEditar&idLogin=${log.idLogin}" title="Editar Login"><i class="uil uil-edit"></i></a>
                                                    <a href="${pageContext.request.contextPath}/login?accion=inhabilitarLogin&idLogin=${log.idLogin}" title="Inhabilitar Login"><i class="uil uil-trash-alt"></i></a>
                                                    <a href="${pageContext.request.contextPath}/login?accion=detalles&idLogin=${log.idLogin}" title="Ver Detalles"><i class="uil uil-info-circle"></i></a>
                                                    <a href="${pageContext.request.contextPath}/login?accion=generarToken&idLogin=${log.idLogin}" title="Generar Token"><i class="uil uil-envelope-alt"></i></a>
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
