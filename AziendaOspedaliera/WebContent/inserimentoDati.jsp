<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="it.gov.giua.database.dao.UtenteDAO"%>
<%@page import="it.gov.giua.model.Utente"%>
<%@page import="it.gov.giua.database.dao.RicoveroDAO"%>
<%@page import="it.gov.giua.model.Ricovero"%>
<%@page import="Controller.ControllerUtente"%>



<div>

<form action="ControllerUtente" method="post">

Codice Fiscale: <input type="text" maxlength="16" name="codiceFiscale">
<input type="submit">


</form>






</div>