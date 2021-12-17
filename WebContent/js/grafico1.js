var stop;
var temp1 = [];
var data = [];
var label;
var color1;

var fechas1 = [];
var myChart1;
$(document).ready(function script() {




    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",




    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color1 = data[i].colorParam1;



        }


    })
});


$('#temp1').on('click', function () {

    var url = "doMostrarTemperaturas";
    $.get(url, procesarRespuesta1);
});
function procesarRespuesta1(data) {

    $.each(data, function (_index, listaString) {



        temp1.push(listaString.param1);
        fechas1.push(listaString.fecha);
        console.log(temp1)


    });


}

$('#graficar1').on('click', function graficar1() {
    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",
    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            var nombre1 = data[i].label1;
            console.log('estamos en ajax label', data[i].label1);
        }
        console.log('estamos en ajax label', nombre1);
        var ctx1 = document.getElementById('myChart1').getContext('2d');
        myChart1 = new Chart(ctx1, {
            type: 'line',
            data: {
                labels: fechas1,
                datasets: [
                    {
                        label: nombre1,
                        data: temp1,
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
                        fontColor: "Black",
                        fontSize: 15
                    }
                },
                scales: {
                    yAxes: [{
                        ticks: {
                            fontColor: "Black",
                            fontSize: 12,
                            // stepSize: 1,
                            // beginAtZero: true
                        }
                    }],
                    xAxes: [{
                        ticks: {
                            fontColor: "Black",
                            fontSize: 11,
                        }
                    }]
                }
            },


        });

    });


});






