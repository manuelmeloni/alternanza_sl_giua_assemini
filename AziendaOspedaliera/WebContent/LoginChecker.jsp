<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Controllo Login</title>
</head>
<body>
	<main><main role="main"> <%
		//"dao" permette la connessione con il DB
		LoginDAO dao = new LoginDAO();
		//Creo un oggetto di tipo login, che ottiene i dati necessari al login
		Login login = dao.CheckUser();
		ControllerLogin contr= new ControllerLogin();
		%>
		
</main>
</body>
</html>