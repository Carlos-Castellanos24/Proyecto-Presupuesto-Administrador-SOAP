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
                <div class="title">Agregar Cuenta</div>
                <div class="content">
                    <form action="${pageContext.request.contextPath}/cuenta?accion=agregarCuenta" method="POST">

                        <input type="hidden" value="${cuenta.idCuenta}" name="idCuenta">

                        <div class="user-details">
                            <div class="input-box">
                                <span class="details">Usuario</span>
                                <select name="idLogin" id="idLogin" class="select-estado" required>                                    
                                    <c:forEach var="login" items="${registros}">
                                        <option value="${login.idLogin}" selected>${login.usuario.nombre} ${login.usuario.apellido}</option>
                                    </c:forEach>
                                </select>                           
                            </div>
                            <div class="input-box">
                                <span class="details">Numero de Cuenta</span>
                                <input type="text" name="numeroCuenta" id="numeroCuenta" placeholder="El numero de cuenta ser&aacute; agregado automaticamente." readonly required>
                            </div>
                            <div class="input-box">
                                <span class="details">Saldo Disponible</span>
                                <input type="number" name="saldoDisponible" id="saldoDisponible" placeholder="$0000.00" readonly step="any" required>
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
