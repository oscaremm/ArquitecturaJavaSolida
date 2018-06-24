package com.arquitecturajava.aplicacion.acciones;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arquitecturajava.aplicacion.Libro;

public class MostrarLibrosAccion extends Accion {
	
	public String ejecutar (HttpServletRequest request, HttpServletResponse response) {
		
		List<Libro> listaDeLibros = Libro.buscarTodos();
		List<String> listaDeCategorias = Libro.buscarTodasLasCategorias();
		request.setAttribute("listaDeLibros", listaDeLibros);
		request.setAttribute("listaDeCategorias", listaDeCategorias);
		
		return "MostrarLibros.jsp";
		
	}

}
