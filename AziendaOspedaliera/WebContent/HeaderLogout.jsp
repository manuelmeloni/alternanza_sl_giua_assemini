<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
     <nav class="navbar navbar-default" style="background-color:#F0F0FF; margin:0">
  <div class="container-fluid">
      <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      
       <a class="navbar-brand" href="Home_Page.jsp"><span class=" glyphicon glyphicon-header"></span> &nbsp; Azienda Ospedaliera</a>
      
      
       </div> 
     <span  class="col-sm-2">  </span>
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav navbar-nav">
      <li><a href="Home_Page.jsp">Home</a></li>
      <li><a href="chiSiamo.jsp">Chi siamo</a></li>
      <li><a href="DoveSiamo.jsp">Dove Siamo</a></li>
      <li><a href="main.jsp">News</a></li>
    </ul>
    <form action="LogoutServlet" method="post">
    <ul class="nav navbar-nav navbar-right">
       <li class="nav-item dropdown">
      	<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="" role="submit" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-log-in"></span>&nbsp;&nbsp;Esci </a>
    </li>
    </ul>
    </form>
     </div>
  </div>
</nav>