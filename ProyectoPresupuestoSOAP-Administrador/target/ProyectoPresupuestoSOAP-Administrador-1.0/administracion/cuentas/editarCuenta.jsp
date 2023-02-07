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
                <div class="title">Editar Cuenta</div>
                <c:choose>
                    <c:when test="${errorEditarCuenta != null}">
                        <p class="mensajeError"><span><%= session.getAttribute("errorEditarCuenta")%></span></p> 
                    </c:when>
                    <c:otherwise>
                    </c:otherwise>
                </c:choose>
                <div class="content">
                    <form action="${pageContext.request.contextPath}/cuenta?accion=editarCuenta" method="POST">

                        <input type="hidden" value="${cuenta.idCuenta}" name="idCuenta">

                        <div class="user-details">
                            <div class="input-box">
                                <span class="details">Usuario</span>
                                <select name="idLogin" id="idLogin" class="select-estado" required>                                    
                                    <c:forEach var="log" items="${login}">
                                        <c:if test="${log.idLogin != null}">
                                            <c:choose>
                                                <c:when test="${cuenta.login.idLogin == log.idLogin}">
                                                    <option value="${log.idLogin}" selected>${log.usuario.nombre} ${log.usuario.apellido}</option>
                                                </c:when>

                                                <c:otherwise>
                                                    <option value="${log.idLogin}">${log.usuario.nombre} ${log.usuario.apellido}</option>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:if>
                                    </c:forEach>
                                </select>                           
                            </div>
                            <div class="input-box">
                                <span class="details">Numero de Cuenta</span>
                                <input type="text" name="numeroCuenta" id="numeroCuenta" value="${cuenta.numeroCuenta}" readonly required>
                            </div>
                            <div class="input-box">
                                <span class="details">Saldo Disponible</span>
                                <input type="number" name="saldoDisponible" id="saldoDisponible" value="${cuenta.saldoDisponible}" min="1" pattern="[0-9]+" onpaste="return false;" onDrop="return false;" autocomplete=off onclick="validarSaldoCuentaNegativo(); validarInputSaldoCuenta();" placeholder="$0000.00" step="any" required>
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
