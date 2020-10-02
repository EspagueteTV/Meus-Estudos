$(document).ready( function()     /* comando principal */                        /* $ indica qual elemnto vai ser modificado  nos parenteses vai o documento que quero modificar */  /*read quando toda a pagina tiver carregado ele vai funcionar */ 
{
    /* 
        // alert ("Olá Mundo !!! ");
    */


    $("#enviar").click(function ()                                                                                 /* click quando clicar */
    {
        var a = "Eu, ";
        var b = " vou tirar ";
        var c = 10;
        var nome = $("#nome") .val();

            if(nome == "")
            {
                alert ("Informe o nome: ");

            }

        else{
            // alert(a+nome+b+c);
            var resultado = a+nome+b+c;
            $("#resultado") .val(resultado);
            $("#nome").val("");
        }
    });

    $("#add").click(function ()                                                                                 /* click quando clicar */
    {
        $("#bloco") .addClass("bloco2");
    });

    $("#remove").click(function()
    {
        $("#bloco") .removeClass("bloco2");
    });


});