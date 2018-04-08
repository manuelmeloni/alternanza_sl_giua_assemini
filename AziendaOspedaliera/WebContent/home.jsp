
<div class="mydiv">
 <div id="mySidenav" class="sidenav" >
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <h3><i class="fas fa-circle" style="color:white"></i>&nbsp; XX persone</h3>
  <h3><i class="fas fa-circle" style="color:green"></i>&nbsp; XX persone</h3>
  <h3><i class="fas fa-circle" style="color:yellow"></i>&nbsp; XX persone</h3>
  <h3><i class="fas fa-circle" style="color:red"></i>&nbsp; XX persone</h3>
  </div>
  </div>
  <form role="form" action="ControllerPrelievi" method="POST">
  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
		
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-hidden="true">�</button>
				<h4 class="modal-title" id="myModalLabel">Log in</h4>
			</div> <!-- /.modal-header -->

			<div class="modal-body">
				
					<div class="form-group">
						<div class="input-group">
							<input type="text" class="form-control"name="codiceFiscale" id="codiceFiscale" placeholder="codiceFiscale">
							<label for="uLogin" class="input-group-addon glyphicon glyphicon-user"></label>
						</div>
					</div> <!-- /.form-group -->

					<div class="form-group">
						<div class="input-group">
							<input type="password" class="form-control" id="codiceVisita" placeholder="Codice visita" name="codiceVisita" >
							<label for="uPassword" class="input-group-addon glyphicon glyphicon-user"></label>
						</div> <!-- /.input-group -->
					</div> <!-- /.form-group -->
			</div> <!-- /.modal-body -->
	
			<div class="modal-footer">
				<button class="form-control btn btn-primary">Ok</button>

				<div class="progress">
					<div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="1" aria-valuemin="1" aria-valuemax="100" style="width: 0%;">
						<span class="sr-only">progress</span>
					</div>
				</div>
			</div> <!-- /.modal-footer -->
			
		
		
		</div><!-- /.modal-content -->
	</div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</form>
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
           
            <li style="margin-top:3%; float: left; list-style: none; position: relative; width: 234.75px;"><a class="btn btn-primary" data-toggle="modal" data-target="#myModal"><img src="images/file.svg" alt="Ritira documenti"><br><br><strong>Ritiro referti medici e cartella clinica </strong><br></a></li>
            <li style="margin-top:3%; float: left; list-style: none; position: relative; width: 234.75px;"><a href="#"><img src="images/clock.svg"><br><br><strong>Orari</strong><br>Apertura e chiusura dell'Ospedale</a></li>
            <li style="margin-top:3%; float: left; list-style: none; position: relative; width: 234.75px;"><a href="#"><img src="images/news.svg" alt="Leggi consigli dal reparto"><br><br><strong>News</strong><br>News dall' Ospedale</a></li>
           </ul>
            </div>
          </div>
        </div>    
</section>


<!--finestre collegamento alle news-->
    
 <div class="col-sm-12 col-md-12" style="height:100%; padding-right: 4%; padding-left: 4%;padding-top: 2%; background-color:#F0F0FF;float:all;">
  <div class="col-sm-10 col-md-12">
    <div class="thumbnail">
      <img src="images/medico.jpg" alt="" class="css">
      <div class="caption">
        <h3>Thumbnail label</h3>
        <p>...</p>
        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
      </div>
    </div>
  </div>
  
  <div class="col-sm-10 col-md-12">
    <div class="thumbnail">
      <img src="images/prelievo.jpg" alt="" class="css">
      <div class="caption">
        <h3>Prelievo</h3>
        <p>...</p>
        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
      </div>
    </div>
  </div> 
 </div> 

	<style>
		
	.modal-dialog {
	    width: 300px;
	}
	.modal-footer {
	    height: 70px;
	    margin: 0;
	}
	.modal-footer .btn {
	    font-weight: bold;
	}
	.modal-footer .progress {
	    display: none;
	    height: 32px;
	    margin: 0;
	}
	.input-group-addon {
	    color: #fff;
	    background: #3276B1;
	}
	</style>
	<script type="text/javascript">

$(document).ready(function(){
    $('.modal-footer button').click(function(){
		var button = $(this);

		if ( button.attr("data-dismiss") != "modal" ){
			var inputs = $('form input');
			var title = $('.modal-title');
			var progress = $('.progress');
			var progressBar = $('.progress-bar');

			inputs.attr("disabled", "disabled");

			button.hide();

			progress.show();

			progressBar.animate({width : "100%"}, 100);

			progress.delay(1000)
					.fadeOut(600);

			button.text("Close")
					.removeClass("btn-primary")
					.addClass("btn-success")
    				.blur()
					.delay(1600)
					.fadeIn(function(){
						title.text("Log in is successful");
						button.attr("data-dismiss", "modal");
					});
		}
	});

	$('#myModal').on('hidden.bs.modal', function (e) {
		var inputs = $('form input');
		var title = $('.modal-title');
		var progressBar = $('.progress-bar');
		var button = $('.modal-footer button');

		inputs.removeAttr("disabled");

		title.text("Log in");

		progressBar.css({ "width" : "0%" });

		button.removeClass("btn-success")
				.addClass("btn-primary")
				.text("Ok")
				.removeAttr("data-dismiss");
                
	});
});
</script>