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
                            <h4 class="text-center">Detalles acerca del usuario</h4>
                            <hr />
                            <div class="cont-detalles">
                                <p><b>Identificador del usuario:</b> ${usuario.idUsuario}</p>
                                <p><b>Nombre:</b> ${usuario.nombre}</p>
                                <p><b>Apellido:</b> ${usuario.apellido}</p>
                                <p><b>Dui:</b> ${usuario.dui}</p>
                                <p><b>Telefono:</b> ${usuario.telefono}</p>
                                <p><b>Estado del usuario:</b> 
                                    <c:if test="${usuario.estadoUsuario != null}">
                                        <c:choose>
                                            <c:when test="${usuario.estadoUsuario == 'A'}">
                                                Activo
                                            </c:when>
                                            <c:when test="${usuario.estadoUsuario == 'I'}">
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
