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

import org.apache.jasper.tagplugins.jstl.core.Out;

import it.gov.giua.database.dao.LoginDAO;
import it.gov.giua.model.Login;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String sessionUsername;  
	int sessionRole;
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        
        String username = request.getParameter("user");
        String pass = request.getParameter("pw");
        int categoria= LoginDAO.getCategoria(username);
        //utilizzo delle variabili di sessione per tenere salvato, durante il corso delle jsp, il nomeutente del dottore/amministratore
        //setto come attributo di sessione l'username
        
        session.setAttribute("username", username);
        session.setAttribute("role", categoria);	
        //mi ricavo l'attributo di sessione per testarlo
        sessionUsername= (String) session.getAttribute("username");
        out.println("Scope della sessione "+sessionUsername);
        if(LoginDAO.checkUser(username, pass))
        {
        	
            RequestDispatcher rs = request.getRequestDispatcher("ControllerAdminEmployee");
            rs.forward(request, response);
        }
        else
        {			
           out.println("L'username o la password sono incorrette!");
           RequestDispatcher rs = request.getRequestDispatcher("Home_Page.jsp");
           rs.include(request, response);
        }
    }  
	
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       /* if (request.getParameter("marca") != null)
        {
         //servlet chiamata da jsp
        HttpSession session = request.getSession();
        Auto a = new Auto();
        JsonObject myObj = new JsonObject();
        a.setMarca(request.getParameter("marca"));
        a.setModello(request.getParameter("modello"));
        a.setPotenza(Integer.parseInt(request.getParameter("potenza")));
        if (a.insert())
        {
           myObj.addProperty("success", Boolean.TRUE);
           System.out.println(a.getId());
           session.setAttribute("ID", a.getId());
        }
        
        else myObj.addProperty("success", Boolean.FALSE);
   
        response.getWriter().write(myObj.toString());
        }
        
        else {
            //forward a file .jsp
            ServletContext c = request.getServletContext();
            RequestDispatcher disp = null;
            disp = c.getRequestDispatcher("/inserisci_auto.jsp");
            disp.forward(request, response);
        }
            */        
                    
                }

	
}
