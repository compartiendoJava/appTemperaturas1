
$(document).ready(function script() {


  console.log('etamos en ajax ManagerTodasMediciones');

  $.ajax({

    type: 'GET',
    url: "doNumGraficosEntero",




  }).done(function (data) {


    console.log("Hecho Correcto!");
    console.log(data);
    switch (data) {


      case 1:
        console.log("swich1");


        $.ajax({

          type: 'GET',
          url: "doMostrarTemperaturas",

        }).done(function (data) {

          console.log("swich1");
          var html2 = '';
          html2 += '<table  class="table table-condensed" border="3" ng-init="mostrar();">';
          html2 += ' <thead>';
          html2 += '<tr> ';
          html2 += '<th>param1</th>';
          html2 += '<th>Fecha</th> ';
          html2 += '</tr>';


          html2 += '</thead>';


          for (var i = 0; i < data.length; i++) {

            console.log('estamos en la tabla', data)
            html2 += '<tr> ';
            html2 += "<td>" + data[i].param1 + "</td>";
            html2 += "<td>" + data[i].fecha + "</td>";
            html2 += "</tr>"
          }
          html2 += " </table>";



          $('#TodasTablainformacion').append(html2);
          document.getElementById("loaderTabla").style.visibility = "hidden";
        });






        break;
      case 2:

        console.log("swich2");

        $.ajax({

          type: 'GET',
          url: "doMostrarTemperaturas",

        }).done(function (data) {

          console.log("swich1");
          var html2 = '';
          html2 += '<table  class="table table-condensed" border="3" ng-init="mostrar();">';
          html2 += ' <thead>';
          html2 += '<tr> ';
          html2 += '<th>param1</th>';
          html2 += '<th>param2</th>';
          html2 += '<th>Fecha</th> ';
          html2 += '</tr>';


          html2 += '</thead>';


          for (var i = 0; i < data.length; i++) {

            console.log('estamos en la tabla', data)
            html2 += '<tr> ';
            html2 += "<td>" + data[i].param1 + "</td>";
            html2 += "<td>" + data[i].param2 + "</td>";
            html2 += "<td>" + data[i].fecha + "</td>";
            html2 += "</tr>"
          }
          html2 += " </table>";



          $('#TodasTablainformacion').append(html2);
          document.getElementById("loaderTabla").style.visibility = "hidden";
        });


        break;
      case 3:
        console.log("swich2");

        $.ajax({

          type: 'GET',
          url: "doMostrarTemperaturas",

        }).done(function (data) {

          console.log("swich1");
          var html2 = '';
          html2 += '<table  class="table table-condensed" border="3" ng-init="mostrar();">';
          html2 += ' <thead>';
          html2 += '<tr> ';
          html2 += '<th>param1</th>';
          html2 += '<th>param2</th>';
          html2 += '<th>param3</th>';
          html2 += '<th>Fecha</th> ';
          html2 += '</tr>';


          html2 += '</thead>';


          for (var i = 0; i < data.length; i++) {

            console.log('estamos en la tabla', data)
            html2 += '<tr> ';
            html2 += "<td>" + data[i].param1 + "</td>";
            html2 += "<td>" + data[i].param2 + "</td>";
            html2 += "<td>" + data[i].param3 + "</td>";
            html2 += "<td>" + data[i].fecha + "</td>";
            html2 += "</tr>"
          }
          html2 += " </table>";



          $('#TodasTablainformacion').append(html2);
          document.getElementById("loaderTabla").style.visibility = "hidden";
        });
        break;
      case 4:
        console.log("swich4");


        $.ajax({

          type: 'GET',
          url: "doMostrarTemperaturas",

        }).done(function (data) {
          console.log("swich1");

          var html2 = '';
          html2 += '<table  class="table table-condensed" border="3" ng-init="mostrar();">';
          html2 += ' <thead>';
          html2 += '<tr> ';
          html2 += '<th>param1</th>';
          html2 += '<th>param2</th>';
          html2 += '<th>param3</th>';
          html2 += '<th>param4</th>';
          html2 += '<th>Fecha</th> ';
          html2 += '</tr>';


          html2 += '</thead>';


          for (var i = 0; i < data.length; i++) {

            console.log('estamos en la tabla', data)
            html2 += '<tr> ';
            html2 += "<td>" + data[i].param1 + "</td>";
            html2 += "<td>" + data[i].param2 + "</td>";
            html2 += "<td>" + data[i].param3 + "</td>";
            html2 += "<td>" + data[i].param4 + "</td>";
            html2 += "<td>" + data[i].fecha + "</td>";
            html2 += "</tr>"
          }
          html2 += " </table>";



          $('#TodasTablainformacion').append(html2);
          document.getElementById("loaderTabla").style.visibility = "hidden";
        });
        break;
      case 5:
        $.ajax({

          type: 'GET',
          url: "doMostrarTemperaturas",

        }).done(function (data) {
          console.log("swich1");

          var html2 = '';
          html2 += '<table  class="table table-condensed" border="3" ng-init="mostrar();">';
          html2 += ' <thead>';
          html2 += '<tr> ';
          html2 += '<th>param1</th>';
          html2 += '<th>param2</th>';
          html2 += '<th>param3</th>';
          html2 += '<th>param4</th>';
          html2 += '<th>param5</th>';
          html2 += '<th>Fecha</th> ';
          html2 += '</tr>';


          html2 += '</thead>';


          for (var i = 0; i < data.length; i++) {

            console.log('estamos en la tabla', data)
            html2 += '<tr> ';
            html2 += "<td>" + data[i].param1 + "</td>";
            html2 += "<td>" + data[i].param2 + "</td>";
            html2 += "<td>" + data[i].param3 + "</td>";
            html2 += "<td>" + data[i].param4 + "</td>";
            html2 += "<td>" + data[i].param5 + "</td>";
            html2 += "<td>" + data[i].fecha + "</td>";
            html2 += "</tr>"
          }
          html2 += " </table>";



          $('#TodasTablainformacion').append(html2);
          document.getElementById("loaderTabla").style.visibility = "hidden";
        });
        break;
      case 6:
        $.ajax({

          type: 'GET',
          url: "doMostrarTemperaturas",

        }).done(function (data) {



          console.log("swich1");
          var html2 = '';
          html2 += '<table  class="table table-condensed" border="3"  ng-init="mostrar();">';
          html2 += ' <thead>';
          html2 += '<tr> ';
          html2 += '<th scope="col">param1</th>';
          html2 += '<th scope="col">param2</th>';
          html2 += '<th scope="col">param3</th>';
          html2 += '<th scope="col">param4</th>';
          html2 += '<th scope="col">param5</th>';
          html2 += '<th scope="col">param6</th>';
          html2 += '<th scope="col">Fecha</th> ';
          html2 += '</tr>';


          html2 += '</thead>';


          for (var i = 0; i < data.length; i++) {

            console.log('estamos en la tabla', data)
            html2 += '<tr> ';
            html2 += "<td>" + data[i].param1 + "</td>";
            html2 += "<td>" + data[i].param2 + "</td>";
            html2 += "<td>" + data[i].param3 + "</td>";
            html2 += "<td>" + data[i].param4 + "</td>";
            html2 += "<td>" + data[i].param5 + "</td>";
            html2 += "<td>" + data[i].param6 + "</td>";
            html2 += "<td>" + data[i].fecha + "</td>";
            html2 += "</tr>"
          }
          html2 += " </table >";



          $('#TodasTablainformacion').append(html2);
          document.getElementById("loaderTabla").style.visibility = "hidden";

        });
        break;






    }


  }).fail(function () {
    console.log("Fallo!");
  })
    .always(function () {
      console.log("Completo!");
    });
})
