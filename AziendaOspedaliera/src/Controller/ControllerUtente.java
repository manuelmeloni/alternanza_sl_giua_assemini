package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.gov.giua.model.Utente;
import it.gov.giua.database.dao.UtenteDAO;


@WebServlet("/ControllerUtente")
public class ControllerUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControllerUtente() {
		super();
		// TODO Auto-generated constructor stub
	}

/*	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}*/



	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        String cf=req.getParameter("CodiceFiscale");
        session.setAttribute("CodiceFiscale",cf );
        
		UtenteDAO dao=new UtenteDAO();
		
		try {
			if(dao.controlloCF(cf)==false){
				  resp.sendRedirect(req.getContextPath() + "/InserisciUtente.jsp");		
				 
			}
			
			else {
				session.setAttribute("InserimentoPaziente", dao.getUtentebyCodFiscale(cf));
				resp.sendRedirect(req.getContextPath() + "/InserisciRicovero.jsp");			
				 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
       
	
}
