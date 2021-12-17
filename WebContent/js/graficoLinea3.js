var color2;
var color1;
var color3;
var label1;
var label2;
var label3;


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

      console.log('este es el color1', data[i]);

    }



  });
  $.ajax({

    type: 'GET',
    url: "doSeleccionTodosLabels",




  }).done(function (data3) {

    for (var i = 0; i < data3.length; i++) {
      label1 = data3[i].label1;
      label2 = data3[i].label2;
      label3 = data3[i].label3;

      console.log('este es el nombre', data3[i]);

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
            backgroundColor: color1
          },
          {
            label: label2,
            data: temp2,
            fill: true,
            borderColor: color2,
            backgroundColor: color2
          },
          {
            label: label3,
            data: temp3,
            fill: true,
            borderColor: color3,
            backgroundColor: color3
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
  fechas.pop();
  myChart.destroy();

}

var temp1 = [];
var data = [];
var temp2 = [];
var temp3 = [];
var fechas = [];
var myChart;
function procesarRespuesta(data) {

  $.each(data, function (_index, lista) {


    temp1.push(lista.param1);
    temp2.push(lista.param2);
    temp3.push(lista.param3);

    fechas.push(lista.fecha);
    console.log(temp1)
    console.log('el numero de elementos', _index);
    if (_index > 100) {

      console.log('el numero de elementos', _index);

      temp1.shift(lista.param1);
      temp2.shift(lista.param2);
      temp3.shift(lista.param3);
      fechas.shift(lista.fecha);




    }



  });


}
