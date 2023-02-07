<%
    HttpSession sesion = request.getSession();
    
    String errorIngresoCuenta = (String) sesion.getAttribute("errorIngresoCuenta");
    String errorEgresoCuenta = (String) sesion.getAttribute("errorEgresoCuenta");
    String errorEgresoWS = (String) sesion.getAttribute("errorEgresoWS");
    String valorRango = (String) sesion.getAttribute("valorRango");
    String numeroCuentaIgual = (String) sesion.getAttribute("numeroCuentaIgual");
    
    if(errorIngresoCuenta != null || errorEgresoCuenta != null || errorEgresoWS != null 
    || valorRango != null || numeroCuentaIgual != null){
        sesion.removeAttribute("errorIngresoCuenta");
        sesion.removeAttribute("errorEgresoCuenta");
        sesion.removeAttribute("errorEgresoWS");
        sesion.removeAttribute("valorRango");
        sesion.removeAttribute("numeroCuentaIgual");
    }   
%>
