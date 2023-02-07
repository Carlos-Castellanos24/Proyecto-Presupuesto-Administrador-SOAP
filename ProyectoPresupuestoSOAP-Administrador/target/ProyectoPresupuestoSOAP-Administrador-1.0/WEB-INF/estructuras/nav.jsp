<nav>
    <div class="logo-name">
        <div class="logo-image">
            <img src="${pageContext.request.contextPath}/assets/img/logo.png" alt=""/>
        </div>

        <span class="logo_name">Proyecto Presupuesto</span>
    </div>

    <div class="menu-items">
        <ul class="nav-links">
            <li><a href="${pageContext.request.contextPath}">
                    <i class="uil uil-estate"></i>
                    <span class="link-name">Inicio</span>
                </a></li>
            <li><a href="${pageContext.request.contextPath}/usuario?accion=listarUsuarios">
                    <i class="uil uil-user"></i>
                    <span class="link-name">Usuarios</span>
                </a></li>
            <li><a href="${pageContext.request.contextPath}/login?accion=listarLogin">
                    <i class="uil uil-folder-open"></i>
                    <span class="link-name">Registros</span>
                </a></li>
            <li><a href="${pageContext.request.contextPath}/cuenta?accion=listarCuentas">
                    <i class="uil uil-user-square"></i>
                    <span class="link-name">Cuentas</span>
                </a></li>
            <li><a href="${pageContext.request.contextPath}/ingreso?accion=listarIngresos">
                    <i class="uil uil-money-insert"></i>
                    <span class="link-name">Ingresos</span>
                </a></li>
            <li><a href="${pageContext.request.contextPath}/egreso?accion=listarEgresos">
                    <i class="uil uil-money-withdrawal"></i>
                    <span class="link-name">Egresos</span>
                </a></li>
        </ul>

        <ul class="logout-mode">
            <!--<li><a href="#">
                    <i class="uil uil-signout"></i>
                    <span class="link-name">Cerrar Sesi&oacute;n</span>
                </a></li>-->
            <li class="mode">
                <a href="#">
                    <i class="uil uil-moon"></i>
                    <span class="link-name">Modo Oscuro</span>
                </a>

                <div class="mode-toggle">
                    <span class="switch"></span>
                </div>
            </li>
        </ul>
    </div>
</nav>
