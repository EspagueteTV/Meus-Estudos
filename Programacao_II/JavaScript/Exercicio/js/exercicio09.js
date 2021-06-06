function reajuste(salario){
    let salarioFinal = salario + (salario * 0.05);
    window.document.write(`O valor de R$ ${salario} com um reajuste de 5% é de R$ ${salarioFinal}`);
    document.write(`<p><a href="index.html">Voltar a página inicial</a></p>`);

}