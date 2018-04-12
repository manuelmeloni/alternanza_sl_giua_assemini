<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ricovero</title>
 <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/myStyle.css" rel="stylesheet">
       <link rel="stylesheet" type="text/css" href="Fontawesome/web-fonts-with-css/css/fontawesome-all.min.css"/>
  	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat"/>
  	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

  
</head>
<body>

<%@ include file = "header.jsp" %>
	<center>
<h2> DATI DEL RICOVERO</h2>
<form action="InserisciRicovero" method="post">
<textarea placeholder="Diagnosi" class="form-control" name="diagnosi"></textarea>
<br>
<textarea placeholder="Terapia" class="form-control" name="terapia" ></textarea>
<br>
 <input type="text" class="form-control" placeholder="CodiceRicovero" name="codiceRicovero">
  <br>
  
  
  <select class="form-control" style="width:auto" name="codice_colore">
  <option>0 (bianco)</option>
	<option>1 (verde)</option>
	<option>2 (giallo)</option>
	<option>3 (rosso)</option>
	</select>
  
   <br>
  <div>
  <select class="form-control" style="width:auto" name="anno1">
  
  <option>2018</option>
	<option>2017</option>
	<option>2016</option>
	<option>2015</option>
	</select>
	</div>
	
	 <div>
  <select class="form-control" style="width:auto" name="mese1">
  
    <option>01</option>
	<option>02</option>
	<option>03</option>
	<option>04</option>
	</select>
	</div>
	
 <br>
  
  <input type="text" class="form-control" placeholder="Data di ingresso/giorno" name="giorno1"> <br>
  
   <input type="text" class="form-control" placeholder="Data di uscita/anno" name="anno2"> <br>
  <input type="text" class="form-control" placeholder="Data di uscita/mese" name="mese2"> <br>
  <input type="text" class="form-control" placeholder="Data di uscita/giorno" name="giorno2"><br>
  
  <button type="submit" value="login" class="btn btn-primary">Invia</button>
</form>






</div>
	</center>
	
<%@ include file = "footer.jsp" %>	
	  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>  
  
</body>
</html>