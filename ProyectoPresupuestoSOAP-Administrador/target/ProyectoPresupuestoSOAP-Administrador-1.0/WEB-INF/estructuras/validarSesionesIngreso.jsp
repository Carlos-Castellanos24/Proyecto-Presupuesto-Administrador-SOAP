<%
    HttpSession sesion = request.getSession();
    
    String errorIngreso = (String) sesion.getAttribute("errorIngreso");
    String valorRango = (String) sesion.getAttribute("valorRango");
    
    if (errorIngreso != null || valorRango != null) {
      sesion.removeAttribute("errorIngreso");
      sesion.removeAttribute("valorRango");
    }
%>
