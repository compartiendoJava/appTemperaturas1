
var nombre1;
var nombre2;
var color1;
var color2;
function buscar() {

    var url = "doMostrarTemperaturas";
    $.get(url, procesarRespuesta);


}
var temp1;
var temp2;
var fecha2;
var myChart;

function procesarRespuesta(data) {

    $.each(data, function (_index, lista) {
        temp1 = lista.param1;
        temp2 = lista.param2;
        fecha2 = lista.fecha;

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
function buscar3() {

    var url = "doSeleccion";
    $.get(url, procesarRespuesta2);
}
function procesarRespuesta2(data) {

    console.log(data);
}



function graficar() {
    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",




    }).done(function (data) {


        for (var i = 0; i < data.length; i++) {

            nombre1 = data[i].label1;
            nombre2 = data[i].label2;
            console.log('estamos en ajax label', data[i].label1);
        }
    });
    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",




    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color1 = data[i].colorParam1;
            color2 = data[i].colorParam2;


        }

        console.log('el color es', color2);



    });

    document.getElementById("loader").style.visibility = "hidden"
    document.getElementById("desactivarGB").style.visibility = "visible";
    var ctx = document.getElementById('myChart').getContext('2d');
    myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: [fecha2, fecha2],
            datasets: [{
                label: [nombre1, nombre2],
                data: [temp1, temp2],
                borderColor: [color1, color2],

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
 /**
*
*/