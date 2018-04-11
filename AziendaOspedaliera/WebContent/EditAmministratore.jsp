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
			th, td { text-align: center; }
			td { width: 25% !important; }
			tr { height: 30px !important; }
			#tabellaUtente, #tabellaListaUtenti { border-style: solid !important; width: 90% !important; margin: 10px 5% 10px 5% !important; }
			#tabellaUtente .textField { width: 80% !important; margin: 5px 10% 5px 10% !important; height: 30px; }
			#tabellaUtente p { font-size: 14px !important; }
		</style>
	</head>
	<body>
		<%@ include file = "HeaderLogout.jsp" %>
		<%@ page import = "it.gov.giua.database.dao.AdminDAO" %>
		<%@ page import = "it.gov.giua.model.Dipendente" %>
		<%@ page import = "it.gov.giua.model.Utente" %>
		<%@ page import = "java.util.ArrayList" %>
		<%@ page import = "java.util.List" %>
		<% 
		AdminDAO aDAO = new AdminDAO();
		Dipendente a = new Dipendente(aDAO.getAmministratore());
		
		%>
		<!-- Pagina della gestione del Medico -->
		<main>
			<div class="row">
				<div class="jumbotron" id="modificaProfilo">
					<form action="${pageContext.request.contextPath}/EditMedicServlet" method="post">
					  <a name="prof"><h2><i class="fas fa-user-md"></i> Gestione Profilo</h2></a>
					  <p>Nome: <strong><%= a.getNome() %></strong><em>(Non modificabile)</em></p>
					  <p>Cognome: <strong><%= a.getCognome() %></strong><em>(Non modificabile)</em></p>
					  <p>Nascita: <strong><%= a.getDataNascita() %></strong><em>(Non modificabile)</em></p>
					  <p>Codice Fiscale: <strong><%= a.getCodiceFiscale() %></strong><em>(Non modificabile)</em></p>
					  <p>Assunzione: <strong><%= a.getDataAssunzione() %></strong><em>(Non modificabile)</em></p>
					  <p>Licenziamento: <strong><% if (a.getDataLicenziamento() == null) { %>Attualmente Lavorando <% } else %><%= a.getDataLicenziamento() %></strong><em>(Non modificabile)</em></p>
					  <p>Categoria: <strong><%= a.getCategoria() %></strong><em>(Non modificabile)</em></p>
					  <p>Username: <strong><%= a.getUsername() %></strong> <input type="text" class="textField" name="username"/></p>
					  <p>E-mail: <strong><%= a.getEmail() %></strong> <input type="text" class="textField" name="email"/></p>
					  <p>Vecchia Password: <input type="password" class="textField" name="oldPass"/> Nuova Password:  <input type="password" class="textField" name="newPass"/></p>
					  <p>ID reparto di lavoro: <strong><%= a.getIdReparto() %></strong> <em>(Non modificabile)</em></p>
					  <p><a class="btn btn-primary btn-lg" href="" role="submit">Salva le Modifiche</a></p>
					</form>
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