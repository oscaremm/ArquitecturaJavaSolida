package com.arquitecturajava.aplicacion.acciones;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arquitecturajava.aplicacion.Libro;

public class BorrarLibroAccion extends Accion {
	
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) {
		
		String isbn = request.getParameter("isbn");
		Libro libro = new Libro(isbn);
		libro.borrar();
		
		return "MostrarLibros.do";
		
	}

}
