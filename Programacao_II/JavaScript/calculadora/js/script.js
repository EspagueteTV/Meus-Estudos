let equacao = "";

function teste(valor){
    let semiResult = window.document.querySelector("#box");
    equacao += valor;
    semiResult.innerText = equacao;
}

function verificar(){
    let semiResult = window.document.querySelector("#box");
    semiResult.innerText = eval(equacao);
    equacao = eval(equacao);
}

function limpar(){
    let semiResult = window.document.querySelector("#box");
    equacao = "";
    semiResult.innerText = equacao;

}

