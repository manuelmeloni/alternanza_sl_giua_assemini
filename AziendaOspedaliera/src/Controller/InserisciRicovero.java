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
import it.gov.giua.model.Utente;

/**
 * Servlet implementation class InserisciRicovero
 */
@WebServlet("/InserisciRicovero")
public class InserisciRicovero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserisciRicovero() {
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
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        HttpSession session = req.getSession();
        // Utente paziente=(Utente)session.getAttribute("InserimentoPaziente");
        //recupero i dati dai form
        String diagnosi=req.getParameter("diagnosi");
        String terapia=req.getParameter("terapia");
        String codice_ricovero=req.getParameter("CodiceRicovero");
        String codice_colore=req.getParameter("CodiceColore");
        String anno1=req.getParameter("anno1");
        String mese1=req.getParameter("mese1");
        String giorno1=req.getParameter("giorno1");
        String ora1=req.getParameter("ora1");
        String minuti1=req.getParameter("minuti1");
        String anno2=req.getParameter("anno2");
        String mese2=req.getParameter("mese2");
        String giorno2=req.getParameter("giorno2");
        String ora2=req.getParameter("ora2");
        String minuti2=req.getParameter("minuti2");
        
        //recupero l'id del paziente memorizzato in sessione attraverso il metodo getID della classe utente
        int id_utente= ((Utente)session.getAttribute("InserimentoPaziente")).getID();
        
        RicoveroDAO dao= new RicoveroDAO();
      
        try {
        	//inserisco il ricovero nel DB attraverso il metodo setRicovero della classe RicoveroDAO
        	
        	dao.setRicovero(diagnosi, terapia, codice_ricovero, codice_colore, id_utente, anno1, mese1, giorno1, anno2, mese2, giorno2, ora1, minuti1, ora2, minuti2);
        	 
        	resp.sendRedirect(req.getContextPath() + "/Home_Page.jsp");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}

}
