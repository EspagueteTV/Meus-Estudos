let equacao = "";

function adicionar(valor){
    let semiResult = window.document.querySelector("#box");
    equacao += valor;
    semiResult.innerText = equacao;
}

function verificar(){
    let semiResult = window.document.querySelector("#box");
    let result = window.document.querySelector(".resp");
    semiResult.innerText = eval(equacao);
    equacao = eval(equacao);
    result.innerHTML = `<p> ${eval(equacao)} </p>`;
}

function limpar(){
    let semiResult = window.document.querySelector("#box");
    let result = window.document.querySelector(".resp");
    equacao = "";
    semiResult.innerText = equacao;
    result.innerHTML = "";

}

