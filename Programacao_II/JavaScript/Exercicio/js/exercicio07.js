function calcularIMC(nome, altura, peso){
    var imc = (peso / Math.pow(altura, 2));

    document.write(`O IMC do Gabriel que possui ${peso} Kg e uma altura de ${altura} m é igual ${imc.toFixed(2)}`);
    document.write(`<p><a href="index.html">Voltar a página inicial</a></p>`);
}