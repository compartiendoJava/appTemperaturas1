var stop;
var temp6 = [];
var data = [];
var humedades = [];
var fechas6 = [];
var myChart6;
var color6;
$(document).ready(function script() {




    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",




    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color6 = data[i].colorParam3;



        }


    })
});
$('#temp6').on('click', function () {

    var url = "doMostrarTemperaturas";
    $.get(url, procesarRespuesta6);
});
function procesarRespuesta6(data) {

    $.each(data, function (_index, listaString) {


        temp6.push(listaString.param6);

        fechas6.push(listaString.fecha);
        console.log(temp6)


    });


}




$('#graficar6').on('click', function graficar6() {

    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",




    }).done(function (data) {


        for (var i = 0; i < data.length; i++) {

            var nombre6 = data[i].label6;
            console.log('estamos en ajax label', data[i].label1);
        }
        console.log('estamos en ajax label', nombre6);

        var ctx6 = document.getElementById('myChart6').getContext('2d');
        myChart6 = new Chart(ctx6, {
            type: 'line',
            data: {
                labels: fechas6,
                datasets: [{
                    label: nombre6,
                    data: temp6,
                    fill: true,
                    backgroundColor: color6,
                    borderColor: color6
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
            }
        });
    });
});



