$( document ).ready( function script() {


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
          
  
          $('#graficoBarras').append(html2);
          var html = '';
          
          html += '<script src="js/graficoBarras1.js"></script>';
          $('body').append(html);
  
      
          break;
        case 2:
          console.log("swich2");
          var html2 = '';
          
          
          html2 += '<div>';
          html2 += '<canvas id="myChart2" width="200px" height="200px"></canvas>';
          html2 += '</div>';
                
          $('#graficoBarras').append(html2);
          var html = '';
          
           
          
          
          html += "<script src='js/graficoBarras2.js'></script>";
      
          $('body').append(html);
          
          break;
        case 3:
          console.log("swich3");
          var html2 = '';
          
         
          html2 += '<div>';
          html2 += '<canvas id="myChart" width="200px" height="200px"></canvas>';
          html2 += '</div>';
          
  
          $('#graficoBarras').append(html2);
          var html = '';
          
          html += '<script src="js/graficoBarras3.js"></script>';
          
          $('body').append(html);
          break;
        case 4:
          var html2 = '';
          
          
          html2 += '<div id="tamanioCanvas" style="margin-top:50%">';
          html2 += '<canvas id="myChart" width="200px" height="200px"  ></canvas>';
          html2 += '</div>';
          
          $('#graficoBarras').append(html2);
          var html = '';
         
          html += '<script src="js/graficoBarras4.js"></script>';
          
          $('body').append(html);
          break;
        case 5:
          var html2 = '';
          
          
          html2 += '<div id="tamanioCanvas" style="margin-top:50%">';
          html2 += '<canvas id="myChart" width="200px" height="200px"></canvas>';
          html2 += '</div>';
          
          $('#graficoBarras').append(html2);
          var html = '';
         
          html += '<script src="js/graficoBarras5.js"></script>';
          
          $('body').append(html);
          break;
        case 6:
          var html2 = '';
          
          
          html2 += '<div id="tamanioCanvas" style="margin-top:50%">';
          html2 += '<canvas id="myChart" width="200px" height="200px"></canvas>';
          html2 += '</div>';
          
          $('#graficoBarras').append(html2);
          var html = '';
          
          html += '<script src="js/graficoBarras6.js"></script>';
          
          $('body').append(html);
          break;
  
  
  
  
  
  
      }
  
  
    }).fail(function () {
      console.log("Fallo!");
    })
      .always(function () {
        console.log("Completo!");
      });
  })
  