function calcular(){
    let resp = window.document.querySelector(".resp");
    let n1 = window.document.querySelector("#n1").value;
    let n2 = window.document.querySelector("#n2").value;

    if(n1 <= n2 && n2 >= n1){
        resp.innerHTML = `<p>Por favor, informe no primeiro input um número maior que o segundo input</p>`;
    }else{
        resp.innerHTML = "";
        for(let i = n1; i >= n2; i--){
            if(i % 2 == 0){
                if(i  == n2){
                    resp.innerHTML += (i + ".");
                }else{
                    resp.innerHTML += (i + " -> ");
                }
            }
        }
        
    }
}