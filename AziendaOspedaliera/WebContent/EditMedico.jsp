<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>

<html lang="it">
	<head>
		<title>AziendaOspedaliera</title>
		<meta charset="utf-8"/>
		<meta name="author" content="Progetto A S/L Accenture - ITIS Michele Giua"/>
		<meta name="description" content="AziendaOspedaliera"/>
		<meta name="generator" content="Sublime Text 3, Eclipse Java EE, Blocco Note"/>
		<link rel="stylesheet" type="text/css" href="Fontawesome/web-fonts-with-css/css/fontawesome-all.min.css"/>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
		<link rel="stylesheet" type="text/css" href="css/myStyle.css"/>
		<link rel="stylesheet" type="text/css" href="css/DoveSiamoStyle.css"/>
		<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Montserrat"/>
		<script type="text/javascript">
			
		</script>
		<style type="text/css">
			body { font-family: 'Montserrat'; }
			main { height: auto; }
			.row { width: 98%; margin: 0px 1% 0px 1% !important; }
			#modificaProfilo p { text-align: left !important; }
			.jumbotron h2 { font-size: 40px !important; font-weight: bold !important; color: #337ab7 !important; padding-bottom: 20px !important; }
			.jumbotron h2, p { padding-left: 35px !important; }
			#imageAccount p { fon-size: 200px; text-align: center !important; }
			#subNav { padding-top: 30px;  padding-bottom: 30px; }
		</style>
	</head>
	<body>
		<%@ include file = "header.jsp" %>
		<!-- Pagina della gestione del Medico -->
		<main>
			<div class="row" id="subNav">
				<ul class="nav nav-tabs nav-justified">
				  <li role="presentation"><a href="#prof">Profilo</a></li>
				  <li role="presentation"><a href="#lisPaz">Lista Generale</a></li>
				  <li role="presentation"><a href="#lisProv">Lista Provvisoria</a></li>
				</ul>
			</div>
			<div class="row">
				<div class="jumbotron" id="modificaProfilo">
					<form action="EditMedicServlet" method="post">
					  <a name="prof"><h2>Gestione Profilo</h2></a>
					  <p>Nome: <strong>Nome Medico</strong><em>(Non modificabile)</em></p>
					  <p>Cognome: <strong>Cognome Medico</strong><em>(Non modificabile)</em></p>
					  <p>Nascita: <strong>Data Nascita Medico</strong><em>(Non modificabile)</em></p>
					  <p>Codice Fiscale: <strong>Codice Fiscale Medico</strong><em>(Non modificabile)</em></p>
					  <p>Assunzione: <strong>Data Assunzione Medico</strong><em>(Non modificabile)</em></p>
					  <p>Licenziamento: <strong>Data Licenziamento Medico</strong><em>(Non modificabile)</em></p>
					  <p>Categoria: <strong>1 (Medico)</strong><em>(Non modificabile)</em></p>
					  <p>Username: <strong>Username Medico</strong> <input type="text" class="textField" name="username"/></p>
					  <p>E-mail: <strong>E-mail Medico</strong> <input type="text" class="textField" name="email"/></p>
					  <p>Vecchia Password: <input type="password" class="textField" name="oldPass"/> Nuova Password:  <input type="password" class="textField" name="newPass"/></p>
					  <!-- Necessario DipendentiDAO -->
					  <p><a class="btn btn-primary btn-lg" href="" role="submit">Salva le Modifiche</a></p>
					</form>
				</div>
			</div>
			<div class="row">
				<div class="jumbotron" id="listaPazientiGenerale" name="lisPazGen">
				   <a name="lisPaz"><h2>Lista Pazienti</h2></a>
				    <!-- Necessario DipendentiDAO -->
				     <p><a class="btn btn-primary btn-lg" href="#" role="button">Aggiungi Paziente</a></p>
				</div>
			</div>
			<div class="row">
				<div class="jumbotron" id="listaPazientiReparto" name="lisPazProv">
				   <a name="lisProv"><h2>Lista Pazienti Provvisori</h2></a>
				   <!-- Necessario DipendentiDAO -->
				</div>
			</div>
		</main>
		<%@ include file = "footer.jsp" %>
	</body>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</html>