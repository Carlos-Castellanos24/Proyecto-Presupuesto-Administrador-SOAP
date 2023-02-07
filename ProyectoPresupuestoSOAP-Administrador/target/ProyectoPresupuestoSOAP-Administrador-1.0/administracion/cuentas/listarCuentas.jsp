<%@include file="../../WEB-INF/estructuras/validarSesionesCuenta.jsp" %>
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
                    <input type="text" id="busqueda" onkeyup="buscarCuenta()" placeholder="Buscar cuenta por numero de cuenta">
                </div>

                <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="">
            </div>
            <div class="dash-content">
                <div class="activity">             
                    <div class="activity-data-table">
                        <div class="title-table">
                            <span class="text-table">Listado de Cuentas</span>
                            <a href="${pageContext.request.contextPath}/cuenta?accion=formularioAgregar">Agregar Cuenta</a>
                        </div>
                        <table id="datos">
                            <thead>
                                <tr>
                                    <th><div class="data names">
                                            <span class="data-title">Id Cuenta</span>
                                        </div></th>
                                    <th><div class="data names">
                                            <span class="data-title">Propietario</span>
                                        </div></th>
                                    <th><div class="data">
                                            <span class="data-title">Correo</span>
                                        </div></th>
                                    <th><div class="data">
                                            <span class="data-title">Numero de Cuenta</span>
                                        </div></th>
                                    <th><div class="data">
                                            <span class="data-title">Saldo</span>
                                        </div></th>
                                    <th><div class="data">
                                            <span class="data-title">Accion</span>
                                        </div></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="cuenta" items="${cuentas}">
                                    <tr>
                                        <td><div class="data">
                                                <span class="data-list">${cuenta.idCuenta}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">${cuenta.login.usuario.nombre} ${cuenta.login.usuario.apellido}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">${cuenta.login.correo}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">${cuenta.numeroCuenta}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">$${cuenta.saldoDisponible}</span>
                                            </div></td>
                                        <td><div class="data">
                                                <span class="data-list">
                                                    <a href="${pageContext.request.contextPath}/cuenta?accion=formularioEditar&idCuenta=${cuenta.idCuenta}" title="Editar Cuenta"><i class="uil uil-edit"></i></a>
                                                    <a href="${pageContext.request.contextPath}/cuenta?accion=detalles&idCuenta=${cuenta.idCuenta}" title="Detalles Cuenta"><i class="uil uil-info-circle"></i></a>
                                                    <a href="${pageContext.request.contextPath}/cuenta?accion=formularioDinero&idCuenta=${cuenta.idCuenta}" title="Enviar Dinero"><i class="uil uil-money-insert"></i></a>
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
