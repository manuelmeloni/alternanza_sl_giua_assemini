<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,  initial-scale=1">

    <title>Home Page</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/myStyle.css" rel="stylesheet">
    <link href="css/fontawesome-free-5.0.8/web-fonts-with-css/css/fontawesome-all.css" rel="stylesheet">
      <link rel="stylesheet" type="text/css" href="Fontawesome/web-fonts-with-css/css/fontawesome-all.min.css"/>
  	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat"/>
  	<!-- scripts js -->
  	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script> 
    <script src="js/bootstrap.min.js"></script>
	<style>
		footer h5 { color: royalblue !important; }
	</style>
  </head>
  <body >
		<%@ include file = "header.jsp" %>
		<%@ include file = "home.jsp" %>
		<%@ include file = "footer.jsp" %>
	
	<!--script per l'apertura della lista d attesa-->
    <script>
function openNav() {
    document.getElementById("mySidenav").style.width = "200px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
   </script>


  </body>  
</html>