window.onload=generarEvento;

function generarEvento() {

	// genera el evento onsubmit a nivel de formulario de forma no intrusiva
	var miformulario= document.getElementById("miformulario");
	miformulario.onsubmit= function () {
		 validacion();
		 return false;
	
	}
}

function validacion() {
	//Revisar con el libro The Professional Javascrpipt Apress

	var isbn= document.getElementById("isbn");
	var miformulario=document.getElementById("miformulario");
	if(isbn.value==""){
		alert("datos no validos");
		return false;
	}else{
		miformulario.submit();
	}
}
