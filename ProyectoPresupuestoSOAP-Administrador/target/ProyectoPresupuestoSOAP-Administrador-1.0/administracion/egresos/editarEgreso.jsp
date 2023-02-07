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
                <div class="title">Editar Egreso</div>
                <div class="content">
                    <form action="${pageContext.request.contextPath}/egreso?accion=editarEgreso" method="POST">

                        <input type="hidden" value="${egreso.idEgreso}" name="idEgreso">

                        <div class="user-details">
                            <div class="input-box">
                                <span class="details">Cuenta</span>
                                <select name="idCuenta" id="idCuenta" class="select-estado" required>                                    
                                    <c:forEach var="cuenta" items="${cuentas}">
                                        <c:if test="${cuenta.idCuenta != null}">
                                            <c:choose>
                                                <c:when test="${egreso.cuenta.idCuenta == cuenta.idCuenta}">
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
                                <span class="details">Saldo Egreso</span>
                                <input type="number" name="saldoEgreso" id="saldoEgreso" value="${egreso.saldoEgreso}" min="1" 
                                       pattern="[0-9]+" onpaste="return false;" onDrop="return false;" autocomplete=off onclick="validarSaldoEgresoNegativo(); validarInputEgreso();" step="any" placeholder="$0000.00" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Descripcion Egreso</span>
                                <input type="text" name="descripcion" id="descripcion" value="${egreso.descripcion}" required>
                            </div> 
                            <div class="input-box">
                                <span class="details">Fecha Egreso</span>
                                <input type="date" name="fechaEgreso" id="fechaEgreso" value="${egreso.fechaEgreso}" required>
                            </div>  
                            <div class="input-box">
                                <span class="details">Estado Egreso</span>
                                <select class="select-estado" name="estadoEgreso" value="${egreso.estadoEgreso}" required>
                                    <c:if test="${egreso.estadoEgreso != null}">
                                        <c:choose>
                                            <c:when test="${egreso.estadoEgreso == 'A'}">
                                                <option value="A" selected>Activo</option>
                                                <option value="I">Inactivo</option>
                                            </c:when>

                                            <c:when test="${egreso.estadoEgreso == 'I'}">
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
