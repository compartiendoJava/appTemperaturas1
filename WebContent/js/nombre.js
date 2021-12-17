
function nombre() {

	

	$.ajax({

		type: 'GET',
		url: "doNombre"

	}).done(function (data) {

		console.log(data);
		$("#divNombre").html( data );

		
		console.log("Hecho Correcto!");

	}).fail(function () {
		console.log("Fallo!");
	})
		.always(function () {
			console.log("Completo!");
		});

}

