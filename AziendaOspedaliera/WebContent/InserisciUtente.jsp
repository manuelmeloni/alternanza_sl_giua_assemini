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
	<div style="padding-left:20%; padding-right:20%"> 
	<h2> DATI DEL PAZIENTE </h2>  
 
 
    
 	 
</div>

<form action="InserisciUtente" method="post">
	 <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
    <input type="text" class="form-control" name="CodiceFiscale" placeholder="Codice Fiscale" maxlength="16" >
  <div class="row">
    <div class="col">
      <input type="text" class="form-control" name="Nome"placeholder="Nome">
    </div>
    <div class="col">
      <input type="text" class="form-control" name="Cognome" placeholder="Cognome">
    </div>
    <div class="col">
      <input type="text" class="form-control" name="anno" placeholder="Cognome">
    </div>
    <div class="col">
      <input type="text" class="form-control" name="mese" placeholder="Cognome">
    </div>
    <div class="col">
      <input type="text" class="form-control" name="giorno" placeholder="Cognome">
    </div>
  
  </div>
  
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