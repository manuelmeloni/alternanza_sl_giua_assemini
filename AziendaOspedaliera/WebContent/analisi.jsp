<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="it.gov.giua.database.dao.PrelieviDAO"%>
<%@page import="it.gov.giua.model.Prelievi"%>    
<%@page import="java.util.List"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Referto analisi</title>
<head>
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
  	<style type="text/css">
  		#header2{
  			width: 100%;
  			height: 150px;
  			background-color:#CACACA ;
  		}
  		#img{
  			float: left;
  			overflow: auto;
  			


  		}
  		h1{
  			color:royalblue;
  			 text-align: left;
  			 padding-top: 45px;
  			 float: right;
  			 padding-right: 600px;
  			 
  			

  			
  		}
  	</style>
  	<div id="header2">
  		<div style="padding-left: 250px;">
  			<img src="images/imgReferti.jpg" style="height:150px;width: 150px;;">
  			<h1 align="middle">	Referti e analisi mediche paziente</h1>
  		</div>
  	</div>	
  		<div style="background-color: #DADADA ">
  			
  			<p>REFERTO DEL PAZIENTE: <%  ((Prelievi)session.getAttribute("visita")).getCodice_visita();%></p>
  			<p>REFERTO DEL PAZIENTE: <%  ((Prelievi)session.getAttribute("visita")).getDipendenti_id_dipendente();%></p>
  			<p>REFERTO DEL PAZIENTE: <%  ((Prelievi)session.getAttribute("visita")).getId_prelievi();%></p>
  			<p>REFERTO DEL PAZIENTE: <%  ((Prelievi)session.getAttribute("visita")).getData_ora_prelievo();%></p>
  			<p>REFERTO DEL PAZIENTE: <%  ((Prelievi)session.getAttribute("visita")).getData_ora_fine();%></p>
  			<p>REFERTO DEL PAZIENTE: <%  ((Prelievi)session.getAttribute("visita")).getReferto();%></p>
  			
  			
  			
  			
  			
  			
  		</div>
  	  		

  
  	<%@ include file = "footer.jsp" %>
  </body>
