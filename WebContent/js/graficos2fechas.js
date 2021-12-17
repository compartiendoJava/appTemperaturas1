var label2;
var color2;

$(document).ready(function script() {
    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",

    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color2 = data[i].colorParam2;



        }

    });
    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",

    }).done(function (data1) {

        for (var i = 0; i < data1.length; i++) {

            label2 = data1[i].label2;



        }
    });
});



var stop;
$('#temp2').on('click', function () {
    var url = "doMostrarTemperaturaEntreFechas";
    $.get(url, procesarRespuesta2);

});


function borrar() {
    temp2.pop();

    fechas2.pop();
    myChart2.destroy();


}

var temp2 = [];
var data = [];
var humedades = [];
var fechas2 = [];
var myChart2;
function procesarRespuesta2(data2) {

    $.each(data2, function (_index, listaFechas) {


        temp2.push(listaFechas.param2);

        fechas2.push(listaFechas.fecha);



    });


}
$('#graficar2').on('click', function graficar2() {

    var ctx = document.getElementById('myChart2').getContext('2d');
    myChart2 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: fechas2,
            datasets: [{
                label: label2,
                data: temp2,
                borderColor: color2,
                backgroundColor: color2
            }]

        },

        options: {
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
    });
});

