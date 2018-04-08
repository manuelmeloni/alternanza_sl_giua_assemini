<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="it.gov.giua.database.dao.NewsDAO"%>
<%@page import="it.gov.giua.model.News"%>

<main role="main"> <%
		//"dao" permette la connessione con il DB
		NewsDAO dao = new NewsDAO();
		//Creo un oggetto di tipo news, che ottiene le informazioni delle news principali
		News news = dao.getPrincipalNews();
		// creo una lista di tipo news, che ottiene tutte le news abilitate
		List<News> newsList= dao.getAllEnableNews(); 
		%>
<section class="jumbotron text-center">
	<div class="container">
		<h1 class="jumbotron-heading"><%=news.getTitolo() %></h1>
		<p class="lead text-muted">
			<%=news.getSottotitolo() %></p>
		<p>
			<a href="SingleView.jsp?id=<%=news.getId() %>" class="btn btn-primary my-2">View</a>
		</p>
	</div>
</section>


	<div class="container">
	<% 
	
	for(News current:newsList){
		
	
	
	%>

	        <div class="col-md-4">
	          <h2><%=current.getTitolo() %></h2>
	          <p><%=current.getSottotitolo() %></p>
	          <p><a class="btn btn-default" href="SingleView.jsp?id=<%=current.getId() %>" role="button">View details »</a></p>
	        </div>

	<%
	
	}
	%>
	</div>
</main>