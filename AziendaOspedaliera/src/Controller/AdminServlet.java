package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import it.gov.giua.database.dao.AdminDAO;
import it.gov.giua.model.Dipendente;

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
	      HttpSession session = request.getSession(); 
	      Dipendente dip=new Dipendente(admin.getDipendente((String)session.getAttribute("username")));
	      //invocazione di un metodo classe dao
	     System.out.println(admin.updateDipendente(dip));
	     response.sendRedirect(request.getContextPath() + "/EditDipendente.jsp");//collegamento alla jsp
	     
	}
	

}
