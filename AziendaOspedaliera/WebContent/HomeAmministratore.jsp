<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Amministratore</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/myStyle.css" rel="stylesheet">
    <link href="css/fontawesome-free-5.0.8/web-fonts-with-css/css/fontawesome-all.css" rel="stylesheet">
      <link rel="stylesheet" type="text/css" href="Fontawesome/web-fonts-with-css/css/fontawesome-all.min.css"/>
  	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat"/>
</head>
<body>
	
	<%@ include file = "HeaderLogout.jsp" %>
	<%@ include file = "HomeAmministratore.html" %>
		<%@ page import = "it.gov.giua.database.dao.AdminDAO" %>
		<%@ page import = "it.gov.giua.database.dao.DipendentiDAO" %>
		<%@ page import = "it.gov.giua.model.Dipendente" %>
		<%@ page import = "it.gov.giua.model.Utente" %>
		<%@ page import = "java.util.ArrayList" %>
		<%@ page import = "java.util.List" %>
		<% 
		AdminDAO aDAO = new AdminDAO();
		DipendentiDAO dDAO = new DipendentiDAO();
		Dipendente a = new Dipendente(/*aDAO.getAmministratore()*/);
		List<Utente> uRepartoList = dDAO.getAllUtenti();
		int uRepartoListLength = uRepartoList.size();
		%>
		<div class="jumbotron">
		<div class="row">
			<table id="tabellaListaUtenti">
				   <tr>
				   		<th><strong>Nome Paziente</strong></th>
				   		<th><strong>Cognome Paziente</strong></th>
				   		<th><strong>Codice Fiscale</strong></th>
				   		<th><strong>Data Nascita</strong></th>
				   </tr>
				   <%
				   for(int i = 0; i<uRepartoListLength; i++) {
				   %>
				   <tr>
				   		<td><%= uRepartoList.get(i).getNome() %></td>
				   		<td><%= uRepartoList.get(i).getCognome() %></td>
				   		<td><%= uRepartoList.get(i).getCodiceFiscale() %></td>
				   		<td><%= uRepartoList.get(i).getNascita() %></td>
				   </tr>
				   <%
				   }
				   %>
			   </table>
			   <table id="tabellaUtente">
			   		<tr>
			   			<th colspan="4">AGGIUNGI UN PAZIENTE</th>
			   		</tr>
			 		<tr>
			 			<td><p>Nome: <input type="text" class="textField" name="nomeUtente"/></p></td>
			 			<td><p>Cognome: <input type="text" class="textField" name="cognomeUtente"/></p></td>
			 			<td><p>Nascita (AAAA-MM-GG): <input type="text" class="textField" name="dataNscitaUtente"/></p></td>
			 			<td><p>Codice Fiscale: <input type="text" class="textField" name="codiceFiscaleUtente"/></p></td>
			 		</tr>
			 		<tr>
			 			<td colspan="4"><p style="text-align: center !important"><a class="btn btn-primary btn-lg" href="" role="button">Aggiungi Paziente</a></p></td>
			 		</tr>
			   </table>
			</div>
		</div>
</body>
</html>