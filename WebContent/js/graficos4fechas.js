var label4;
var color4;

$(document).ready(function script() {
    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",

    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color4 = data[i].colorParam4;

            console.log('este es el color1', data[i]);

        }

    });
    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",

    }).done(function (data1) {

        for (var i = 0; i < data1.length; i++) {

            label4 = data1[i].label4;

            console.log('este es el nombre', data1[i]);

        }
    });
});


var stop;
$('#temp4').on('click', function () {
    var url = "doMostrarTemperaturaEntreFechas";
    $.get(url, procesarRespuesta4);

});


function borrar() {
    temp4.pop();
    humedades.pop();
    fechas4.pop();
    myChart4.destroy();

}

var temp4 = [];
var data = [];
var humedades = [];
var fechas4 = [];
var myChart4;
function procesarRespuesta4(data4) {

    $.each(data4, function (_index, listaFechas) {


        temp4.push(listaFechas.param4);

        fechas4.push(listaFechas.fecha);
        console.log(temp4)


    });


}
$('#graficar4').on('click', function graficar4() {

    var ctx4 = document.getElementById('myChart4').getContext('2d');
    myChart4 = new Chart(ctx4, {
        type: 'line',
        data: {
            labels: fechas4,
            datasets: [{
                label: label4,
                data: temp4,
                borderColor: color4,
                backgroundColor: color4
            }]
        }, options: {
            responsive: true,
            title: {
                display: true,
                fontColor: "Black",
                fontSize: 16,
                fontFamily: 'Trebuchet MS',

            },
            legend: {
                labels: {
                    fontColor: "Black",
                    fontSize: 15
                }
            },
            scales: {
                yAxes: [{
                    ticks: {
                        fontColor: "Black",
                        fontSize: 12,
                        stepSize: 10,

                    }
                }],
                xAxes: [{
                    ticks: {
                        fontColor: "Black",
                        fontSize: 11,
                        stepSize: 100,
                    }
                }]
            }
        }

    })


});