package Controller;

import java.io.IOException;
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
		UtenteDAO u =new UtenteDAO();
		if(u.getUtentebyCodFiscale(req.getParameter("codcieFiscale"))==null){
			InserisciUtente(req,resp);		//deve restituire la pagina per inserire i dati dell'utente (mancante)
			
		}
		
		else {
			
			resp.getWriter().write("Home.jsp");			//dovrebbe mostrare i dati dell'utente cercato (mancante)	
			
		}
	}
	
	protected void InserisciUtente(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
		
		// response.getWriter().write("utente.jsp");		//pagina per inserire i dati (mancante)
		Utente u=new Utente();
		u.setCodiceFiscale(request.getParameter("codiceFiscale"));
		u.setCognome(request.getParameter("Cognome"));    
		u.setNome(request.getParameter("Nome"));
		
		
		response.getWriter().write("Ricovero.jsp");
		

}
	
	
       
	
}
