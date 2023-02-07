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
                <div class="title">Enviar Dinero</div> 
                <c:choose>
                    <c:when test="${errorIngresoCuenta != null}">
                        <p class="mensajeError"><span><%= session.getAttribute("errorIngresoCuenta")%></span></p>
                    </c:when>
                    <c:when test="${errorEgresoCuenta != null}">
                        <p class="mensajeError"><span><%= session.getAttribute("errorEgresoCuenta")%></span></p>
                    </c:when>
                    <c:when test="${errorEgresoWS != null}">
                        <p class="mensajeError"><span><%= session.getAttribute("errorEgresoWS")%></span></p>
                    </c:when>
                    <c:when test="${valorRango != null}">
                        <p class="mensajeError"><span><%= session.getAttribute("valorRango")%></span></p>
                    </c:when>
                    <c:when test="${numeroCuentaIgual != null}">
                        <p class="mensajeError"><span><%= session.getAttribute("numeroCuentaIgual")%></span></p>
                    </c:when>
                    <c:when test="${menorUno != null}">
                        <p class="mensajeError"><span><%= session.getAttribute("menorUno")%></span></p>
                    </c:when>
                    <c:otherwise>
                    </c:otherwise>
                </c:choose>                
                <div class="content">
                    <form action="${pageContext.request.contextPath}/cuenta?accion=enviarDinero" method="POST">

                        <input type="hidden" value="${cuenta.idCuenta}" name="idCuenta">

                        <div class="user-details">
                            <div class="input-box">
                                <span class="details">Persona que envia el Dinero</span>
                                <input type="text" name="nombrePersona" id="nombrePersona" value="${cuenta.login.usuario.nombre} ${cuenta.login.usuario.apellido}" readonly required>
                            </div>
                            <div class="input-box">
                                <span class="details">Numero de cuenta del Receptor</span>
                                <input type="text" name="numeroCuenta" id="numeroCuenta" maxlength="10" placeholder="Ingrese el numero de cuenta de la persona" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Saldo a Enviar</span>
                                <input type="number" name="saldoEnviar" id="saldoEnviar" min="1" pattern="[0-9]+" onpaste="return false;" onDrop="return false;" autocomplete=off onclick="validarSaldoEnvioNegativo(); validarInputSaldoEnviar();" placeholder="$0000.00" step="any" required>
                            </div>   
                            <div class="input-box">
                                <span class="details">Estado Envio</span>
                                <select class="select-estado" name="estado">
                                    <option value="A">Activo</option>
                                    <option value="I">Inactivo</option>
                                </select>
                            </div>
                        </div>             
                        <div class="button">
                            <input type="submit" value="Enviar" id="envio">
                        </div>
                    </form>
                </div>
            </div>
        </section>
        <%--SCRIPTS--%>
        <jsp:include page="../../WEB-INF/estructuras/scripts.jsp"/>
    </body>
</html>
