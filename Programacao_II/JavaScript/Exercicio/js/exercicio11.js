function verificar(){
    let n1 = document.querySelector("#n1").value;
    let n2 = document.querySelector("#n2").value;
    let n3 = document.querySelector("#n3").value;
    let n4 = document.querySelector("#n4").value;

    let num = [n1, n2, n3, n4];
    let valor = num.sort();

    alert("O maior valor digitado foi: " + valor[num.length-1]);
}
