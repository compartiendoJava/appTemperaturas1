var label1;
var color1;

$(document).ready(function script() {
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
});



var stop;
$('#temp1').on('click', function () {
    var url = "doMostrarTemperaturaEntreFechas";
    $.get(url, procesarRespuesta1);

});


function borrar() {
    temp1.pop();

    fechas1.pop();
    myChart1.destroy();


}

var temp1 = [];
var data = [];
var humedades = [];
var fechas1 = [];
var myChart1;
function procesarRespuesta1(data1) {

    $.each(data1, function (_index, listaFechas) {


        temp1.push(listaFechas.param1);

        fechas1.push(listaFechas.fecha);
        console.log(temp1)


    });


}
$('#graficar1').on('click', function graficar1() {

    var ctx = document.getElementById('myChart1').getContext('2d');
    myChart1 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: fechas1,
            datasets: [{
                label: label1,
                data: temp1,
                borderColor: color1,
                backgroundColor: color1
            }]

        },

        options: {
            responsive: true,
            title: {
                display: true,
                fontColor: "red",
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

