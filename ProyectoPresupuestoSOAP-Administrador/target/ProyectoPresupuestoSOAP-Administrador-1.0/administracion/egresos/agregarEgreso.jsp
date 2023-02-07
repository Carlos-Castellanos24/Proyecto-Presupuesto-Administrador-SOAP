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
                <div class="title">Agregar Egreso</div>
                <div class="content">
                    <form action="${pageContext.request.contextPath}/egreso?accion=agregarEgreso" method="POST">
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
                                <span class="details">Saldo Egreso</span>
                                <input type="number" name="saldoEgreso" id="saldoEgreso" min="1" pattern="[0-9]+" onpaste="return false;" onDrop="return false;" autocomplete=off onclick="validarSaldoEgresoNegativo(); validarInputEgreso();" step="any" placeholder="$0000.00" required>
                            </div>
                            <div class="input-box">
                                <span class="details">Descripcion Egreso</span>
                                <input type="text" name="descripcion" id="descripcion" placeholder="Descripcion" required>
                            </div> 
                            <div class="input-box">
                                <span class="details">Fecha Egreso</span>
                                <input type="date" name="fechaEgreso" id="fechaEgreso" required>
                            </div>  
                            <div class="input-box">
                                <span class="details">Estado Egreso</span>
                                <select class="select-estado" name="estadoEgreso">
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
