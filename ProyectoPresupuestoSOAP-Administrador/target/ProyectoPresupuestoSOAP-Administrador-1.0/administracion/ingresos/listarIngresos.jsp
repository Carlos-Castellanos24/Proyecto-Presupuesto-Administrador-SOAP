<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../WEB-INF/estructuras/validarSesionesIngreso.jsp" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                    <input type="text" id="busqueda" onkeyup="buscarIngreso()" placeholder="Buscar ingreso por usuario">
                </div>

                <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="">
            </div>
            <div class="dash-content">
                <div class="activity">                  
                    <div class="activity-data-table">
                        <div class="title-table">
                            <span class="text-table">Listado de Ingresos</span>
                            <a href="${pageContext.request.contextPath}/ingreso?accion=formularioAgregar">Agregar Ingreso</a>
                        </div>
                        <div>
                            <table id="datos">
                                <thead>
                                    <tr>
                                        <th><div class="data names">
                                                <span class="data-title">Id Ingreso</span>
                                            </div></th>
                                        <th><div class="data names">
                                                <span class="data-title">Usuario</span>
                                            </div></th>
                                        <th><div class="data names">
                                                <span class="data-title">Numero de Cuenta</span>
                                            </div></th>
                                        <th><div class="data">
                                                <span class="data-title">Saldo Ingreso</span>
                                            </div></th>
                                        <th><div class="data">
                                                <span class="data-title">Fecha Ingreso</span>
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
                                    <c:forEach var="ingreso" items="${ingresos}">
                                        <tr>
                                            <td><div class="data">
                                                    <span class="data-list">${ingreso.idIngreso}</span>
                                                </div></td>
                                            <td><div class="data">
                                                    <span class="data-list">${ingreso.cuenta.login.usuario.nombre} ${ingreso.cuenta.login.usuario.apellido}</span>
                                                </div></td>
                                            <td><div class="data">
                                                    <span class="data-list">${ingreso.cuenta.numeroCuenta}</span>
                                                </div></td>
                                            <td><div class="data">
                                                    <span class="data-list">$${ingreso.saldoIngreso}</span>
                                                </div></td>
                                            <td><div class="data">
                                                    <span class="data-list"><fmt:formatDate value="${ingreso.fechaIngreso.toGregorianCalendar().time}" pattern="yyyy-MM-dd"/></span>
                                                </div></td>
                                            <td><div class="data">
                                                    <c:if test="${ingreso.estadoIngreso != null}">
                                                        <c:choose>
                                                            <c:when test="${ingreso.estadoIngreso == 'A'}">
                                                                <span class="data-list">Activo</span>
                                                            </c:when>
                                                            <c:when test="${ingreso.estadoIngreso == 'I'}">
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
                                                        <a href="${pageContext.request.contextPath}/ingreso?accion=formularioEditar&idIngreso=${ingreso.idIngreso}" title="Editar Ingreso"><i class="uil uil-edit"></i></a>
                                                        <a href="${pageContext.request.contextPath}/ingreso?accion=inhabilitarIngreso&idIngreso=${ingreso.idIngreso}" title="Inhabilitar Ingreso"><i class="uil uil-trash-alt"></i></a>
                                                        <a href="${pageContext.request.contextPath}/ingreso?accion=detalles&idIngreso=${ingreso.idIngreso}" title="Detalles Ingreso"><i class="uil uil-info-circle"></i></a>
                                                    </span>
                                                </div></td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <p class="mensajeErrorLista"  id="mensajeError"><span></span></p>
                </div>
            </div>
        </section>
        <%--SCRIPTS--%>
        <jsp:include page="../../WEB-INF/estructuras/scripts.jsp"/>
    </body>
</html>
