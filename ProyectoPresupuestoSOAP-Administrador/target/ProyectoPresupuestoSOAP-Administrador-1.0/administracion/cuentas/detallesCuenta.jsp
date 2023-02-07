<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="">
            </div> 
            <div class="dash-content">
                <div class="activity">
                    <div class="activity-data-table">
                        <div class="container-fluid">
                            <h4 class="text-center">Detalles acerca de la cuenta</h4>
                            <hr />
                            <div class="cont-detalles">
                                <p><b>Identificador de la cuenta:</b> ${cuenta.idCuenta}</p>
                                <p><b>Numero de cuenta:</b> ${cuenta.numeroCuenta}</p>
                                <p><b>Saldo disponible:</b> $${cuenta.saldoDisponible}</p>
                                <p><b>Nombre del propietario:</b> ${cuenta.login.usuario.nombre}</p>
                                <p><b>Apellido del propietario:</b> ${cuenta.login.usuario.apellido}</p>
                                <p><b>Telefono del propietario:</b> ${cuenta.login.usuario.telefono}</p>
                                <p><b>Correo del login asociado:</b> ${cuenta.login.correo}</p>
                                <p><b>Estado del login:</b> 
                                    <c:if test="${cuenta.login.estadoLogin != null}">
                                        <c:choose>
                                            <c:when test="${cuenta.login.estadoLogin == 'A'}">
                                                Activo
                                            </c:when>
                                            <c:when test="${cuenta.login.estadoLogin == 'I'}">
                                                Inactivo
                                            </c:when>    
                                            <c:otherwise>
                                                No Definido
                                            </c:otherwise>
                                        </c:choose>
                                    </c:if>
                                </p>                              
                                <p><b>Estado del propietario:</b> 
                                    <c:if test="${cuenta.login.usuario.estadoUsuario != null}">
                                        <c:choose>
                                            <c:when test="${cuenta.login.usuario.estadoUsuario == 'A'}">
                                                Activo
                                            </c:when>
                                            <c:when test="${cuenta.login.usuario.estadoUsuario == 'I'}">
                                                Inactivo
                                            </c:when>    
                                            <c:otherwise>
                                                No Definido
                                            </c:otherwise>
                                        </c:choose>
                                    </c:if>
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <%--SCRIPTS--%>
        <jsp:include page="../../WEB-INF/estructuras/scripts.jsp"/>
    </body>
</html>
