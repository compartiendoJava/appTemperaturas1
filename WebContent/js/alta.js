$("#btnAlta").on("click",function alta() {

    
    
       
        var url= "doAlta";

        $.post(url,{nombre: $('#nombre').val(),
        password: $('#password').val(),
        
        email: $("#email").val() });
        
        

    });
    
