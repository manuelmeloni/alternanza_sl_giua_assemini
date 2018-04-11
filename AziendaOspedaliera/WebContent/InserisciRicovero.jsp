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
<form>
<textarea placeholder="Diagnosi" class="form-control" ></textarea>
<br>
<textarea placeholder="Terapia" class="form-control" ></textarea>
<br>
 <input type="text" class="form-control" placeholder="CodiceRicovero">
  <br>
  
  
  <input type="text" class="form-control" placeholder="Codice Colore, ex: 1,2,3,4">

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