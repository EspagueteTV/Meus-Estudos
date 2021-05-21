/*

//alert("Meu JS externo")
document.write("<h1>Meu site em JS</h1><h2>Subtítulo</h2>")

//Método de confirmar
if(confirm("Você tem certeza")){
    document.write("<br>Confirmado");
}else{
    document.write("<br>Recusado");
}

window.prompt("Qual seu nome?");

*/

// Condiçao
var x = 5;
if(x >= 10){
    document.write("<h1>X é igual ou maior</h1>");
}else if(x >= 5){
    document.write("<h1> X é maior ou igual a 5</h1>");
}
else{
    document.write("<h1>X é menor que 5</h1>");
}

//Operadores relacionais >, <, <=, >=, !=, ==, === (igual e o mesmo tipo)

var y = 1;

if(y === '1'){
    document.write("<br>É igual");
}else{
    document.write("<br>Não é igual");
}

// Operadores Lógicos: 
// && ou AND - Operador lógico E
// || ou OR - Operador lógico ou
// !  ou NOT - Operador lógico de negação

if((x < 10) && (y == 1)){
    window.document.write("Entrou no operador");
}

if((x < 10) && !(y == 2)){
    window.document.write("Entrou no operador");
}


