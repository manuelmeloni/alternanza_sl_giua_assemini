package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.gov.giua.model.Utente;
import it.gov.giua.database.dao.UtenteDAO;



public class ControllerUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerUtente() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		UtenteDAO dao=new UtenteDAO();
		
		try {
			if(dao.controlloCF(req.getParameter("CodiceFiscale"))==false){
				resp.sendRedirect("InserisciUtente.jsp");		
				
			}
			
			else {
				
				resp.sendRedirect("InserisciRicovero.jsp");			
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
       
	
}
