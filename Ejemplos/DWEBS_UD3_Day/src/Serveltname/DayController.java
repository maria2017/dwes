package Serveltname;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.scene.layout.region.Margins.Converter;

/**
 * Servlet implementation class DayController
 */
@WebServlet("/DayController")
public class DayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DayController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalDateTime date = LocalDateTime.now();
		PrintWriter out = response.getWriter();
		out.println("hola mundo desde mi primer servlet");
		out.println("son las " + date.getHour() + ":" + date.getMinute() + ":" + date.getSecond());
		ServletContext cxt = this.getServletContext();
		int hour = (int) ChronoUnit.HOURS.between();
		if (hour > (8 * 15)){
			out.println(cxt.getInitParameter("DIURNO"));
			}else if(hour >= ()){}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
