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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
 <p><%=news.getTesto() %> </p>
</body>
</html>