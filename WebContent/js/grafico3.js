var stop;
var temp3 = [];
var data = [];

var fechas3 = [];
var myChart3;
var color3;
$(document).ready(function script() {




    $.ajax({

        type: 'GET',
        url: "doTodosLosColores",




    }).done(function (data) {

        for (var i = 0; i < data.length; i++) {

            color3 = data[i].colorParam3;



        }


    })
});
$('#temp3').on('click', function () {
    var url = "doMostrarTemperaturas";
    $.get(url, procesarRespuesta3);

});
function procesarRespuesta3(data3) {

    $.each(data3, function (_index, listaString) {


        temp3.push(listaString.param3);

        fechas3.push(listaString.fecha);
        console.log(temp3)


    });


}

$('#graficar3').on('click', function graficar3() {
    $.ajax({

        type: 'GET',
        url: "doSeleccionTodosLabels",




    }).done(function (data) {


        for (var i = 0; i < data.length; i++) {

            var nombre3 = data[i].label3;
            console.log('estamos en ajax label', data[i].label3);
        }
        console.log('estamos en ajax label', nombre3);


        var ctx3 = document.getElementById('myChart3').getContext('2d');
        myChart3 = new Chart(ctx3, {
            type: 'line',
            data: {
                labels: fechas3,
                datasets: [
                    {
                        label: nombre3,
                        data: temp3,
                        fill: true,
                        borderColor: color3,
                        backgroundColor: color3
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





