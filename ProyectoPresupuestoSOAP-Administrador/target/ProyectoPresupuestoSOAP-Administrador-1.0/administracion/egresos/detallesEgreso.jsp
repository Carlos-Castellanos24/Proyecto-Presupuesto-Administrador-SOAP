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
                            <h4 class="text-center">Detalles acerca del egreso</h4>
                            <hr />
                            <div class="cont-detalles">
                                <p><b>Identificador del egreso:</b> ${egreso.idEgreso}</p>
                                <p><b>Saldo del egreso:</b> $${egreso.saldoEgreso}</p>
                                <p><b>Descripcion:</b> ${egreso.descripcion}</p>
                                <p><b>Fecha del egreso:</b> <fmt:formatDate value="${egreso.fechaEgreso.toGregorianCalendar().time}" pattern = "EEEE',' dd 'de' MMMM 'del' yyyy"/></p>
                                <p><b>Estado del egreso:</b> 
                                    <c:if test="${egreso.estadoEgreso != null}">
                                        <c:choose>
                                            <c:when test="${egreso.estadoEgreso == 'A'}">
                                                Activo
                                            </c:when>
                                            <c:when test="${egreso.estadoEgreso == 'I'}">
                                                Inactivo
                                            </c:when>    
                                            <c:otherwise>
                                                No Definido
                                            </c:otherwise>
                                        </c:choose>
                                    </c:if>
                                </p>
                                <p><b>Numero de cuenta del propietario:</b> ${egreso.cuenta.numeroCuenta}</p>
                                <p><b>Nombre del propietario:</b> ${egreso.cuenta.login.usuario.nombre} ${egreso.cuenta.login.usuario.apellido}</p>
                                <p><b>Telefono del propietario:</b> ${egreso.cuenta.login.usuario.telefono}</p>
                                <p><b>Correo del login asociado:</b> ${egreso.cuenta.login.correo}</p>
                                <p><b>Estado del login:</b> 
                                    <c:if test="${egreso.cuenta.login.estadoLogin != null}">
                                        <c:choose>
                                            <c:when test="${egreso.cuenta.login.estadoLogin == 'A'}">
                                                Activo
                                            </c:when>
                                            <c:when test="${egreso.cuenta.login.estadoLogin == 'I'}">
                                                Inactivo
                                            </c:when>    
                                            <c:otherwise>
                                                No Definido
                                            </c:otherwise>
                                        </c:choose>
                                    </c:if>
                                </p>                              
                                <p><b>Estado del propietario:</b> 
                                    <c:if test="${egreso.cuenta.login.usuario.estadoUsuario != null}">
                                        <c:choose>
                                            <c:when test="${egreso.cuenta.login.usuario.estadoUsuario == 'A'}">
                                                Activo
                                            </c:when>
                                            <c:when test="${egreso.cuenta.login.usuario.estadoUsuario == 'I'}">
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
