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

import it.gov.giua.database.dao.DipendentiDAO;

/**
 * Servlet implementation class EditMedicServlet
 */

@WebServlet("/EditMedicServlet")
public class EditMedicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public EditMedicServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String oldPass = request.getParameter("oldPass");
        String newPass = request.getParameter("newPass");
        DipendentiDAO d = new DipendentiDAO();
        String oldUsername = (String) session.getAttribute("username");
        if(d.getDipendente(oldUsername, oldPass)) {
        	int id = d.getIdDipendente(oldUsername);
        	out.println("Ciao + " + id);
        	if(username.length() >= 2 && username.length() <= 16) {
        		boolean state = true;
        		if((username.charAt(0) >= 65 && username.charAt(0) <= 90) && !(username.charAt(0) >= 97 && username.charAt(0) <= 122)) {
					for(int i=0; i<username.length(); i++) {
						if(!(username.charAt(i) >= 65 && username.charAt(i) <= 90) || !(username.charAt(i) >= 48 && username.charAt(i) <= 57) || !(username.charAt(i) == '_'))
							state = false;
					}
        		}
        		else
        			state = false;
        		if(state)
        			d.setUsername(username, id);
        	}
        	if(email.length() >= 8  && email.length() <= 64) {
        		boolean state1 = false;
        		boolean state2 = false;
        		for(int i=0; i<email.length(); i++) {
    				if(email.charAt(i) == '@' && !state1)
    					state1 = true;
    				if(email.charAt(i) == '.' && state1) {
    					state2 = true;
    					break;
    				}
    			}
        		if(state1 && state2)
        			d.setEmail(email, id);
        	}
        	if(newPass.length() >= 2 && newPass.length() <= 16) {
        		boolean state = true;
        		for(int i=0; i<newPass.length(); i++) {
    				if(!(newPass.charAt(i) >= 65 && newPass.charAt(i) <= 90) || !(newPass.charAt(i) >= 48 && newPass.charAt(i) <= 57) || !(newPass.charAt(i) >= 97 && newPass.charAt(i) <= 122))
    					state = false;
    			}
        		if(state)
        			d.setPassword(newPass, id);
        	}
        	RequestDispatcher rd = request.getRequestDispatcher("LogoutServlet");
        	rd.forward(request, response);
        }
        else {
        	out.println("ERRORE: username o password non corrette!");
        	RequestDispatcher rd = request.getRequestDispatcher("EditMedico.jsp");
        }
        session.setAttribute("dipendentiAccess", d); 
    }
}
