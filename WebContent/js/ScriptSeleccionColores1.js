$(document).ready(function script() {

    console.log('etamos en Script colores');

    $.ajax({

        type: 'GET',
        url: "doNumGraficosEntero",
    }).done(function (data) {

        console.log("Hecho Correcto!");
        console.log(data);
        switch (data) {


            case 1:
                console.log("swich1");
                var html2 = '';
                html2 += "<form action='doGuardarColores1' method='POST'>";
                html2 += "<label> COLOR DEL GRAFICO 1:</label><input type='color' name='colorParam1' class='form-control'></br></br>";
                html2 += "<input type='submit' value='set up'>";
                html2 += "</form>";
                html2 += '';
                $('#contSelecColores').append(html2);
                break;
            case 2:
                console.log("swich2");
                var html2 = '';
                html2 += "<form action='doGuardarColores2' method='POST'>";
                html2 += "<label> COLOR DEL GRAFICO 1:</label><input type='color' name='colorParam1' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 2:</label><input type='color' name='colorParam2' class='form-control'></br></br>";
                html2 += "<input type='submit' value='set up'>";
                html2 += "</form>";
                html2 += '';
                $('#contSelecColores').append(html2);

                break;
            case 3:
                console.log("swich3");
                var html2 = '';
                html2 += "<form action='doGuardarColores3' method='POST'>";
                html2 += "<label> COLOR DEL GRAFICO 1:</label><input type='color' name='colorParam1' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 2:</label><input type='color' name='colorParam2' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 3:</label><input type='color' name='colorParam3' class='form-control'></br></br>";
                html2 += "<input type='submit' value='set up'>";
                html2 += "</form>";
                html2 += '';
                $('#contSelecColores').append(html2);
                break;
            case 4:
                console.log("swich4");
                var html2 = '';
                html2 += "<form action='doGuardarColores4' method='POST'>";
                html2 += "<label> COLOR DEL GRAFICO 1:</label><input type='color' name='colorParam1' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 2:</label><input type='color' name='colorParam2' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 3:</label><input type='color' name='colorParam3' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 4:</label><input type='color' name='colorParam4' class='form-control'></br></br>";
                html2 += "<input type='submit' value='set up'>";
                html2 += "</form>";
                html2 += '';
                $('#contSelecColores').append(html2);
                break;
            case 5:
                console.log("swich5");
                var html2 = '';
                html2 += "<form action='doGuardarColores5' method='POST'>";
                html2 += "<label> COLOR DEL GRAFICO 1:</label><input type='color' name='colorParam1' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 2:</label><input type='color' name='colorParam2' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 3:</label><input type='color' name='colorParam3' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 4:</label><input type='color' name='colorParam4' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 5:</label><input type='color' name='colorParam5' class='form-control'></br></br>";
                html2 += "<input type='submit' value='set up'>";
                html2 += "</form>";
                html2 += '';
                $('#contSelecColores').append(html2);
                break;
            case 6:
                console.log("swich6");
                var html2 = '';
                html2 += "<form action='doGuardarColores6' method='POST'>";
                html2 += "<label> COLOR DEL GRAFICO 1:</label><input type='color' name='colorParam1' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 2:</label><input type='color' name='colorParam2' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 3:</label><input type='color' name='colorParam3' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 4:</label><input type='color' name='colorParam4' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 5:</label><input type='color' name='colorParam5' class='form-control'></br></br>";
                html2 += "<label> COLOR DEL GRAFICO 6:</label><input type='color' name='colorParam6' class='form-control'></br></br>";
                html2 += "<input type='submit' value='set up'>";
                html2 += "</form>";
                html2 += '';
                $('#contSelecColores').append(html2);
                break;






        }


    }).fail(function () {
        console.log("Fallo!");
    })
        .always(function () {
            console.log("Completo!");
        });
})
