$("#prueba").on("click", function script() {


  console.log('etamos en ajax Manager');

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
        html2 += '<div >'
        html2 += '<canvas id="myChart1" width="200px" height="200px"></canvas>';

        html2 += '</div >';


        $('#canvas').append(html2);
        var html = '';
        html += "<div id='botonesG'>";
        html += "<button id='temp1'     class='btn btn-default btn-primary'>param1</button></br></br>";
        html += "<button id='graficar1' class='btn btn-default btn-primary'>graficar1</button></br></br>";
        html += '</div>';
        html += '<script src="js/grafico1.js"></script>';
        $('#fechasGraficosTodos').append(html);


        break;
      case 2:
        console.log("swich2");
        var html2 = '';

        html2 += '<div>'
        html2 += '<canvas id="myChart1" width="200px" height="200px"></canvas>';
        html2 += '</div>';
        html2 += '<div>';
        html2 += '<canvas id="myChart2" width="200px" height="200px"></canvas>';
        html2 += '</div>';

        $('#canvas').append(html2);
        var html = '';
        html += "<div id='botonesG'>"

        html += "<button id='temp1'     class='btn btn-default btn-primary'>param1</button></br></br>";
        html += "<button id='temp2'     class='btn btn-default btn-primary'>param2</button></br></br>";
        html += "<button id='graficar1' class='btn btn-default btn-primary'>graficar1</button></br></br>";
        html += "<button id='graficar2' class='btn btn-default btn-primary'>graficar2</button></br></br>";
        html += "</div>";
        html += "<script src='js/grafico1.js'></script>";
        html += "<script src='js/grafico2.js'></script>";

        $('#fechasGraficosTodos').append(html);

        break;
      case 3:
        console.log("swich3");
        var html2 = '';

        html2 += '<div>';
        html2 += '<canvas id="myChart1" width="200px" height="200px"></canvas>';
        html2 += '</div>';
        html2 += '<div>';
        html2 += '<canvas id="myChart2" width="200px" height="200px"></canvas>';
        html2 += '</div>';
        html2 += '<div>';
        html2 += '<canvas id="myChart3" width="200px" height="200px"></canvas>';
        html2 += '</div>';


        $('#canvas').append(html2);
        var html = '';
        html += '<div id="botonesG">';
        html += '<button id="temp1"     class="btn btn-default btn-primary">param1</button></br></br>';
        html += '<button id="temp2"     class="btn btn-default btn-primary">param2</button></br></br>';
        html += '<button id="temp3"     class="btn btn-default btn-primary">param3</button></br></br>';
        html += '<button id="graficar1" class="btn btn-default btn-primary">graficar1</button></br></br>';
        html += '<button id="graficar2" class="btn btn-default btn-primary">graficar2</button></br></br>';
        html += '<button id="graficar3" class="btn btn-default btn-primary">graficar3</button></br></br>';
        html += '</div>';
        html += '<script src="js/grafico1.js"></script>';
        html += '<script src="js/grafico2.js"></script>';
        html += '<script src="js/grafico3.js"></script>';
        $('#fechasGraficosTodos').append(html);
        break;
      case 4:
        var html2 = '';

        html2 += '<div id="tamanioCanvas">';
        html2 += '<canvas id="myChart1" width="200px" height="200px" ></canvas>';
        html2 += '</div>';
        html2 += '<div id="tamanioCanvas">';
        html2 += '<canvas id="myChart2" width="200px" height="200px" ></canvas>';
        html2 += '</div >';
        html2 += '<div id="tamanioCanvas">';
        html2 += '<canvas id="myChart3" width="200px" height="200px" ></canvas>';
        html2 += '</div ">';
        html2 += '<div id="tamanioCanvas" style="margin-top:50%">';
        html2 += '<canvas id="myChart4" width="200px" height="200px"  ></canvas>';
        html2 += '</div>';

        $('#canvas').append(html2);
        var html = '';
        html += '<div id="botonesG">';
        html += '<button id="temp1"     class="btn btn-default btn-primary">param1</button></br></br>';
        html += '<button id="temp2"     class="btn btn-default btn-primary">param2</button></br></br>';
        html += '<button id="temp3"     class="btn btn-default btn-primary">param3</button></br></br>';
        html += '<button id="temp4"     class="btn btn-default btn-primary">param4</button></br></br>';
        html += '<button id="graficar1" class="btn btn-default btn-primary">graficar1</button></br></br>';
        html += '<button id="graficar2" class="btn btn-default btn-primary">graficar2</button></br></br>';
        html += '<button id="graficar3" class="btn btn-default btn-primary">graficar3</button></br></br>';
        html += '<button id="graficar4" class="btn btn-default btn-primary">graficar4</button></br></br>';
        html += '</div>';
        html += '<script src="js/grafico1.js"></script>';
        html += '<script src="js/grafico2.js"></script>';
        html += '<script src="js/grafico3.js"></script>';
        html += '<script src="js/grafico4.js"></script>';
        $('#fechasGraficosTodos').append(html);
        break;
      case 5:
        var html2 = '';

        html2 += '<div id="tamanioCanvas">';
        html2 += '<canvas id="myChart1" width="200px" height="200px"></canvas>';
        html2 += '</div >';
        html2 += '<div id="tamanioCanvas">';
        html2 += '<canvas id="myChart2" width="200px" height="200px"></canvas>';
        html2 += '</div>';
        html2 += '<div id="tamanioCanvas">';
        html2 += '<canvas id="myChart3" width="200px" height="200px"></canvas>';
        html2 += '</div>';
        html2 += '<div id="tamanioCanvas" style="margin-top:50%">';
        html2 += '<canvas id="myChart4" width="200px" height="200px"></canvas>';
        html2 += '</div  >';
        html2 += '<div id="tamanioCanvas" style="margin-top:50%">';
        html2 += '<canvas id="myChart5" width="200px" height="200px"></canvas>';
        html2 += '</div>';

        $('#canvas').append(html2);
        var html = '';
        html += '<div id="botonesG">';
        html += '<button id="temp1"     class="btn btn-default btn-primary">param1</button></br></br>';
        html += '<button id="temp2"     class="btn btn-default btn-primary">param2</button></br></br>';
        html += '<button id="temp3"     class="btn btn-default btn-primary">param3</button></br></br>';
        html += '<button id="temp4"     class="btn btn-default btn-primary">param4</button></br></br>';
        html += '<button id="temp5"     class="btn btn-default btn-primary">param5</button></br></br>';
        html += '<button id="graficar1" class="btn btn-default btn-primary">graficar1</button></br></br>';
        html += '<button id="graficar2" class="btn btn-default btn-primary">graficar2</button></br></br>';
        html += '<button id="graficar3" class="btn btn-default btn-primary">graficar3</button></br></br>';
        html += '<button id="graficar4" class="btn btn-default btn-primary">graficar4</button></br></br>';
        html += '<button id="graficar5" class="btn btn-default btn-primary">graficar5</button></br></br>';
        html += '</div>'
        html += '<script src="js/grafico1.js"></script>';
        html += '<script src="js/grafico2.js"></script>';
        html += '<script src="js/grafico3.js"></script>';
        html += '<script src="js/grafico4.js"></script>';
        html += '<script src="js/grafico5.js"></script>';
        $('#fechasGraficosTodos').append(html);
        break;
      case 6:
        var html2 = '';

        html2 += '<div id="tamanioCanvas">';
        html2 += '<canvas id="myChart1" width="200px" height="200px"></canvas>';
        html2 += '</div>';
        html2 += '<div id="tamanioCanvas">';
        html2 += '<canvas id="myChart2" width="200px" height="200px"></canvas>';
        html2 += '</div>';
        html2 += '<div id="tamanioCanvas">';
        html2 += '<canvas id="myChart3" width="200px" height="200px"></canvas>';
        html2 += '</div>';
        html2 += '<div id="tamanioCanvas" style="margin-top:50%">';
        html2 += '<canvas id="myChart4" width="200px" height="200px"></canvas>';
        html2 += '</div>';
        html2 += '<div  id="tamanioCanvas" style="margin-top:50%">';
        html2 += '<canvas id="myChart5" width="200px" height="200px"></canvas>';
        html2 += '</div>';
        html2 += '<div id="tamanioCanvas" style="margin-top:50%">';
        html2 += '<canvas id="myChart6" width="200px" height="200px"></canvas>';
        html2 += '</div>';

        $('#canvas').append(html2);
        var html = '';
        html += '<div id="botonesG">'
        html += '<button id="temp1"     class="btn btn-default btn-primary">param1</button></br></br>';
        html += '<button id="temp2"     class="btn btn-default btn-primary">param2</button></br></br>';
        html += '<button id="temp3"     class="btn btn-default btn-primary">param3</button></br></br>';
        html += '<button id="temp4"     class="btn btn-default btn-primary">param4</button></br></br>';
        html += '<button id="temp5"     class="btn btn-default btn-primary">param5</button></br></br>';
        html += '<button id="temp6"     class="btn btn-default btn-primary">param6</button></br></br>';
        html += '<button id="graficar1" class="btn btn-default btn-primary">graficar1</button></br></br>';
        html += '<button id="graficar2" class="btn btn-default btn-primary">graficar2</button></br></br>';
        html += '<button id="graficar3" class="btn btn-default btn-primary">graficar3</button></br></br>';
        html += '<button id="graficar4" class="btn btn-default btn-primary">graficar4</button></br></br>';
        html += '<button id="graficar5" class="btn btn-default btn-primary">graficar5</button></br></br>';
        html += '<button id="graficar6" class="btn btn-default btn-primary">graficar6</button></br></br>';
        html += '</div>'
        html += '<script src="js/grafico1.js"></script>';
        html += '<script src="js/grafico2.js"></script>';
        html += '<script src="js/grafico3.js"></script>';
        html += '<script src="js/grafico4.js"></script>';
        html += '<script src="js/grafico5.js"></script>';
        html += '<script src="js/grafico6.js"></script>';
        $('#fechasGraficosTodos').append(html);
        break;






    }


  }).fail(function () {
    console.log("Fallo!");
  })
    .always(function () {
      console.log("Completo!");
    });
})
