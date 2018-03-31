<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="it.gov.giua.database.dao.LoginDAO"%>
<%@page import="it.gov.giua.model.Login"%> 
<%@page import="Controller.ControllerLogin" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Controllo Login</title>
</head>
<body>
	<%
		//"dao" permette la connessione con il DB
		LoginDAO dao = new LoginDAO();
		//Creo un oggetto di tipo login, che ottiene i dati necessari al login
		Login login = dao.checkUser(request.getParameter("user"),request.getParameter("pw"));
		int categoria= login.getCategoria();
		
		if(categoria==0){
			String redirectURL="http://localhost:8080/AziendaOspedaliera/chiSiamo.jsp";
			response.sendRedirect(redirectURL);
		}else{
			String redirectURL="http://localhost:8080/AziendaOspedaliera/Home_Page.jsp";
			response.sendRedirect(redirectURL);
		}
		//ControllerLogin contr= new ControllerLogin();
		%>
		

</body>
</html>