
var temp = [];
var data;
var humedades = [];
var fechas = [];
var myChart;
var color1;
var label1;

$(document).ready(function buscar() {


  var url = "doMostrarTemperaturas";
  $.get(url, procesarRespuesta);
  $.ajax({

    type: 'GET',
    url: "doTodosLosColores",




  }).done(function (data) {

    for (var i = 0; i < data.length; i++) {

      color1 = data[i].colorParam1;

      console.log('este es el color1', data[i]);

    }




  });
  $.ajax({

    type: 'GET',
    url: "doSeleccionTodosLabels",




  }).done(function (data1) {

    for (var i = 0; i < data1.length; i++) {

      label1 = data1[i].label1;

      console.log('este es el nombre', data1[i]);

    }




  });
  setTimeout(() => {
    console.log('estamos en el delay')
    var ctx = document.getElementById('myChart').getContext('2d');
    myChart = new Chart(
      ctx,
      {
        type: 'line',
        data: {
          labels: fechas,
          datasets: [
            {
              label: label1,
              data: temp,
              fill: true,
              borderColor: color1,
              backgroundColor: color1
            }

          ],
        },
        options: {
          responsive: true,
          title: {
            display: true,
            fontColor: color1,
            fontSize: 16,
            fontFamily: 'Trebuchet MS',

          },
          legend: {
            labels: {
              fontColor: color1,
              fontSize: 15
            }
          },
          scales: {
            yAxes: [{
              ticks: {
                fontColor: color1,
                fontSize: 12,
                // stepSize: 1,
                // beginAtZero: true
              }
            }],
            xAxes: [{
              ticks: {
                fontColor: color1,
                fontSize: 11,
              }
            }]
          }
        },


      });

  }, 2000)

});
function borrar() {
  temp.pop();

  fechas.pop();
  myChart.destroy();

}


function procesarRespuesta(data) {

  $.each(data, function (_index, lista) {


    temp.push(lista.param1);

    fechas.push(lista.fecha);
    console.log(temp)
    console.log('el numero de elementos', _index);
    if (_index > 100) {

      console.log('el numero de elementos', _index);

      temp.shift(lista.param1);

      fechas.shift(lista.fecha);

    }
  });


}

