$(document).ready(function () {


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
        html2 += '<canvas id="myChart" width="" height="100"></canvas>';

        html2 += '</div >';


        $('#graficoLinea').append(html2);
        var html = '';

        html += '<script src="js/graficoLinea1.js"></script>';
        $('body').append(html);

        document.getElementById("loader").style.visibility = "hidden";
        break;
      case 2:
        console.log("swich2");
        var html2 = '';


        html2 += '<div >';
        html2 += '<canvas id="myChart" width="" height="100" ></canvas>';
        html2 += '</div>';

        $('#graficoLinea').append(html2);
        var html = '';




        html += "<script src='js/graficoLinea2.js'></script>";

        $('body').append(html);
        document.getElementById("loader").style.visibility = "hidden";
        break;
      case 3:
        console.log("swich3");
        var html2 = '';


        html2 += '<div  >';
        html2 += '<canvas id="myChart" width="" height="100" ></canvas>';
        html2 += '</div>';


        $('#graficoLinea').append(html2);
        var html = '';

        html += '<script src="js/graficoLinea3.js"></script>';

        $('body').append(html);
        document.getElementById("loader").style.visibility = "hidden";
        break;
      case 4:
        var html2 = '';


        html2 += '<div >';
        html2 += '<canvas id="myChart" width="" height="100"  ></canvas>';
        html2 += '</div>';

        $('#graficoLinea').append(html2);
        var html = '';

        html += '<script src="js/graficoLinea4.js"></script>';

        $('body').append(html);
        document.getElementById("loader").style.visibility = "hidden";
        break;
      case 5:
        var html2 = '';


        html2 += '<div  >';
        html2 += '<canvas id="myChart" width="" height="100"></canvas>';
        html2 += '</div>';

        $('#graficoLinea').append(html2);
        var html = '';

        html += '<script src="js/graficoLinea5.js"></script>';

        $('body').append(html);
        document.getElementById("loader").style.visibility = "hidden";
        break;
      case 6:
        var html2 = '';


        html2 += '<div  >';
        html2 += '<canvas id="myChart" width="" height="100" ></canvas>';
        html2 += '</div>';

        $('#graficoLinea').append(html2);
        var html = '';

        html += '<script src="js/graficoLinea6.js"></script>';

        $('body').append(html);
        document.getElementById("loader").style.visibility = "hidden";
        break;






    }


  }).fail(function () {
    console.log("Fallo!");
  })
    .always(function () {
      console.log("Completo!");
    });
})
