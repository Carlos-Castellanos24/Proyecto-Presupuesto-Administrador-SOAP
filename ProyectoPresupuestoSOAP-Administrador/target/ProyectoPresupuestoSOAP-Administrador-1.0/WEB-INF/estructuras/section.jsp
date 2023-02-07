<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<section class="dashboard">
    <div class="top">
        <i class="uil uil-bars sidebar-toggle"></i>

        <div class="search-box">
            <i class="uil uil-search"></i>
            <input type="text" id="busqueda" onkeyup="buscarIngreso()" placeholder="Buscar en actividad reciente">
        </div>
        <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt=""/>
    </div>

    <div class="dash-content">
        <div class="overview">
            <div class="title">
                <i class="uil uil-signal-alt-3"></i>
                <span class="text">Estadisticas</span>
            </div>

            <div class="boxes">
                <div class="box box1">
                    <i class="uil uil-user"></i>
                    <span class="text">Total Usuarios</span>
                    <span class="number">${usuariosIndex}</span>
                </div>
                <div class="box box2">
                    <i class="uil uil-folder-open"></i>
                    <span class="text">Total Registros</span>
                    <span class="number">${loginIndex}</span>
                </div>
                <div class="box box3">
                    <i class="uil uil-user-square"></i>
                    <span class="text">Total Cuentas</span>
                    <span class="number">${cuentasIndex}</span>
                </div>
                <div class="box box1">
                    <i class="uil uil-money-insert"></i>
                    <span class="text">Total Ingresos</span>
                    <span class="number">${ingresosIndex}</span>
                </div>
                <div class="box box3">
                    <i class="uil uil-money-withdrawal"></i>
                    <span class="text">Total Egresos</span>
                    <span class="number">${egresosIndex}</span>
                </div>
            </div>
        </div>

        <div class="activity">
            <div class="title">
                <i class="uil uil-clock-three"></i>
                <span class="text">Ingresos Recientes</span>
            </div>

            <div class="activity-data">
                <table style="text-align: center;" id="datos">
                    <thead>
                        <tr>
                            <th>
                                <div class="data names">
                                    <span class="data-title">Id Ingreso</span>
                                </div>
                            </th>
                            <th>
                                <div class="data names">
                                    <span class="data-title">Propietario de la Cuenta</span>
                                </div>
                            </th>
                            <th>
                                <div class="data names">
                                    <span class="data-title">Correo</span>
                                </div>
                            </th>
                            <th>
                                <div class="data names">
                                    <span class="data-title">Telefono</span>
                                </div>
                            </th>
                            <th>
                                <div class="data names">
                                    <span class="data-title">DUI</span>
                                </div>
                            </th>
                            <th>
                                <div class="data names">
                                    <span class="data-title">Numero de Cuenta</span>
                                </div>
                            </th>
                            <th>
                                <div class="data names">
                                    <span class="data-title">Fecha del Ingreso</span>
                                </div>
                            </th>
                            <th>
                                <div class="data names">
                                    <span class="data-title">Estado del Ingreso</span>
                                </div>
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="ingreso" items="${listaIngresosIndex}">
                        <tr>
                            <td>
                                <div class="data">
                                    <span class="data-list">${ingreso.idIngreso}</span>
                                </div>
                            </td>
                            <td>
                                <div class="data">
                                    <span class="data-list">${ingreso.cuenta.login.usuario.nombre} ${ingreso.cuenta.login.usuario.apellido}</span>
                                </div>
                            </td>
                            <td>
                                <div class="data">
                                    <span class="data-list">${ingreso.cuenta.login.correo}</span>
                                </div>
                            </td>
                            <td>
                                <div class="data">
                                    <span class="data-list">${ingreso.cuenta.login.usuario.telefono}</span>
                                </div>
                            </td>
                            <td>
                                <div class="data">
                                    <span class="data-list">${ingreso.cuenta.login.usuario.dui}</span>
                                </div>
                            </td>
                            <td>
                                <div class="data">
                                    <span class="data-list">${ingreso.cuenta.numeroCuenta}</span>
                                </div>
                            </td>
                            <td>
                                <div class="data">
                                    <span class="data-list"><fmt:formatDate value="${ingreso.fechaIngreso.toGregorianCalendar().time}" pattern="yyyy-MM-dd"/></span>
                                </div>
                            </td>
                            <td>
                                <div class="data">
                                    <c:if test="${ingreso.estadoIngreso != null}">
                                        <c:choose>
                                            <c:when test="${ingreso.estadoIngreso == 'A'}">
                                                <span class="data-list">Activo</span>
                                            </c:when>
                                            <c:when test="${ingreso.estadoIngreso == 'I'}">
                                                <span class="data-list">Inactivo</span>
                                            </c:when>
                                            <c:otherwise>
                                                <span class="data-list">No Definido</span>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:if>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>                                               
                    </tbody>
                </table>    
            </div>
            <p class="mensajeErrorLista"  id="mensajeError"><span></span></p>
        </div>
    </div>
</section>
