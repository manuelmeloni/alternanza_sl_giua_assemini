<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.List"%>
<%@page import="it.gov.giua.database.dao.NewsDAO"%>
<%@page import="it.gov.giua.model.News"%>
<%
int id = Integer.parseInt( request.getParameter("id"));
NewsDAO dao = new NewsDAO();
News news = dao.getSingleNews(id);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
    <link rel="stylesheet" type="text/css" href="css/myStyle.css"/>
  	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat"/>
  	<link rel="stylesheet" type="text/css" href="Fontawesome/web-fonts-with-css/css/fontawesome-all.min.css"/>
  	 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script> 
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
 	<%@ include file = "header.jsp" %>  	
 	<div class="jumbotron">
 	 <div class="container">
  	<h1><%=news.getTitolo() %></h1>
  		<p><%=news.getTesto() %> </p>
  	</div>
	</div>
 <%@ include file = "footer.jsp" %>
</body>
</html>