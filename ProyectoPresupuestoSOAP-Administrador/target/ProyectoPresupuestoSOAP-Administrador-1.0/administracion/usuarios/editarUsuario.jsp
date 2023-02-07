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
            <div class="container">
                <div class="title">Editar Usuario</div>
                <div class="content">
                    <form action="${pageContext.request.contextPath}/usuario?accion=editarUsuario&idUsuario=${usuarioEncontrado.idUsuario}" method="POST">
                        <div class="user-details">
                            <div class="input-box">
                                <span class="details">Nombres</span>
                                <input type="text" name="nombre" placeholder="Ingrese los nombres" value="${usuarioEncontrado.nombre}" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Apellidos</span>
                                <input type="text" name="apellido" placeholder="Ingrese los apellidos" value="${usuarioEncontrado.apellido}" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Dui</span>
                                <input type="text" name="dui" class="dui" maxlength="10" placeholder="00000000-0" value="${usuarioEncontrado.dui}" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Telefono</span>
                                <input type="text" name="telefono" class="telefono" maxlength="9" placeholder="0000-0000" value="${usuarioEncontrado.telefono}" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Estado</span>
                                <select class="select-estado" name="estadoUsuario" value="${usuarioEncontrado.estadoUsuario}" required>
                                    <c:if test="${usuarioEncontrado.estadoUsuario != null}">
                                        <c:choose>
                                            <c:when test="${usuarioEncontrado.estadoUsuario == 'A'}">
                                                <option value="A" selected>Activo</option>
                                                <option value="I">Inactivo</option>
                                            </c:when>

                                            <c:when test="${usuarioEncontrado.estadoUsuario == 'I'}">
                                                <option value="A">Activo</option>
                                                <option value="I" selected>Inactivo</option>
                                            </c:when>    
                                        </c:choose>
                                    </c:if>
                                </select>
                            </div>
                        </div>             
                        <div class="button">
                            <input type="submit" value="Editar">
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <%--SCRIPTS--%>
        <jsp:include page="../../WEB-INF/estructuras/scripts.jsp"/>
    </body>
</html>
