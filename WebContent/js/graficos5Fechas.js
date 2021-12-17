var label5;
var color5;

$(document).ready(function script() {
    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",

    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color5 = data[i].colorParam5;

            console.log('este es el color1', data[i]);

        }

    });
    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",

    }).done(function (data1) {

        for (var i = 0; i < data1.length; i++) {

            label5 = data1[i].label5;

            console.log('este es el nombre', data1[i]);

        }
    });
});


var stop;
$('#temp5').on('click', function () {
    var url = "doMostrarTemperaturaEntreFechas";
    $.get(url, procesarRespuesta5);

});


function borrar() {
    temp5.pop();

    fechas5.pop();
    myChart5.destroy();


}

var temp5 = [];
var data = [];
var humedades = [];
var fechas5 = [];
var myChart5;
function procesarRespuesta5(data5) {

    $.each(data5, function (_index, listaFechas) {


        temp5.push(listaFechas.param5);

        fechas5.push(listaFechas.fecha);
        console.log(temp5)


    });


}
$('#graficar5').on('click', function graficar5() {

    var ctx5 = document.getElementById('myChart5').getContext('2d');
    myChart5 = new Chart(ctx5, {
        type: 'line',
        data: {
            labels: fechas5,
            datasets: [{
                label: label5,
                data: temp5,
                borderColor: color5,
                backgroundColor: color5
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