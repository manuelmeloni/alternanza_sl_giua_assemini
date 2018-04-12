package Controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.gov.giua.database.dao.PrelieviDAO;
import it.gov.giua.database.dao.RicoveroDAO;
import it.gov.giua.model.Prelievi;
import it.gov.giua.model.Ricovero;



@WebServlet("/ControllerPrelievi")
public class ControllerPrelievi extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public ControllerPrelievi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        // creo due istanze dao, una per i prelievi e l'altra per i ricoveri; mi serviranno per il controllo	
		PrelieviDAO dao = new PrelieviDAO();
		RicoveroDAO rdao= new RicoveroDAO();
		
		String codiceFiscale=req.getParameter("codiceFiscale");
		String codiceVisita=req.getParameter("codiceVisita");
		
		//utilizzo il metodo per ottenere un ricovero o un prelievo inserendo codice fiscale e codice visita, in seguito controllo
		Prelievi pre= dao.getPrelievoByCodicePrelieviandCodiceFiscale(codiceFiscale,codiceVisita); 
		Ricovero rec =rdao.getRicoveroByCodicePrelieviandCodiceFiscale(codiceFiscale, codiceVisita);
		
		if(pre!=null) {
		HttpSession session= req.getSession();
		// setto l'attributo di sessione visita(prelievo) e reindirizzo
		session.setAttribute("visita", pre);
		resp.sendRedirect(req.getContextPath() + "/analisi.jsp");
		}
		else if( rec!=null) {
			
			HttpSession session= req.getSession();
			// setto l'attributo di sessione visita(ricovero) e reindirizzo
			session.setAttribute("visita", rec);
			resp.sendRedirect(req.getContextPath() + " /referto.jsp");
		}
		else {
			//se non sono presetni prelievi o ricoveri con il codice inserito il metodo restituisce una jsp
			resp.sendRedirect(req.getContextPath() + "Home_Page.jsp");
			
		}
	}
	
	
	

}
