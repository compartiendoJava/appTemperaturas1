$(document).ready(function script() {


  console.log('etamos en Script configuracion');

  $.ajax({

    type: 'GET',
    url: "doNumGraficosEntero",




  }).done(function (data) {

    console.log("Hecho Correcto!");
    console.log(data);
    switch (data) {


      case 1:
        console.log("swich1");
        var html2 = '';
        html2 += "<form action='doAgregarSetPoint1' method='POST'>";
        html2 += "<label> Introduce El Valor 1 Deseada:</label><input type='text' name='param1' class='form-control'></br></br>";
        html2 += "<input type='submit' value='set up'>";
        html2 += "</form>";
        html2 += '';
        $('#configuracion').append(html2);
        break;
      case 2:
        console.log("swich2");
        var html2 = '';
        html2 += "<form action='doAgregarSetPoint2' method='POST'>";
        html2 += "<label> Introduce El Valor 1 Deseada:</label><input type='text' name='param1' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 2 Deseada:</label><input type='text' name='param2' class='form-control'></br></br>";
        html2 += "<input type='submit' value='set up'>";
        html2 += "</form>";
        html2 += '';
        $('#configuracion').append(html2);

        break;
      case 3:
        console.log("swich3");
        var html2 = '';
        html2 += "<form action='doAgregarSetPoint3' method='POST'>";
        html2 += "<label> Introduce El Valor 1 Deseada:</label><input type='text' name='param1' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 2 Deseada:</label><input type='text' name='param2' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 3 Deseada:</label><input type='text' name='param3' class='form-control'></br></br>";
        html2 += "<input type='submit' value='set up'>";
        html2 += "</form>";
        html2 += '';
        $('#configuracion').append(html2);
        break;
      case 4:
        console.log("swich4");
        var html2 = '';
        html2 += "<form action='doAgregarSetPoint4' method='POST'>";
        html2 += "<label> Introduce El Valor 1 Deseada:</label><input type='text' name='param1' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 2 Deseada:</label><input type='text' name='param2' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 3 Deseada:</label><input type='text' name='param3' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 4 Deseada:</label><input type='text' name='param4' class='form-control'></br></br>";
        html2 += "<input type='submit' value='set up'>";
        html2 += "</form>";
        html2 += '';
        $('#configuracion').append(html2);
        break;
      case 5:
        console.log("swich5");
        var html2 = '';
        html2 += "<form action='doAgregarSetPoint5' method='POST'>";
        html2 += "<label> Introduce El Valor 1 Deseada:</label><input type='text' name='param1' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 2 Deseada:</label><input type='text' name='param2' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 3 Deseada:</label><input type='text' name='param3' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 4 Deseada:</label><input type='text' name='param4' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 5 Deseada:</label><input type='text' name='param5' class='form-control'></br></br>";
        html2 += "<input type='submit' value='set up'>";
        html2 += "</form>";
        html2 += '';
        $('#configuracion').append(html2);
        break;
      case 6:
        console.log("swich6");
        var html2 = '';
        html2 += "<form action='doAgregarSetPoint6' method='POST'>";
        html2 += "<label> Introduce El Valor 1 Deseada:</label><input type='text' name='param1' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 2 Deseada:</label><input type='text' name='param2' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 3 Deseada:</label><input type='text' name='param3' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 4 Deseada:</label><input type='text' name='param4' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 5 Deseada:</label><input type='text' name='param5' class='form-control'></br></br>";
        html2 += "<label> Introduce El Valor 6 Deseada:</label><input type='text' name='param6' class='form-control'></br></br>";
        html2 += "<input type='submit' value='set up'>";
        html2 += "</form>";
        html2 += '';
        $('#configuracion').append(html2);
        break;






    }


  }).fail(function () {
    console.log("Fallo!");
  })
    .always(function () {
      console.log("Completo!");
    });
})
