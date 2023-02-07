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
                <div class="title">Editar Login</div>
                <div class="content">
                    <form action="${pageContext.request.contextPath}/login?accion=editarLogin" method="POST">

                        <input type="hidden" value="${login.idLogin}" name="idLogin">
                        <input type="hidden" value="${claveSesion}" name="claveSesion" id="claveSesion">
                        
                        <div class="user-details">
                            <div class="input-box">
                                <span class="details">Usuario</span>
                                <select name="idUsuario" id="idUsuario" class="select-estado" required>                                    
                                    <c:forEach var="usuario" items="${usuarios}">
                                        <c:if test="${usuario.idUsuario != null}">
                                            <c:choose>
                                                <c:when test="${login.usuario.idUsuario == usuario.idUsuario}">
                                                    <option value="${usuario.idUsuario}" selected>${usuario.nombre} ${usuario.apellido}</option>
                                                </c:when>

                                                <c:otherwise>
                                                    <option value="${usuario.idUsuario}">${usuario.nombre} ${usuario.apellido}</option>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                    </c:forEach>
                                </select>                           
                            </div>
                            <div class="input-box">
                                <span class="details">Correo</span>
                                <input type="text" name="correo" id="correo" onkeypress="validarCorreo()" value="${login.correo}" placeholder="ejemplo@outlook.com" required>
                                <p><span class="span" id="alertaCorreo" style="color: red;"></span></p> 
                            </div>
                            <div class="input-box">
                                <span class="details">Contrase&ntilde;a</span>
                                <input type="text" name="clave" class="clave" id="clave" value="${login.clave}" placeholder="Escriba una contraseña" required>

                            </div>
                            <div class="input-box">
                                <span class="details">Repetir Contrase&ntilde;a</span>
                                <input type="text" name="clave2" class="clave2" id="clave2" value="${login.clave}" placeholder="Repita su contraseña" onkeyup="validarPassword()" required>
                                <p><span class="span" id="alerta" style="color: red;"></span></p> 
                            </div>
                            <div class="input-box">
                                <span class="details">Estado</span>
                                <select class="select-estado" name="estadoLogin" required>
                                    <c:if test="${login.estadoLogin != null}">
                                        <c:choose>
                                            <c:when test="${login.estadoLogin == 'A'}">
                                                <option value="A" selected>Activo</option>
                                                <option value="I">Inactivo</option>
                                            </c:when>

                                            <c:when test="${login.estadoLogin == 'I'}">
                                                <option value="A">Activo</option>
                                                <option value="I" selected>Inactivo</option>
                                            </c:when>    
                                        </c:choose>
                                    </c:if>
                                </select>
                            </div>
                        </div>             
                        <div class="button">
                            <input type="submit" value="Editar" id="envio">
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <%--SCRIPTS--%>
        <jsp:include page="../../WEB-INF/estructuras/scripts.jsp"/>
    </body>
</html>
