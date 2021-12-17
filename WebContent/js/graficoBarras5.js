var nombre1;
var nombre2;
var nombre3;
var nombre4;
var nombre5;
var color1;
var color2;
var color3;
var color4;
var color5;



function buscar() {

    var url = "doMostrarTemperaturas";
    $.get(url, procesarRespuesta);


}
var temp1;
var temp2;
var temp3;
var temp4;
var temp5;
var fecha5;
var myChart;

function procesarRespuesta(data) {

    $.each(data, function (_index, lista) {
        temp1 = lista.param1;
        temp2 = lista.param2;
        temp3 = lista.param3;
        temp4 = lista.param4;
        temp5 = lista.param5;
        fecha5 = lista.fecha;


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
            nombre3 = data[i].label3;
            nombre4 = data[i].label4;
            nombre5 = data[i].label5;
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
            color3 = data[i].colorParam3;
            color4 = data[i].colorParam4;
            color5 = data[i].colorParam5;
        }
    });


    document.getElementById("loader").style.visibility = "hidden"
    document.getElementById("desactivarGB").style.visibility = "visible";
    var ctx = document.getElementById('myChart').getContext('2d');
    myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: [fecha5, fecha5, fecha5, fecha5, fecha5],
            datasets: [{
                label: [nombre1, nombre2, nombre3, nombre4, nombre5],
                data: [temp1, temp2, temp3, temp4, temp5],

                borderColor: [color1, color2, color3, color4, color5],


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