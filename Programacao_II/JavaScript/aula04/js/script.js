var i = 0;
while(i <= 10){
    document.write(`<br>Valor ${i}`);
    i++;
}

document.write("<br><br>")

// for
for(var i = 0; i <= 10; i++){
    document.write(`<br>Valor ${i}`);
}

document.write("<br><br>");


var x = 300;
if(x < 200){
    document.write("<br> x < 200");
}else{
    document.write("<br> X maior que 200");
}

document.write("<br><br>");

var y = 100;
// Switch 
switch(y){
    case 200:
        document.write("<br>Y == 200");
        break;
    case 100:
        document.write("<br>Y = 100 <br>");
        break;
    default:
        document.write("Não foi atendido");
        break;


}