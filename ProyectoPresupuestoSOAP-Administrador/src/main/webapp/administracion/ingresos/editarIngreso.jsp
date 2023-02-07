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
                <div class="title">Editar Ingreso</div>
                <c:choose>
                    <c:when test="${errorFecha != null}">
                        <p class="mensajeError"><span><%= session.getAttribute("errorFecha")%></span></p> 
                    </c:when>
                    <c:otherwise>
                    </c:otherwise>
                </c:choose>
                <div class="content">
                    <form action="${pageContext.request.contextPath}/ingreso?accion=editarIngreso" method="POST">

                        <input type="hidden" value="${ingreso.idIngreso}" name="idIngreso">

                        <div class="user-details">
                            <div class="input-box">
                                <span class="details">Cuenta</span>
                                <select name="idCuenta" id="idCuenta" class="select-estado" required>                                    
                                    <c:forEach var="cuenta" items="${cuentas}">
                                        <c:if test="${cuenta.idCuenta != null}">
                                            <c:choose>
                                                <c:when test="${ingreso.cuenta.idCuenta == cuenta.idCuenta}">
                                                    <option value="${cuenta.idCuenta}" selected>${cuenta.login.usuario.nombre} ${cuenta.login.usuario.apellido}</option>
                                                </c:when>

                                                <c:otherwise>
                                                    <option value="${cuenta.idCuenta}">${cuenta.login.usuario.nombre} ${cuenta.login.usuario.apellido}</option>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                    </c:forEach>
                                </select>                           
                            </div>
                            <div class="input-box">
                                <span class="details">Saldo Ingreso</span>
                                <input type="number" name="saldoIngreso" id="saldoIngreso" value="${ingreso.saldoIngreso}" 
                                       min="1" pattern="[0-9]+" onpaste="return false;" onDrop="return false;" autocomplete=off onclick="validarSaldoIngresoNegativo(); validarInputIngreso();" step="any" placeholder="$0000.00" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Descripcion Ingreso</span>
                                <input type="text" name="descripcion" id="descripcion" value="${ingreso.descripcion}" required>
                            </div> 
                            <div class="input-box">
                                <span class="details">Fecha Ingreso</span>
                                <input type="date" name="fechaIngreso" id="fechaIngreso" value="${ingreso.fechaIngreso}" required>
                            </div>  
                            <div class="input-box">
                                <span class="details">Estado Ingreso</span>
                                <select class="select-estado" name="estadoIngreso" value="${ingreso.estadoIngreso}" required>
                                    <c:if test="${ingreso.estadoIngreso != null}">
                                        <c:choose>
                                            <c:when test="${ingreso.estadoIngreso == 'A'}">
                                                <option value="A" selected>Activo</option>
                                                <option value="I">Inactivo</option>
                                            </c:when>

                                            <c:when test="${ingreso.estadoIngreso == 'I'}">
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
