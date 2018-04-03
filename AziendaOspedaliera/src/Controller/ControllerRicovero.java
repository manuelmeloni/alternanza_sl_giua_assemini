package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import it.gov.giua.model.Ricovero;

/**
 * Servlet implementation class ControllerRicovero
 */
@WebServlet("/ControllerRicovero")
public class ControllerRicovero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerRicovero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		InserisciRicovero(request, response);
	}
	
	protected void InserisciRicovero(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
		Ricovero r=new Ricovero();
		r.setCodice_ricovero(request.getParameter("Codice_Ricovero"));   
		r.setDiagnosi(request.getParameter("Diagnosi"));    
		r.setTerapia(request.getParameter("Terapia"));
		
		
		response.getWriter().write("Ricovero.jsp");
		

}
	
}


