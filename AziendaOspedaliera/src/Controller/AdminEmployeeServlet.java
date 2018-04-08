package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import it.gov.giua.database.dao.LoginDAO;
import it.gov.giua.model.Login;


@WebServlet("/AdminEmployeeServlet")
public class AdminEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String sessionUsername;  
	int sessionRole;

    public AdminEmployeeServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        HttpSession session = request.getSession();
	        sessionUsername=(String)session.getAttribute("username");
	        out.println("contenuto di sessionUsername: ( "+sessionUsername+" )");
	        sessionRole=(int)session.getAttribute("role");
	        out.println("contenuto di sessionRole: ( "+sessionRole+" )");
	        switch(sessionRole) {
	        case 0:
	        	out.println("Benvenuto Admin "+sessionUsername);
	        	Login login= new Login();
	        	login.setCategoria(sessionRole);
	        	login.setUsername(sessionUsername);
	        break;
	        case 1:
	        	RequestDispatcher rd = request.getRequestDispatcher("EditMedico.jsp");
	        	rd.forward(request, response);
	        break;
	        case 2:
	        	out.println("Benvenuto Dottor "+sessionUsername);
	        break;	
	        }
	}
}
