var label6;
var color6;

$(document).ready(function script() {
    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",

    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color6 = data[i].colorParam6;

            console.log('este es el color1', data[i]);

        }

    });
    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",

    }).done(function (data1) {

        for (var i = 0; i < data1.length; i++) {

            label6 = data1[i].label6;

            console.log('este es el nombre', data1[i]);

        }
    });
});



var stop;
$('#temp6').on('click', function () {
    var url = "doMostrarTemperaturaEntreFechas";
    $.get(url, procesarRespuesta6);

});


function borrar() {
    temp6.pop();

    fechas6.pop();
    myChart6.destroy();
    graficar3();

}

var temp6 = [];
var data = [];
var humedades = [];
var fechas6 = [];
var myChart6;
function procesarRespuesta6(data6) {

    $.each(data6, function (_index, listaFechas) {


        temp6.push(listaFechas.param6);

        fechas6.push(listaFechas.fecha);
        console.log(temp6)


    });


}
$('#graficar6').on('click', function graficar3() {

    var ctx6 = document.getElementById('myChart6').getContext('2d');
    myChart6 = new Chart(ctx6, {
        type: 'line',
        data: {
            labels: fechas6,
            datasets: [{
                label: label6,
                data: temp6,
                borderColor: color6,
                backgroundColor: color6
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