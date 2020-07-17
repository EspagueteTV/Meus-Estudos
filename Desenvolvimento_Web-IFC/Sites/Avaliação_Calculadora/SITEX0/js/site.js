$(document) .ready( function calcular()
{


  // NA soma de dois valores
    $("#mais").click(function ()
    {

        var a = $("#numero").val();
        var b = $("#numero2").val();

          if(a == " ")
            {
               alert ("Informe o número");
          }

            else {

              var resultado = parseInt(a) + parseInt(b);
                $("#resultado").val(resultado)

              // Mudar as formas
        
                $("#resultado").ready(function ()                                                                                 /* click quando clicar */
                  {

                    var i, cont=0;


                    for(i=1; i<resultado; i++){
				
                      if(resultado%i == 0){
                        cont++;
                      }
          
                      }
         
                      if(resultado%2 == 0){
                        $("#resultado") .removeClass("bloco3");
                        $("#resultado") .removeClass("bloco4");      
                        $("#resultado") .addClass("bloco2");
                        }
      
                        else{
                          $("#resultado") .removeClass("bloco2");
                          $("#resultado") .removeClass("bloco4");
                          $("#resultado") .addClass("bloco3");
                          }
      
                      if(cont == 1){
                        $("#resultado") .removeClass("bloco2");
                        $("#resultado") .removeClass("bloco3");
                        $("#resultado") .addClass("bloco4");
                        }

                });
              }

      });
                // FIM DO CÓDIGO DE SOMAS




                // Na subtração de dois valores


        $("#subtracao").click(function ()
        {

          var a = $("#numero").val();
          var b = $("#numero2").val();

            if(a == " ")
            {
              alert ("Informe o número");
            }

            else {

              var resultado = a - b;
                $("#resultado").val(resultado);

                  $("#resultado").ready(function ()                                                                                 /* click quando clicar */
                    {

                      var i, cont=0;


                      for(i=1; i<resultado; i++){
          
                        if(resultado%i == 0){
                          cont++;
                        }
            
                        }
          
                        if(resultado%2 == 0){
                          $("#resultado") .removeClass("bloco3");
                          $("#resultado") .removeClass("bloco4");      
                          $("#resultado") .addClass("bloco2");
                          }
        
                          else{
                            $("#resultado") .removeClass("bloco2");
                            $("#resultado") .removeClass("bloco4");
                            $("#resultado") .addClass("bloco3");
                            }
        
                        if(cont == 1){
                          $("#resultado") .removeClass("bloco2");
                          $("#resultado") .removeClass("bloco3");
                          $("#resultado") .addClass("bloco4");
                          }

                  });
            }

          });

                    // FIM DO CODIGO DE SUBTRAÇÕES



    // Na multiplicação de dois valores

          $("#multiplicacao").click(function ()
          {

            var a = $("#numero").val();
            var b = $("#numero2").val();

              if(a == " " && b == " ")
              {
                alert ("Informe o número");
              }

                else 
                {
                  var resultado = a * b;
                  $("#resultado").val(resultado);

                    $("#resultado").ready(function ()                                                                                 /* click quando clicar */
                    {

                      var i, cont=0;


                      for(i=1; i<resultado; i++){
          
                          if(resultado%i == 0){
                            cont++;
                          }
            
                        }
          
                        if(resultado%2 == 0){
                          $("#resultado") .removeClass("bloco3");
                          $("#resultado") .removeClass("bloco4");      
                          $("#resultado") .addClass("bloco2");
                          }
        
                          else{
                            $("#resultado") .removeClass("bloco2");
                            $("#resultado") .removeClass("bloco4");
                            $("#resultado") .addClass("bloco3");
                            }
        
                        if(cont == 1){
                          $("#resultado") .removeClass("bloco2");
                          $("#resultado") .removeClass("bloco3");
                          $("#resultado") .addClass("bloco4");
                          }

                  });
                }

          });

          // FIM DO CODIGO DE MULTIPLICAÇÃO

          // nA DIVISÃO DE DOIS VALORES

          $("#divisao").click(function ()
          {

            var a = $("#numero").val();
            var b = $("#numero2").val();

              if(b == "0")
              {
                alert ("Não é possível dividir por 0");
              }



                else {

                  var resultado = a / b;
                  $("#resultado").val(resultado);

                    $("#resultado").ready(function ()                                                                                 /* click quando clicar */
                      {

                        var i, cont=0;


                        for(i=1; i<resultado; i++){
            
                          if(resultado%i == 0){
                            cont++;
                          }
              
                          }
            
                          if(resultado%2 == 0){
                            $("#resultado") .removeClass("bloco3");
                            $("#resultado") .removeClass("bloco4");      
                            $("#resultado") .addClass("bloco2");
                            }
          
                            else{
                              $("#resultado") .removeClass("bloco2");
                              $("#resultado") .removeClass("bloco4");
                              $("#resultado") .addClass("bloco3");
                              }
          
                          if(cont==1){
                            $("#resultado") .removeClass("bloco2");
                            $("#resultado") .removeClass("bloco3");
                            $("#resultado") .addClass("bloco4");
                            }

                    });
                }

            });

                  // FIM DA DIVISÃO

              // Na exponencial 

        $("#exponencial").click(function ()
        {

          var a = $("#numero").val();
          var b = $("#numero2").val();

            if(a == " ")
            {
              alert ("Informe o número");
            }

              else {

                var i, resultado;
                resultado = a;

                  for(i=1; i<b; i++){
                    resultado = resultado * a;
                  }
                    $("#resultado").val(resultado);

                  $("#resultado").ready(function ()                                                                                 /* click quando clicar */
                  {

                    var i, cont=0;


                    for(i=1; i<resultado; i++){
				
                      if(resultado%i == 0){
                        cont++;
                      }
          
                      }
         
                      if(resultado%2 == 0){
                        $("#resultado") .removeClass("bloco3");
                        $("#resultado") .removeClass("bloco4");      
                        $("#resultado") .addClass("bloco2");
                        }
      
                        else{
                          $("#resultado") .removeClass("bloco2");
                          $("#resultado") .removeClass("bloco4");
                          $("#resultado") .addClass("bloco3");
                          }
      
                      if(cont == 1){
                        $("#resultado") .removeClass("bloco2");
                        $("#resultado") .removeClass("bloco3");
                        $("#resultado") .addClass("bloco4");
                        }

                });     
              }
          });

        // FIM DA EXPONENCIAL
});






















/*$(document).ready(function(){
  $(".navbar a, footer a[href='#myPage']").on('click', function(event) {
  if (this.hash !== "") { //BEGIN IF
    event.preventDefault();
    var hash = this.hash;
    $('html, body').animate({
      scrollTop: $(hash).offset().top
    }, 900, function(){
      window.location.hash = hash;
      });
    } // End if 
  });


    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    

})

*/