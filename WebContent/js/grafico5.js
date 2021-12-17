var stop;
var temp5 = [];
var data = [];
var humedades = [];
var fechas5 = [];
var myChart5;
var color5;
$(document).ready(function script() {




    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",




    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color5 = data[i].colorParam3;



        }


    })
});
$('#temp5').on('click', function () {

    var url = "doMostrarTemperaturas";
    $.get(url, procesarRespuesta5);


});
function procesarRespuesta5(data) {

    $.each(data, function (_index, listaString) {


        temp5.push(listaString.param5);

        fechas5.push(listaString.fecha);
        console.log(temp5)


    });


}


$('#graficar5').on('click', function graficar5() {

    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",




    }).done(function (data) {


        for (var i = 0; i < data.length; i++) {

            var nombre5 = data[i].label5;
            console.log('estamos en ajax label', data[i].label5);
        }
        console.log('estamos en ajax label', nombre5);

        var ctx5 = document.getElementById('myChart5').getContext('2d');
        myChart5 = new Chart(ctx5, {
            type: 'line',
            data: {
                labels: fechas5,
                datasets: [{
                    label: nombre5,
                    data: temp5,
                    fill: true,
                    borderColor: color5,
                    backgroundColor: color5
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
            },


        });

    });


});
