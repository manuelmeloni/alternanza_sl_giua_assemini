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
        	
		PrelieviDAO dao = new PrelieviDAO();
		RicoveroDAO rdao= new RicoveroDAO();
		String codiceFiscale=req.getParameter("codiceFiscale");
		String codiceVisita=req.getParameter("codiceVisita");
		
		Prelievi pre= dao.getPrelievoByCodicePrelieviandCodiceFiscale(codiceFiscale,codiceVisita); 
		Ricovero rec =rdao.getRicoveroByCodicePrelieviandCodiceFiscale(codiceFiscale, codiceVisita);
		if(pre!=null) {
		HttpSession session= req.getSession();
		session.setAttribute("visita", pre);
		resp.sendRedirect("../AziendaOspedaliera/analisi.jsp");
		}
		else if( rec!=null) {
			
			HttpSession session= req.getSession();
			session.setAttribute("visita", rec);
			resp.sendRedirect("referto.jsp");
		}
		else {
			
			resp.sendRedirect("Home_Page.jsp");
			
		}
	}
	
	
	

}
