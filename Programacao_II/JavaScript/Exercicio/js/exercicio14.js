
function resgatarValores(){
    let n1 = Number.parseFloat(window.document.querySelector("#n1").value);
    let n2 = Number.parseFloat(window.document.querySelector("#n2").value);

    return [n1, n2];
}

function mensagem(resultado){
    let resp = window.document.querySelector(".resp");
    resp.innerHTML = `<p>${resultado}</p>`;
}

function somar(){
    let valor = resgatarValores();
    mensagem(valor[0] + valor[1]);
}

function subtrair(){
    let valor = resgatarValores();
    mensagem(valor[0] - valor[1]);
}

function multiplicar(){
    let valor = resgatarValores();
    mensagem(valor[0] * valor[1]);
}

function dividir(){
    let valor = resgatarValores();
    mensagem(valor[0] / valor[1]);
}