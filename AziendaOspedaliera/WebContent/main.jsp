<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="it">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Notizie e Corsi</title>
    
    <!-- CSS -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/myStyle.css"/>
  	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat"/>
  	<link rel="stylesheet" type="text/css" href="Fontawesome/web-fonts-with-css/css/fontawesome-all.min.css"/>
  	<style type="text/css">
			body { font-family: 'Montserrat'; }
			.horizontal_space { width: 100%; height: 20px; float: left; }
			.column_space { width: 2.5%; height: 400px; float: left; }
			#maps { width: 100%; height: 500px; float: left; }
			h3 { margin-top: 0px !important; font-weight: bold !important; color: #307FE0; }
			h5 { margin: 0px !important; font-weight: bold !important; color: #307FE0; }
			.imgFontAwesome { font-size: 140px; text-align: center; color: #307FE0; }	
		</style>
  	<!--  FINE CSS -->
  	
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script> 
     
  </head>
  <body >
	<%@ include file = "header.jsp" %>
	   <%@ include file = "news.jsp" %>
	<%@ include file = "footer.jsp" %>
  </body>
  </html>
  
	