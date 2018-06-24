package com.arquitecturajava.aplicacion.main;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arquitecturajava.aplicacion.Libro;

public class Principal {

	public static void main(String[] args) {
		
		  Session session = null;
		  Transaction transaccion = null;
		  
		  try {
			  
			  SessionFactory factoria = new Configuration().configure().buildSessionFactory();
			  session = factoria.openSession();
//			  INSERTAR
			  
//			  transaccion = session.beginTransaction();
//			  Libro l = new Libro("2", "java", "programacion");
//			  session.saveOrUpdate(l);
//			  transaccion.commit();
			  
//			  CONSULTAR
			  
//			  Query consulta = session.createQuery("from Libro libro"); 
//			  List<Libro> lista = consulta.list();
			  
//			  for(Libro l: lista) {
				  
//				  System.out.println(l.getIsbn()); 
//				  System.out.println(l.getTitulo()); 
//				  System.out.println(l.getCategoria()); 
				  
//			  }
			  
//			  FILTRAR 1
			  
//			  Libro libro = (Libro) session.get(Libro.class,"2");
//			  System.out.println(libro.getTitulo());
			  
//			  BORRAR

//			  Libro libro = (Libro) session.get(Libro.class,"2"); 
//			  session.delete(libro);
//			  session.flush();
			  
//			  FILTRAR 2
			  
			  Query consulta = session.createQuery("from Libro libro where libro.categoria = :categoria");
			  consulta.setString("categoria", "Flores");
			  
			  List<Libro> lista = consulta.list();
			  
			  for(Libro l: lista) {
				  
				  System.out.println(l.getIsbn()); 
				  System.out.println(l.getTitulo()); 
				  System.out.println(l.getCategoria()); 
				  
			  }
			  
			  
		  } catch (HibernateException e) {
			  
			  System.out.println(e.getMessage());
			  transaccion.rollback();
			  
		  } finally {
			  
			  session.close();
		  }
		  
	}
	
}
