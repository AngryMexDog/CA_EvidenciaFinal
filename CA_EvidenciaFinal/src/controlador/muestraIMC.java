package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "/muestraIMC", urlPatterns = {"/muestraIMC"})
public class muestraIMC extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTH-8");
		
		
		String n1 = request.getParameter("peso");
		String n2 = request.getParameter("altura");
		modelo.IMC m = new modelo.IMC(n1, n2);
		
		m.calcularIMC();
		
		//dejar espacio para codigo referente a cookies
		
		request.setAttribute("ResultIMC", m);
		request.getRequestDispatcher("/Resultados.jsp").forward(request, response);
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	//@Override
    public String getServletInfo() {
        return "Cálculo de IMC";
    }
}
