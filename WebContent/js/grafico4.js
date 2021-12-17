var stop;
var temp4 = [];
var data = [];
var humedades = [];
var fechas4 = [];
var myChart4;
var color4;
$(document).ready(function script() {




    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",




    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color4 = data[i].colorParam3;



        }


    })
});
$('#temp4').on('click', function () {
    var url = "doMostrarTemperaturas";
    $.get(url, procesarRespuesta4);

});
function procesarRespuesta4(data) {

    $.each(data, function (_index, listaString) {


        temp4.push(listaString.param4);

        fechas4.push(listaString.fecha);
        console.log(temp4)


    });


}

$('#graficar4').on('click', function graficar4() {
    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",




    }).done(function (data) {


        for (var i = 0; i < data.length; i++) {

            var nombre4 = data[i].label4;
            console.log('estamos en ajax label', data[i].label4);
        }
        console.log('estamos en ajax label', nombre4);

        var ctx4 = document.getElementById('myChart4').getContext('2d');
        myChart4 = new Chart(ctx4, {
            type: 'line',
            data: {
                labels: fechas4,
                datasets: [
                    {
                        label: nombre4,
                        data: temp4,
                        fill: true,
                        borderColor: color4,
                        backgroundColor: color4
                    }
                ]
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





