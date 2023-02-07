function validarInputIngreso() {
    var input = document.getElementById('saldoIngreso');

    input.addEventListener('input', function () {
        if (this.value.length > 6)
            this.value = this.value.slice(0, 6);
    });
}

function validarInputEgreso() {
    var input = document.getElementById('saldoEgreso');

    input.addEventListener('input', function () {
        if (this.value.length > 6)
            this.value = this.value.slice(0, 6);
    });
}

function validarInputSaldoEnviar() {
    var input = document.getElementById('saldoEnviar');

    input.addEventListener('input', function () {
        if (this.value.length > 6)
            this.value = this.value.slice(0, 6);
    });
}

function validarInputSaldoCuenta() {
    var input = document.getElementById('saldoDisponible');
    
    input.addEventListener('input', function (){
        if (this.value.length > 6) {
            this.value = this.value.slice(0, 6);
        }
    });
}



