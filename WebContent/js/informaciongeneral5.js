$('#tempmax').on('click', function () {


  $.ajax({

    type: 'GET',
    url: "doMaximaTemperatura",
    data: { 'parametro': $('#parametro').val() }

  }).done(function (data) {
    console.log("swich1");
    var html2 = '';

    html2 += '<table  width=20% style="margin-top:2%" border="1" >';
    html2 += ' <thead>';
    html2 += '<tr> ';


    html2 += '</tr>';


    html2 += '</thead>';




    console.log('estamos en la tabla', data)
    html2 += '<tr> ';
    html2 += "<td>Maximo:" + data + "</td>";

    html2 += "</tr>"

    html2 += " </table>";



    $('#TodasTabla').append(html2);
  });
});
$('#tempmin').on('click', function () {
  $.ajax({

    type: 'GET',
    url: "doMinimaTemperatura",
    data: { 'parametro': $('#parametro').val() }

  }).done(function (data) {
    console.log("swich1");
    var html2 = '';
    html2 = '<h>Minima</h>';

    html2 += '<table  width=20% style="margin-top:2%" border="1" >';
    html2 += ' <thead>';
    html2 += '<tr> ';


    html2 += '</tr>';


    html2 += '</thead>';




    console.log('estamos en la tabla', data)
    html2 += '<tr> ';
    html2 += "<td>Minimo:" + data + "</td>";

    html2 += "</tr>"

    html2 += " </table>";



    $('#TodasTabla').append(html2);
  });
})
$('#tempmedia').on('click', function () {
  $.ajax({

    type: 'GET',
    url: "doMediaTemperatura",
    data: { 'parametro': $('#parametro').val() }

  }).done(function (data) {
    console.log("swich1");

    var html2 = '';

    html2 = '<h>Media</h>';


    html2 += '<table  width=20% style="margin-top:2%"  border="1" >';
    html2 += ' <thead>';
    html2 += '<tr> ';


    html2 += '</tr>';
    html2 += '</thead>';
    console.log('estamos en la tabla', data)
    html2 += '<tr> ';
    html2 += "<td>Media:" + data + "</td>";

    html2 += "</tr>"
    html2 += '</table >';




    $('#TodasTabla').append(html2);
  });
});