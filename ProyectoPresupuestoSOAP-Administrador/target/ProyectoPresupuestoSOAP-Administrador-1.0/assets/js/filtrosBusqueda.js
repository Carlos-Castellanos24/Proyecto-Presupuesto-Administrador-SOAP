function buscarUsuario() {
    var tabla = document.getElementById("datos");
    var textoBuscar = document.getElementById("busqueda").value.toLowerCase();
    var celdasFila = "";
    var encontrado = false;
    var comparar = "";
    
    for (var i = 1; i < tabla.rows.length; i++) {       
        celdasFila = tabla.rows[i].getElementsByTagName("td");
        encontrado = false;
        for (var j = 0; j < celdasFila.length && !encontrado; j++) {           
            comparar = celdasFila[j].innerHTML.toLowerCase();
            if (textoBuscar.length === 0 || (comparar.indexOf(textoBuscar) > -1)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            tabla.rows[i].style.display = '';
            document.getElementById('mensajeError').innerHTML = "";
        }else{
            tabla.rows[i].style.display = 'none';
            document.getElementById('mensajeError').innerHTML = "No se encontraron resultados";
        }
    }
}

function buscarLogin() {
    var tabla = document.getElementById("datos");
    var textoBuscar = document.getElementById("busqueda").value.toLowerCase();
    var celdasFila = "";
    var encontrado = false;
    var comparar = "";
    
    for (var i = 1; i < tabla.rows.length; i++) {       
        celdasFila = tabla.rows[i].getElementsByTagName("td");
        encontrado = false;
        for (var j = 0; j < celdasFila.length && !encontrado; j++) {           
            comparar = celdasFila[j].innerHTML.toLowerCase();
            if (textoBuscar.length === 0 || (comparar.indexOf(textoBuscar) > -1)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            tabla.rows[i].style.display = '';
            document.getElementById('mensajeError').innerHTML = "";
        }else{
            tabla.rows[i].style.display = 'none';
            document.getElementById('mensajeError').innerHTML = "No se encontraron resultados";
        }
    }
}

function buscarCuenta() {
    var tabla = document.getElementById("datos");
    var textoBuscar = document.getElementById("busqueda").value.toLowerCase();
    var celdasFila = "";
    var encontrado = false;
    var comparar = "";
    
    for (var i = 1; i < tabla.rows.length; i++) {       
        celdasFila = tabla.rows[i].getElementsByTagName("td");
        encontrado = false;
        for (var j = 0; j < celdasFila.length && !encontrado; j++) {           
            comparar = celdasFila[j].innerHTML.toLowerCase();
            if (textoBuscar.length === 0 || (comparar.indexOf(textoBuscar) > -1)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            tabla.rows[i].style.display = '';
            document.getElementById('mensajeError').innerHTML = "";
        }else{
            tabla.rows[i].style.display = 'none';
            document.getElementById('mensajeError').innerHTML = "No se encontraron resultados";
        }
    }
}

function buscarIngreso() {
    var tabla = document.getElementById("datos");
    var textoBuscar = document.getElementById("busqueda").value.toLowerCase();
    var celdasFila = "";
    var encontrado = false;
    var comparar = "";
    
    for (var i = 1; i < tabla.rows.length; i++) {       
        celdasFila = tabla.rows[i].getElementsByTagName("td");
        encontrado = false;
        for (var j = 0; j < celdasFila.length && !encontrado; j++) {           
            comparar = celdasFila[j].innerHTML.toLowerCase();
            if (textoBuscar.length === 0 || (comparar.indexOf(textoBuscar) > -1)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            tabla.rows[i].style.display = '';
            document.getElementById('mensajeError').innerHTML = "";
        }else{
            tabla.rows[i].style.display = 'none';
            document.getElementById('mensajeError').innerHTML = "No se encontraron resultados";
        }
    }
}

function buscarEgreso() {
    var tabla = document.getElementById("datos");
    var textoBuscar = document.getElementById("busqueda").value.toLowerCase();
    var celdasFila = "";
    var encontrado = false;
    var comparar = "";
    
    for (var i = 1; i < tabla.rows.length; i++) {       
        celdasFila = tabla.rows[i].getElementsByTagName("td");
        encontrado = false;
        for (var j = 0; j < celdasFila.length && !encontrado; j++) {           
            comparar = celdasFila[j].innerHTML.toLowerCase();
            if (textoBuscar.length === 0 || (comparar.indexOf(textoBuscar) > -1)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            tabla.rows[i].style.display = '';
            document.getElementById('mensajeError').innerHTML = "";
        }else{
            tabla.rows[i].style.display = 'none';
            document.getElementById('mensajeError').innerHTML = "No se encontraron resultados";
        }
    }
}


