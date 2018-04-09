  <div class="mydiv">
 <div id="mySidenav" class="sidenav" >
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <h3><i class="fas fa-circle" style="color:white"></i>&nbsp; XX persone</h3>
  <h3><i class="fas fa-circle" style="color:green"></i>&nbsp; XX persone</h3>
  <h3><i class="fas fa-circle" style="color:yellow"></i>&nbsp; XX persone</h3>
  <h3><i class="fas fa-circle" style="color:red"></i>&nbsp; XX persone</h3>
  </div>
  </div>

<section id="servizi" >
    <div class="container">
        <h1>Servizi</h1>
        <div align="center" class="contenitore1" style="max-width: 100%; margin: 0px auto;">
        	<div align="center"  style="  width: 100%; float:left; height: 30%;margin-bottom:3%">
        <ul  style="width: 100%; position: relative; transition-duration: 0s; transform: translate3d(0px, 0px, 0px);">
            


            <!--gestione lista d attesa con apertura della lista delle persone con conseguente codice-->
            <li  style="margin-top:3%; float: left; list-style: none; position: relative; width: 234.75px;">
            	<span style="max-width: 1200px; margin: 0px auto;" onclick="openNav()">
            		<a href="#">
            		<img src="images/list.svg" alt="Leggi consigli dal reparto"><br><br>
            			<strong>Pronto Soccorso</strong><br>Lista d'attesa pronto soccorso
            			</a>
            			</span>
            			</li>
            
            <!--servizi vari home page-->
            <li style="margin-top:3%; float: left; list-style: none; position: relative; width: 234.75px;"><a href="#prelievi"><img src="images/file.svg" alt="Ritira documenti"><br><br><strong>Ritiro referti medici e cartella clinica </strong><br></a></li>
            <li style="margin-top:3%; float: left; list-style: none; position: relative; width: 234.75px;"><a href="#"><img src="images/clock.svg"><br><br><strong>Orari</strong><br>Apertura e chiusura dell'Ospedale</a></li>
            <li style="margin-top:3%; float: left; list-style: none; position: relative; width: 234.75px;"><a href="#"><img src="images/news.svg" alt="Leggi consigli dal reparto"><br><br><strong>News</strong><br>News dall' Ospedale</a></li>
           </ul>
            </div>
          </div>
        </div>    
</section>


<!--finestre collegamento alle news-->
<a name="prelievi">    
 <div class="col-sm-12 col-md-12" style="height:100%; padding-right: 4%; padding-left: 4%;padding-top: 2%; background-color:#F0F0FF;float:all;">
  <div class="col-sm-10 col-md-12">
    <div class="thumbnail">
      <img src="images/medico.jpg" alt="" class="css">
      <div class="caption">
        <h3>Ritiro referti medici e cartella clinica</h3>
        <p>...</p>
        <p><a href="#myModal" class="btn btn-primary" role="button" data-toggle="modal" data-target="#myModal">Button</a></p>
      </div>
    </div>
  </div>
  
</a>  
  <div class="col-sm-10 col-md-12">
    <div class="thumbnail">
      <img src="images/prelievo.jpg" alt="" class="css">
      <div class="caption">
        <h3>Prelievo</h3>
        <p>...</p>
        <p><a href="#" class="btn btn-primary" role="button">Button</a></p>
      </div>
    </div>
  </div> 
 </div> 


    <div class="modal fade" id="myModal">
  <div class="modal-dialog">
  <form action="ControllerPrelievi" method="post">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <h4 class="modal-title">Accedi all'area privata</h4>
        </div>
        <div class="modal-body">
        
        
          <div class="form-group">
        <label for="username">Codice Fiscale</label>
        <input class="form-control" placeholder="Inserisci il Codice Fiscale" type="text" name="CodiceFiscale">
        </div>
      <div class="form-group">
        <label for="password">Codice Visita</label>
      <input class="form-control" id="password" placeholder="Inserisci il Codice Visita" name="CodiceVisita">
      </div>
        </div>
        <div class="modal-footer">
          <a href="#" data-dismiss="modal" class="btn">Chiudi</a>
          <input type="submit" value="Login" class="btn"/>
        </div>
      </div>
      </form>
    </div>
</div>
