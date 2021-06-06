function verificar(){
    if(form1.campo1.value == ""){
        alert("Preencha o campo 1");
        return false;
    }else{
        if(form1.campo1.value > 100){
            document.write("<br>Maior que 100");
        }else{
            document.write("<br>Menor ou igual a 100");
        }
        return true;
    }
}

function seguir(){
    window.location.href = "http://saobentodosul.ifc.edu.br/";
}