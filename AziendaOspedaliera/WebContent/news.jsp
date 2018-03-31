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


<div class="album py-5 bg-light">
	<div class="container">
	<% 
	
	for(News current:newsList){
		
	
	
	%>
		<div class="row">
			<div class="col-md-4">
				<div class="card mb-4 box-shadow">
					<div class="card-body">
						<p class="card-text"><%= current.getSottotitolo() %></p>
						<div class="d-flex justify-content-between align-items-center">
							<div class="btn-group">
								<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	<%
	
	}
	%>
	</div>
</div>
</main>