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

import it.gov.giua.database.dao.RicoveroDAO;
import it.gov.giua.database.dao.UtenteDAO;

@WebServlet("/InserisciUtente")
public class InserisciUtente extends HttpServlet {

	public InserisciUtente() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        String nome=req.getParameter("Nome");
        String cognome=req.getParameter("Cognome");
        String cf=req.getParameter("CodiceFiscale");
        String anno=req.getParameter("anno");
        String mese=req.getParameter("mese");
        String giorno=req.getParameter("giorno");
        UtenteDAO dao= new UtenteDAO();
      
        try {
        	dao.setUtente(nome, cognome, cf,anno,mese,giorno);
        	 
        	resp.sendRedirect(req.getContextPath() + "/InserisciRicovero.jsp");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	}

	
