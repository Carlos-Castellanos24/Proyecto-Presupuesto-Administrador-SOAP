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
                <div class="title">Agregar Login</div>
                <div class="content">
                    <form action="${pageContext.request.contextPath}/login?accion=agregarLogin" method="POST">
                        <div class="user-details">
                            <div class="input-box">
                                <span class="details">Usuario</span>
                                <select name="idUsuario" id="idUsuario" class="select-estado">                                    
                                    <c:forEach items="${usuarios}" var="usuario">
                                        <option value="${usuario.idUsuario}">${usuario.nombre} ${usuario.apellido}</option>
                                    </c:forEach>
                                </select>                           
                            </div>
                            <div class="input-box">
                                <span class="details">Correo</span>
                                <input type="text" name="correo" id="correo" onkeypress="validarCorreo()" placeholder="ejemplo@outlook.com" required>
                                <p><span class="span" id="alertaCorreo" style="color: red;"></span></p> 
                            </div>
                            <div class="input-box">
                                <span class="details">Contrase&ntilde;a</span>
                                <input type="password" name="clave" class="clave" id="clave" placeholder="Escriba una contraseña" required>

                            </div>
                            <div class="input-box">
                                <span class="details">Repetir Contrase&ntilde;a</span>
                                <input type="password" name="clave2" class="clave2" id="clave2" placeholder="Repita su contraseña" onkeyup="validarPassword()" required>
                                <p><span class="span" id="alerta" style="color: red;"></span></p> 
                            </div>
                            <div class="input-box">
                                <span class="details">Estado</span>
                                <select class="select-estado" name="estadoLogin" required>
                                    <option value="A">Activo</option>
                                    <option value="I">Inactivo</option>
                                </select>
                            </div>
                        </div>             
                        <div class="button">
                            <input type="submit" value="Agregar" id="envio">
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <%--SCRIPTS--%>
        <jsp:include page="../../WEB-INF/estructuras/scripts.jsp"/>
    </body>
</html>
