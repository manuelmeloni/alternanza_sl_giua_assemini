<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="it.gov.giua.database.dao.UtenteDAO"%>
<%@page import="it.gov.giua.model.Utente"%>
<%@page import="it.gov.giua.database.dao.RicoveroDAO"%>
<%@page import="it.gov.giua.model.Ricovero"%>
<%@page import="Controller.ControllerUtente"%>



<div>

<% 
	UtenteDAO UD= new UtenteDAO(); 
	ControllerUtente CU=new ControllerUtente();
	%>

<form action="ControllerUtente.java" method="POST">

Coidce Fiscale: <input type="text" maxlength="16" name="codiceFiscale">
<input type="submit">


</form>



<form action="ControllerRicovero.java" method="POST">

	Diagnosi:<textarea name="Diagnosi"> </textarea>
	<br>
	Terapia: <textarea name="Terapia"></textarea>
	<br>
	Codice Ricovero: <input type="text" name="Codice_Ricovero"> </input>
	
	<input type="submit">
	
</form>


</div>