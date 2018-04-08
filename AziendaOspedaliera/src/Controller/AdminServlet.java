package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.gov.giua.database.dao.AdminDAO;

@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  PrintWriter out = response.getWriter();
	      String username= request.getParameter("username");
	      AdminDAO admin= new AdminDAO();
	      //Dipendente d= new Dipendente(admin.insertDipendente(request.getParameter("dataNascita"), request.getParameter("nome"), cognome, codice_fiscale, mail, data_assunzione, data_licenziamento, categoria, username, password))
	}

}
