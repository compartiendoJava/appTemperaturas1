
var label3;
var color3;

$(document).ready(function script() {
    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",

    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color3 = data[i].colorParam3;

            console.log('este es el color1', data[i]);

        }

    });
    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",

    }).done(function (data1) {

        for (var i = 0; i < data1.length; i++) {

            label3 = data1[i].label3;

            console.log('este es el nombre', data1[i]);

        }
    });
});



var stop;
$('#temp3').on('click', function () {
    var url = "doMostrarTemperaturaEntreFechas";
    $.get(url, procesarRespuesta3);

});


function borrar() {
    temp3.pop();

    fechas3.pop();
    myChart3.destroy();


}

var temp3 = [];
var data = [];
var humedades = [];
var fechas3 = [];
var myChart3;
function procesarRespuesta3(data3) {

    $.each(data3, function (_index, listaFechas) {


        temp3.push(listaFechas.param3);

        fechas3.push(listaFechas.fecha);
        console.log(temp3)


    });


}
$('#graficar3').on('click', function graficar3() {

    var ctx = document.getElementById('myChart3').getContext('2d');
    myChart3 = new Chart(ctx, {
        type: 'line',
        data: {
            labels: fechas3,
            datasets: [{
                label: label3,
                data: temp3,
                borderColor: color3,
                backgroundColor: color3
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

