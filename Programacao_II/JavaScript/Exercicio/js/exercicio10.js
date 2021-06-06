function mensagem(){
    let nome = window.document.querySelector("#userName").value;
    let peso = Number.parseFloat(window.document.getElementById("userWeight").value);

    alert(`O nome do usuário é ${nome} e possui ${peso} Kg`);
}