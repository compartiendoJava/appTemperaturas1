var color1;
var color2;
var color3;
var color4;
var color5;
var color6;
var label1;
var label2;
var label3;
var label4;
var label5;
var label6;


$(document).ready(function buscar() {


  var url = "doMostrarTemperaturas";
  $.get(url, procesarRespuesta);
  $(document).ready(function buscar() {


    var url = "doMostrarTemperaturas";
    $.get(url, procesarRespuesta);
    $.ajax({

      type: 'GET',
      url: "doTodosLosColores",




    }).done(function (data) {

      for (var i = 0; i < data.length; i++) {
        color1 = data[i].colorParam1;

        color2 = data[i].colorParam2;

        color3 = data[i].colorParam3;

        color4 = data[i].colorParam4;

        color5 = data[i].colorParam5;

        color6 = data[i].colorParam6;


        console.log('este es el color1', data[i]);

      }

    });

  });
  $.ajax({

    type: 'GET',
    url: "doSeleccionTodosLabels",




  }).done(function (data6) {

    for (var i = 0; i < data6.length; i++) {
      label1 = data6[i].label1;
      label2 = data6[i].label2;
      label3 = data6[i].label3;
      label4 = data6[i].label4;
      label5 = data6[i].label5;
      label6 = data6[i].label6;

      console.log('este es el nombre', data6[i]);

    }




  });


  setTimeout(() => {

    var ctx = document.getElementById('myChart').getContext('2d');
    myChart = new Chart(
      ctx,
      {
        type: 'line',
        data: {
          labels: fechas,
          datasets: [{
            label: label1,
            data: temp1,
            fill: true,
            borderColor: color1,
            // backgroundColor: color1
          },
          {
            label: label2,
            data: temp2,
            fill: true,
            borderColor: color2,
            // backgroundColor: color2
          },
          {
            label: label3,
            data: temp3,
            fill: true,
            borderColor: color3,
            // backgroundColor: color3
          },
          {
            label: label4,
            data: temp4,
            fill: true,
            borderColor: color4,
            // backgroundColor: color4
          },
          {
            label: label5,
            data: temp5,
            fill: true,
            borderColor: color5,
            // backgroundColor: color5
          },
          {
            label: label6,
            data: temp6,
            fill: true,
            borderColor: color6,
            // backgroundColor: color6
          }
          ]
        },
      });

  }, 2000);

});
function borrar() {
  temp1.pop();
  temp2.pop();
  temp3.pop();
  temp4.pop();
  temp5.pop();
  temp6.pop();
  fechas.pop();
  myChart.destroy();

}

var temp1 = [];
var data = [];
var temp2 = [];
var temp3 = [];
var temp4 = [];
var temp5 = [];
var temp6 = [];
var fechas = [];
var myChart;
function procesarRespuesta(data) {

  $.each(data, function (_index, lista) {


    temp1.push(lista.param1);
    temp2.push(lista.param2);
    temp3.push(lista.param3);
    temp4.push(lista.param4);
    temp5.push(lista.param5);
    temp6.push(lista.param6);

    fechas.push(lista.fecha);
    console.log(temp1)
    console.log('el numero de elementos', _index);
    if (_index > 100) {

      console.log('el numero de elementos', _index);

      temp1.shift(lista.param1);
      temp2.shift(lista.param2);
      temp3.shift(lista.param3);
      temp4.shift(lista.param4);
      temp5.shift(lista.param5);
      temp6.shift(lista.param6);


      fechas.shift(lista.fecha);




    }



  });


}
