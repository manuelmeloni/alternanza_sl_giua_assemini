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
			#tabellaInserimentoPazienti, #tabellaListaPazienti { border-style: solid !important; width: 90% !important; margin: 10px 5% 10px 5% !important; }
			#tabellaInserimentoPazienti .textField { width: 200px; height: 30px; }
			#tabellaInserimetoPazienti p { font-size: 14px !important; }
		</style>
	</head>
	<body>
		<%@ include file = "HeaderLogout.jsp" %>
		<%@ page import = "it.gov.giua.database.dao.DipendentiDAO" %>
		<%@ page import = "it.gov.giua.model.Dipendente" %>
		<%@ page import = "it.gov.giua.model.Utente" %>
		<%@ page import = "java.util.ArrayList" %>
		<%@ page import = "java.util.List" %>
		<%
		DipendentiDAO dDAO = new DipendentiDAO();
		String username = (String) session.getAttribute("username");
		Dipendente d = new Dipendente(dDAO.getDipendente(username));
		List<Utente> uList = dDAO.getAllUtenti();
		int uListLength = uList.size();
		%>
		<!-- Pagina della gestione del Dipendente -->
		<main>
			<div class="row" id="subNav">
				<ul class="nav nav-tabs nav-justified">
				  <li role="presentation"><a href="#prof">Gestione Profilo</a></li>
				  <li role="presentation"><a href="#tri">Gestione Triage</a></li>
				</ul>
			</div>
			<div class="row">
				<div class="jumbotron" id="modificaProfilo">
				  <a name="prof"><h2><i class="fas fa-user-md"></i> Gestione Profilo</h2></a>
				  <p>Nome: <strong><%= d.getNome() %></strong><em>(Non modificabile)</em></p>
					  <p>Cognome: <strong><%= d.getCognome() %></strong><em>(Non modificabile)</em></p>
					  <p>Nascita: <strong><%= d.getDataNascita() %></strong><em>(Non modificabile)</em></p>
					  <p>Codice Fiscale: <strong><%= d.getCodiceFiscale() %></strong><em>(Non modificabile)</em></p>
					  <p>Assunzione: <strong><%= d.getDataAssunzione() %></strong><em>(Non modificabile)</em></p>
					  <p>Licenziamento: <strong><% if (d.getDataLicenziamento() == null) { %>Attualmente Lavorando <% } else %><%= d.getDataLicenziamento() %></strong><em>(Non modificabile)</em></p>
					  <p>Categoria: <strong><%=d.getCategoria() %></strong><em>(Non modificabile)</em></p>
					  <p>Username: <strong><%=d.getUsername() %></strong> <input type="text" class="textField" name="username"/></p>
					  <p>E-mail: <strong><%= d.getEmail() %></strong> <input type="text" class="textField" name="email"/></p>
					  <p>Vecchia Password: <input type="password" class="textField" name="oldPass"/> Nuova Password:  <input type="password" class="textField" name="newPass"/></p>
					  <p>ID reparto di lavoro: <strong><%= d.getIdReparto() %></strong> <em>(Non modificabile)</em></p>
				</div>
			</div>
			<% if(d.getIdReparto() == 2) { %>
			<div class="row">
				<div class="jumbotron" id="gestioneTriage">
					<a name="tri"><h2>Gestione Triage</h2></a>
					<center>
						<td><p><p style="text-align: center !important; margin-right: 5px !important"><a class="btn btn-primary btn-lg" href="Ricovero.jsp" role="button">Ricoveri</a></p></p></td>
					</center>
					<table id="tabellaListaPazienti">
					   <tr>
					   		<th><strong>Nome Paziente</strong></th>
					   		<th><strong>Cognome Paziente</strong></th>
					   		<th><strong>Codice Fiscale</strong></th>
					   		<th><strong>Data Nascita</strong></th>
					   		<th></th>
					   </tr>
					   <%
					   for(int i = 0; i<uListLength; i++) {
					   %>
					   <tr>
					   		<td><%= uList.get(i).getNome() %></td>
					   		<td><%= uList.get(i).getCognome() %></td>
					   		<td><%= uList.get(i).getCodiceFiscale() %></td>
					   		<td><%= uList.get(i).getNascita() %></td>
					   		<td><p><p style="text-align: center !important; margin-right: 5px !important"><a class="btn btn-primary btn-lg" href="" role="button">Modifica Paziente</a></p></p></td>
					   </tr>
					   <%
					   }
					   %>
				   </table>
				   <table id="tabellaInserimentoPazienti">
				   		<tr>
				   			<th colspan="4">AGGIUNGI UN PAZIENTE</th>
				   		</tr>
				 		<tr>
				 			<td><p>Nome: <input type="text" class="textField" name="nomeUtente"/></p></td>
				 			<td><p>Cognome: <input type="text" class="textField" name="cognomeUtente"/></p></td>
				 			<td><p>Nascita (AAAA-MM-GG): <input type="text" class="textField" name="dataNscitaUtente"/></p></td>
				 			<td><p>Codice Fiscale: <input type="text" class="textField" name="codiceFiscaleUtente"/></p></td>
				 		</tr>
				 		<tr>
				 			<td colspan="4"><p><p style="text-align: center !important"><a class="btn btn-primary btn-lg" href="" role="button">Aggiungi Paziente</a></p></p></td>
				 		</tr>
				   </table>
				</div>
			</div>
			<% } %>
		</main>
		<%@ include file = "footer.jsp" %>
	</body>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</html>