
console.log('seleccionar');

$('#enviarSeleccion').on('click', function seccionar() {

    var graf = $('#numGraficos').val();

    $.ajax({
		type: 'GET',
		url : 'doNumGraficos',
		data: {'numGraficos':graf},
        
	})
    
	


    switch (graf) {
        

        case '1':
            
            console.log('estamos en switch 1')
            var html = '';
            html += '<form action="doAgregarSeleccion" method="POST">';
            html += '<h>Introduce el nombre de los parametros<h><br><br>';
            html += '<label >Label 1</label><br>';
            html += '<input type="text" name="label1" required="required" class="form-control" style="width:10%" id="label1"><br><br><br></br>';
            html += '<input type="submit" id="btnSeleccion" value="Enviar">'
            html += '</form>';
            $('#contSelec').append(html);
            break;

        case '2':
            console.log('estamos en switch 2')
            var html = '';
            html += '<h>Introduce el nombre de los parametros<h><br><br>';
            html += '<form action="doAgregarSeleccion" method="POST">';
            html += '<label >Label 1</label><br>';
            html += '<input type="text" name="label1"  required="required" class="form-control" style="width:10%" id="label1"><br><br><br>';
            html += '<label >Label 2</label><br>';
            html += '<input type="text" name="label2"  required="required" class="form-control" style="width:10%" id="label2"><br><br><br>';
            html += '<input type="submit" id="btnSeleccion" value="Enviar">';
            html += '</form>';
            $('#contSelec').append(html);

            break;

        case '3':
            console.log('estamos en switch 3');
            var html = '';
            html += '<h>Introduce el nombre de los parametros<h><br><br>';
            html += '<form action="doAgregarSeleccion" method="POST">';

            html += '<label >Label 1</label><br>';
            html += '<input type="text"  name="label1"   required="required" class="form-control" style="width:10%" id="label1"><br><br>';
            html += '<label >Label 2</label><br>';
            html += '<input type="text" name="label2"  required="required" class="form-control" style="width:10%" id="label2"><br><br>';
            html += '<label >Label 3</label><br>';
            html += '<input type="text" name="label3"  required="required" class="form-control" style="width:10%" id="label3"><br><br>';
            html += '<input type="submit" id="btnSeleccion" value="Enviar">';
            html += '</form>';
            $('#contSelec').append(html);

            break;

        case '4':
            console.log('estamos en switch 4');
            var html = '';
            html += '<h>Introduce el nombre de los parametros<h><br><br>';
            html += '<form action="doAgregarSeleccion" method="POST">';
            html += '<label >Label 1</label><br>';
            html += '<input type="text" name="label1"  required="required" class="form-control" style="width:10%" id="label1"><br><br>';
            html += '<label >Label 2</label><br>';
            html += '<input type="text" name="label2"  required="required" class="form-control" style="width:10%" id="label2"><br><br>';
            html += '<label >Label 3</label><br>';
            html += '<input type="text" name="label3"  required="required" class="form-control" style="width:10%"  id="label3"><br><br>';
            html += '<label >Label 4</label><br>';
            html += '<input type="text" name="label4"  required="required" class="form-control" style="width:10%"  id="label4"><br><br>';
            html += '<input type="submit" id="btnSeleccion" value="Enviar">';
            html += '</form>';
            $('#contSelec').append(html);

            break;

        case '5':
            console.log('estamos en switch 5');
            var html = '';
            html += '<form action="doAgregarSeleccion" method="POST">';
            html += '<h>Introduce el nombre de los parametros<h><br><br>';
            html += '<label >Label 1</label><br>';
            html += '<input type="text" name="label1"  required="required" class="form-control" style="width:10%" id="label1"><br><br>';
            html += '<label for="label 2">Label 2</label><br>';
            html += '<input type="text" name="label2"  required="required" class="form-control" style="width:10%" id="label2"><br><br>';
            html += '<label >Label 3</label><br>';
            html += '<input type="text"  name="label3" required="required" class="form-control" style="width:10%" id="label3"><br><br>';
            html += '<label >Label 4</label><br>';
            html += '<input type="text" name="label4"  required="required" class="form-control" style="width:10%" id="label4"><br><br>';
            html += '<label >Label 5</label><br>';
            html += '<input type="text" name="label5"  required="required" class="form-control" style="width:10%" id="label5"><br><br>';
            html += '<input type="submit" id="btnSeleccion" value="Enviar">';
            html += '</form>';
            $('#contSelec').append(html);


            break;

        case '6':
            console.log('estamos en switch 6');
            var html = '';
            html += '<h>Introduce el nombre de los parametros<h><br><br>';
            html += '<form action="doAgregarSeleccion" method="POST">';
            html += '<label >Label 1</label><br>';
            html += '<input type="text" name="label1"  required="required" class="form-control" style="width:10%" id="label1"><br><br>';
            html += '<label for="label 2">Label 2</label><br>';
            html += '<input type="text" name="label2"  required="required" class="form-control" style="width:10%" id="label2"><br><br>';
            html += '<label >Label 3</label><br>';
            html += '<input type="text" name="label3"  required="required" class="form-control" style="width:10%" id="label3"><br><br>';
            html += '<label >Label 4</label><br>';
            html += '<input type="text" name="label4"  required="required" class="form-control" style="width:10%" id="label4"><br><br>';
            html += '<label >Label 5</label><br>';
            html += '<input type="text" name="label5"  required="required" class="form-control" style="width:10%" id="label5"><br><br>';
            html += '<label >Label 6</label><br>';
            html += '<input type="text" name="label6"  required="required" class="form-control" style="width:10%" id="label6"><br><br>';
            html += '<input type="submit" id="btnSeleccion" value="Enviar">';
            html += '</form >';
            $('#contSelec').append(html);


            break;

        default:
            console.log('no ha seleccionado nada');



    }


});
