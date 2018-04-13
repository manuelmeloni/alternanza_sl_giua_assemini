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
	<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Montserrat"/>
 <style type="text/css">
 	input { margin: 5px 10% 5px 10% !important; width: 80% !important; }
 	textarea { margin: 5px 10% 5px 10% !important; width: 80% !important; height: 60px !important; }
 	table { margin: 10px 20% 20px 20% !important; width: 60% !important; }
 	table th { height: 60px !important; }
 	table td p { text-align: center !important; }
 	table select { margin: 0px 20% 0px 20% !important; width: 60% !important; }
 </style>
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
<p>Codice Colore:<select class="form-control" style="margin: 15px 30% 15px 30% !important; width: 40% !important"" name="codice_colore">
	  	<option>0 (bianco)</option>
		<option>1 (verde)</option>
		<option>2 (giallo)</option>
		<option>3 (rosso)</option>
	</select></p>
<table>
<tr>
	<th colspan="3"><p>Data di Ingresso</p></th>
</tr>
<tr>
<td>
<p>Anno:<select class="form-control" style="width:auto" name="anno1"> 
			<option>2018</option>
		<option>2017</option>
		<option>2016</option>
		<option>2015</option>
		<option>2014</option>
		<option>2013</option>
	</select>
	</p>
	</td>
<td>
  	<p>Mese:
  		<select class="form-control" style="width:auto" name="mese1">
		    <option>01</option>
			<option>02</option>
			<option>03</option>
			<option>04</option>
			 <option>05</option>
			<option>06</option>
			<option>07</option>
			<option>08</option>
			 <option>09</option>
			<option>10</option>
			<option>11</option>
			<option>12</option>
		</select>
	</p>
</td>
<td>
	<p>Giorno:
		<input type="number" name="giorno1" min="1" max="31" style="margin: 0px 40% 0px 40% !important; width: 20% !important"/>
	</p>
</td>
</tr>
<tr>
	<th colspan="3"><p>Data di Uscita</p></th>
</tr>
<tr>
	<td>
<p>Anno:<select class="form-control" style="width:auto" name="anno2"> 
			<option>2018</option>
		<option>2017</option>
		<option>2016</option>
		<option>2015</option>
		<option>2014</option>
		<option>2013</option>
	</select>
	</p>
	</td>
<td>
  	<p>Mese:
  		<select class="form-control" style="width:auto" name="mese2">
		    <option>01</option>
			<option>02</option>
			<option>03</option>
			<option>04</option>
			 <option>05</option>
			<option>06</option>
			<option>07</option>
			<option>08</option>
			 <option>09</option>
			<option>10</option>
			<option>11</option>
			<option>12</option>
		</select>
	</p>
</td>
<td>
	<p>Giorno:
		<input type="number" name="giorno2" min="1" max="31" style="margin: 0px 40% 0px 40% !important; width: 20% !important"/>
	</p>
</td>
</tr>
</table>
  
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