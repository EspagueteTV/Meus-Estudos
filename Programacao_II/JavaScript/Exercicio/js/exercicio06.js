function soma(n1, n2, n3, n4, n5, n6){
    var mediaAritPrimeiros = (n1 + n2 + n3) / 3;
    var mediaAritUltimos = (n4 + n5 + n6) / 3;
    var somaFinal = mediaAritPrimeiros + mediaAritUltimos;

    document.write(`A media dos 3 primeiros números foi ${mediaAritPrimeiros.toFixed(2)}`);
    document.write(`<br> A média dos 3 últimos números foi ${mediaAritUltimos.toFixed(2)}`);
    document.write(`<br> Enquanto que a soma das média foi ${somaFinal.toFixed(2)}`);
}

soma(2, 4, 3, 7, 9, 1);