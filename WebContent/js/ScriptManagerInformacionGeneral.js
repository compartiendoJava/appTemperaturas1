$(document).ready(function () {
  var html = '';
  html += "<div id='inf'>";
  html += "<label>Nombre del Parametro &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label><input type='text' required='required' style='width:50% '  id='parametro'><br><br><br><br><br>";
  html += "<label>Temperatura Maxima &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label><input type='button' style='width:50% '  value='Max'id='tempmax'";
  html += "class='btn btn-default' style='width:10% '></br></br></br></br></br>";
  html += "<label>Temperatura Minima &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label><input type='button' style='width:50% ' value='Min' id='tempmin'";
  html += "class='btn btn-default' style='width:10%'></br></br></br></br></br>";
  html += "<label>Temperatura Media &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label><input type='button' style='width:50% ' value='Media'id='tempmedia'";
  html += "class='btn btn-default' style='width:10%'></br></br></br></br></br>";
  html += "</div>";

  $('body').append(html);
  $.ajax({

    type: 'GET',
    url: "doNumGraficosEntero",




  }).done(function (data) {

    console.log("Hecho Correcto!");
    console.log(data);
    switch (data) {


      case 1:
        console.log("swich1");

        var html = '';

        html += '<script src="js/informaciongeneral1.js"></script>';
        $('body').append(html);


        break;
      case 2:

        var html = '';




        html += "<script src='js/informaciongeneral2.js'></script>";

        $('body').append(html);

        break;
      case 3:

        var html = '';

        html += '<script src="js/informaciongeneral3.js"></script>';

        $('body').append(html);
        break;
      case 4:

        var html = '';

        html += '<script src="js/informaciongeneral4.js"></script>';

        $('body').append(html);
        break;
      case 5:

        var html = '';

        html += '<script src="js/informaciongeneral5.js"></script>';

        $('body').append(html);
        break;
      case 6:

        var html = '';

        html += '<script src="js/informaciongeneral6.js"></script>';

        $('body').append(html);
        break;






    }


  }).fail(function () {
    console.log("Fallo!");
  })
    .always(function () {
      console.log("Completo!");
    });


});