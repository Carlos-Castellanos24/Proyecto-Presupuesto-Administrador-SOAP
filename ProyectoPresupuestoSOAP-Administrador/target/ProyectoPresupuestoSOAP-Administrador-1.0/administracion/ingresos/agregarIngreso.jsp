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
                <div class="title">Agregar Ingreso</div>
                <c:choose>
                    <c:when test="${errorIngreso != null}">
                        <p class="mensajeError"><span><%= session.getAttribute("errorIngreso")%></span></p>
                    </c:when>
                    <c:when test="${valorRango != null}">
                        <p class="mensajeError"><span><%= session.getAttribute("valorRango")%></span></p>
                    </c:when>
                    <c:otherwise>
                    </c:otherwise>
                </c:choose> 
                <div class="content">
                    <form action="${pageContext.request.contextPath}/ingreso?accion=agregarIngreso" method="POST">
                        <div class="user-details">
                            <div class="input-box">
                                <span class="details">Cuenta</span>
                                <select name="idCuenta" id="idCuenta" class="select-estado" required>                                    
                                    <c:forEach var="cuenta" items="${cuentas}">
                                        <option value="${cuenta.idCuenta}" selected>${cuenta.login.usuario.nombre} ${cuenta.login.usuario.apellido}</option>
                                    </c:forEach>
                                </select>                           
                            </div>
                            <div class="input-box">
                                <span class="details">Saldo Ingreso</span>
                                <input type="number" name="saldoIngreso" min="1" pattern="[0-9]+" onpaste="return false;" onDrop="return false;" autocomplete=off onclick="validarSaldoIngresoNegativo(); validarInputIngreso();" id="saldoIngreso" step="any" placeholder="$0000.00" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Descripcion Ingreso</span>
                                <input type="text" name="descripcion" id="descripcion" placeholder="Descripcion" required>
                            </div> 
                            <div class="input-box">
                                <span class="details">Fecha Ingreso</span>
                                <input type="date" name="fechaIngreso" id="fechaIngreso" required>
                            </div>  
                            <div class="input-box">
                                <span class="details">Estado Ingreso</span>
                                <select class="select-estado" name="estadoIngreso">
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
