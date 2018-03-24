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
    <ul class="nav navbar-nav navbar-right">
     <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-pushpin"></span>Prenota visita </a>

      <div class="dropdown-menu">
     <form action="/action_page.php">
        <div class="input-group">
    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
    <input id="Codice Fiscale" type="text" class="form-control" name="codfis" placeholder="Codice Fiscale">
  </div>
<div class="input-group">
    <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
    <input id="Data" type="text" class="form-control" name="data" placeholder="GG/MM/AAAA">
  </div>
  <div class="input-group">
    <span class="input-group-addon"><i class="glyphicon glyphicon-time"></i></span>
    <input id="Ora" type="hour" class="form-control" name="ora" placeholder="00:00">
  </div>
      <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-pushpin"></span>Prenota</button>
     </form>
      </div>
    </li>
       
       <li class="nav-item dropdown">
      <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false"><span class="glyphicon glyphicon-log-in"></span>Accedi </a>
      <div class="dropdown-menu">
     <form action="/action_page.php">
      <div class="form-group">
       <label for="email">Email:</label>
        <input type="email" class="form-control" id="email">
      </div>
      <div class="form-group">
       <label for="pwd">Password:</label>
        <input type="password" class="form-control" id="pwd">
      </div>
      <div class="form-check">
       <label class="form-check-label">
        <input class="form-check-input" type="checkbox"> Ricorda
       </label>
      </div>
      <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-log-in"></span>Accedi</button>
     </form>
      </div>
    </li>
     </div>
  </div>
</nav>
