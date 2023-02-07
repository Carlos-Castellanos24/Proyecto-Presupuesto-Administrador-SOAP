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
                <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt="">
            </div> 
            <div class="dash-content">
                <div class="activity">
                    <div class="activity-data-table">
                        <div class="container-fluid">
                            <h4 class="text-center">Detalles acerca del login</h4>
                            <hr />
                            <div class="cont-detalles">
                                <p><b>Identificador del login:</b> ${login.idLogin}</p>
                                <p><b>Clave del login:</b> ${login.clave}</p>
                                <p><b>Correo del login:</b> ${login.correo}</p>
                                <p><b>Estado del login:</b> 
                                    <c:if test="${login.estadoLogin != null}">
                                        <c:choose>
                                            <c:when test="${login.estadoLogin == 'A'}">
                                                Activo
                                            </c:when>
                                            <c:when test="${login.estadoLogin == 'I'}">
                                                Inactivo
                                            </c:when>    
                                            <c:otherwise>
                                                No Definido
                                            </c:otherwise>
                                        </c:choose>
                                    </c:if>
                                </p>
                                <p><b>Token:</b> 
                                    <c:choose>
                                        <c:when test="${login.passwordToken != null}">
                                            ${login.passwordToken}
                                        </c:when>
                                        <c:when test="${login.passwordToken == null}">
                                            No hay token para este login.
                                        </c:when>
                                    </c:choose>
                                </p>
                                <p><b>Nombre del propietario:</b> ${login.usuario.nombre}</p>
                                <p><b>Apellido del propietario:</b> ${login.usuario.apellido}</p>
                                <p><b>Dui del propietario:</b> ${login.usuario.dui}</p>
                                <p><b>Telefono del propietario:</b> ${login.usuario.telefono}</p>
                                <p><b>Estado del propietario:</b> 
                                    <c:if test="${login.usuario.estadoUsuario != null}">
                                        <c:choose>
                                            <c:when test="${login.usuario.estadoUsuario == 'A'}">
                                                Activo
                                            </c:when>
                                            <c:when test="${login.usuario.estadoUsuario == 'I'}">
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
