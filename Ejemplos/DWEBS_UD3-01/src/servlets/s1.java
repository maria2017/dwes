package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.util.resources.LocaleData;

/**
 * Servlet implementation class s1
 * indica el patron de la url, para cambiarlo. es el punto de entrada por el que se entra en 
 * la url
 */
@WebServlet("/fulanito")
public class s1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Nos permite devolver el contenido.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime date = LocalDateTime.now();
		PrintWriter out = response.getWriter();
		out.println("hola mundo desde mi primer servlet");
		out.println("son las " + date.getHour() + ":" + date.getMinute() + ":" + date.getSecond());
		// devuelve
		ServletContext cxt = this.getServletContext();
		//se puede obtener parametros iniciales...nos devuelve el value del nombre
		
		if (cxt.getInitParameter("appName") != null){
		out.println(cxt.getInitParameter("appName"));
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
