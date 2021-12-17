var stop;

var data = [];
var temp2 = [];
var fechas2 = [];
var myChart2;
var color1;
var color2;
$(document).ready(function script() {

    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",




    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {


            color2 = data[i].colorParam2;


        }

        console.log('el color es', color2);


    })
});

$('#temp2').on('click', function () {

    var url = "doMostrarTemperaturas";
    $.get(url, procesarRespuesta2);
});
function procesarRespuesta2(data) {

    $.each(data, function (_index, listaString) {



        temp2.push(listaString.param2);
        fechas2.push(listaString.fecha);
        console.log(temp2)


    });


}

$('#graficar2').on('click', function graficar2() {
    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",




    }).done(function (data) {


        for (var i = 0; i < data.length; i++) {

            var nombre2 = data[i].label2;
            console.log('estamos en ajax label', data[i].label2);
        }
        console.log('estamos en ajax label', nombre2);

        var ctx2 = document.getElementById('myChart2').getContext('2d');
        myChart2 = new Chart(ctx2, {
            type: 'line',
            data: {
                labels: fechas2,
                datasets: [
                    {
                        label: nombre2,
                        data: temp2,
                        fill: true,
                        borderColor: color2,
                        backgroundColor: color2
                    }
                ],
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
            },


        });

    });


});




