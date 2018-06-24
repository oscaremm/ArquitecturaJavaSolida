package com.arquitecturajava.aplicacion.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.arquitecturajava.aplicacion.Libro;
import com.arquitecturajava.aplicacion.acciones.Accion;
import com.arquitecturajava.aplicacion.acciones.BorrarLibroAccion;
import com.arquitecturajava.aplicacion.acciones.FiltrarLibrosPorCategoriaAccion;
import com.arquitecturajava.aplicacion.acciones.FormularioEditarLibroAccion;
import com.arquitecturajava.aplicacion.acciones.FormularioInsertarLibroAccion;
import com.arquitecturajava.aplicacion.acciones.InsertarLibroAccion;
import com.arquitecturajava.aplicacion.acciones.ModificarLibroAccion;
import com.arquitecturajava.aplicacion.acciones.MostrarLibrosAccion;

/**
 * Servlet implementation class ControladorLibros
 */
public class ControladorLibros extends HttpServlet {
	/**
	 * @author      cecilio alvarez caules contacto@arquitecturajava.com
	 * @version     1.0                        
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher despachador = null;
		String url= request.getServletPath(); 
		Accion accion = Accion.getAccion(url.substring(1,url.length()-3));

		despachador = request.getRequestDispatcher(accion.ejecutar(request,response));
		despachador.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
