package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.gov.giua.database.dao.LoginDAO;
import it.gov.giua.model.Login;

/**
 * Servlet implementation class ControllerLogin
 */
@WebServlet("/ControllerLogin")
public class ControllerLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.getParameter("user");
		request.getParameter("pw");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
		String username = request.getParameter("user");    
		String password = request.getParameter("pw");
		
		LoginDAO login= new LoginDAO();
		Login log= new Login();
		log= login.checkUser(username, password);
		
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
