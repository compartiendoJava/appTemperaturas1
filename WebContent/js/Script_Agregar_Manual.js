$(document).ready(function script() {


  console.log('etamos en ajax Manager');

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
        html2 += '<div class="input-group"  id="insercionManual">';
        html2 += '<form action="doAgregarTemperaturas1" method="Post">';

        html2 += '<label>Parametro1 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param1" class="form-control"></br></br>';
        html2 += '<input type="submit" value="insertar">';

        html2 += '</form>';
        html2 += '</div>';

        $('body').append(html2);


        break;
      case 2:
        console.log("swich2");
        var html2 = '';
        html2 += '<div class="input-group"  id="insercionManual">';
        html2 += '<form action="doAgregarTemperaturas2" method="Post">';

        html2 += '<label>Parametro1 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param1" class="form-control "></br></br>';
        html2 += '<label>Parametro2 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param2" class="form-control "></br>';
        html2 += '<input type="submit" value="insertar">';

        html2 += '</form>';
        html2 += '</div>';



        $('body').append(html2);

        break;
      case 3:
        console.log("swich3");
        var html2 = '';
        html2 += '<div class="input-group"  id="insercionManual">';
        html2 += '<form action="doAgregarTemperaturas3" method="Post">';

        html2 += '<label>Parametro1 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param1" class="form-control"></br></br>';
        html2 += '<label>Parametro2 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param2" class="form-control"></br>';
        html2 += '<label>Parametro3 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param3" class="form-control"></br>';
        html2 += '<input type="submit" value="insertar">';

        html2 += '</form>';
        html2 += '</div>'

        $('body').append(html2);
        break;
      case 4:
        var html2 = '';
        html2 += '<div class="input-group"  id="insercionManual">';
        html2 += '<form action="doAgregarTemperaturas4" method="Post">';

        html2 += '<label>Parametro1 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param1" class="form-control"></br></br>';
        html2 += '<label>Parametro2 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param2" class="form-control"></br>';
        html2 += '<label>Parametro3 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param3" class="form-control"></br>';
        html2 += '<label>Parametro4 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param4" class="form-control"></br>';
        html2 += '<input type="submit" value="insertar">';

        html2 += '</form>';
        html2 += '</div>'

        $('body').append(html2);
        break;
      case 5:
        var html2 = '';
        html2 += '<div class="input-group"  id="insercionManual">';
        html2 += '<form action="doAgregarTemperaturas5" method="Post">';

        html2 += '<label>Parametro1 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param1" class="form-control"></br></br>';
        html2 += '<label>Parametro2 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param2" class="form-control"></br>';
        html2 += '<label>Parametro3 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param3" class="form-control"></br>';
        html2 += '<label>Parametro4 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param4" class="form-control"></br>';
        html2 += '<label>Parametro5 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param5" class="form-control"></br>';
        html2 += '<input type="submit" value="insertar">';

        html2 += '</form>';
        html2 += '</div>';

        $('body').append(html2);
        break;
      case 6:
        var html2 = '';
        html2 += '<div class="input-group"  id="insercionManual" >';
        html2 += '<form action="doAgregarTemperaturas6" method="Post">';

        html2 += '<label>Parametro1 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param1" class="form-control"></br></br></br></br>';
        html2 += '<label>Parametro2 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param2" class="form-control"></br></br></br></br>';
        html2 += '<label>Parametro3 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param3" class="form-control"></br></br></br></br>';
        html2 += '<label>Parametro4 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param4" class="form-control"></br></br></br></br>';
        html2 += '<label>Parametro5 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param5" class="form-control"></br></br></br></br>';
        html2 += '<label>Parametro6 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</label></br><input type="text" name="param6" class="form-control"></br></br></br></br>';
        html2 += '<input type="submit" value="insertar">';

        html2 += '</form>';
        html2 += '</div>';

        $('body').append(html2);
        break;






    }


  }).fail(function () {
    console.log("Fallo!");
  })
    .always(function () {
      console.log("Completo!");
    });
})
