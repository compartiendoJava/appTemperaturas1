
var nombre1;
var color1;
function buscar() {

    var url = "doMostrarTemperaturas";
    $.get(url, procesarRespuesta);


}
var temp1;

var fecha1;

function procesarRespuesta(data) {

    $.each(data, function (_index, lista) {
        temp1 = lista.param1;

        fecha1 = lista.fecha;

    });

}
var stop;
$(document).ready(function activartemporizar() {
    stop = window.setInterval(graficar, 5000);
    window.setInterval(buscar, 5000);


});
function desactivartemporizador() {
    window.clearInterval(stop);
}





function graficar() {
    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",




    }).done(function (data) {


        for (var i = 0; i < data.length; i++) {

            nombre1 = data[i].label1;
            console.log('estamos en ajax label', data[i].label1);
        }
    });
    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",




    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color1 = data[i].colorParam1;



        }



    });

    document.getElementById("loader").style.visibility = "hidden"
    document.getElementById("desactivarGB").style.visibility = "visible";
    var ctx = document.getElementById('myChart').getContext('2d');
    var myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: [fecha1],
            datasets: [{
                label: nombre1,
                data: [temp1],
                borderColor: color1,

                borderWidth: 4
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true
                    }
                }]
            }

        }

    });

}
