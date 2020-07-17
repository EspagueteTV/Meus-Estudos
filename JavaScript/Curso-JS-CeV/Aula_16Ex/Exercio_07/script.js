// Variáveis Globais
var sec = window.document.querySelector("#sect")
let res = window.document.querySelector('.result')

var num = []
var c = 0


function adicionar(){
    var numf = window.document.querySelector("#num").value
    if(numf == ''){   // Para verificar se o campo de texto está vazio
        window.alert("[ERRO] Por favor, digite um valor válido!")
    }else{
        addNumArray(Number(numf))
    }
}

function finalizar(){
    var valor = verificador() 
    res.innerHTML = `<p> Ao todo, temos ${num.length} números cadastrados</p>`
    res.innerHTML += `<p>O maior número informado foi ${valor[0]} </p>`
    res.innerHTML += `<p>O menor número informado foi ${valor[1]}</p>`
    res.innerHTML += `<p>Somando todos os valores, temos ${valor[2]}</p>`
    res.innerHTML += `<p>A média dos valores digitados é ${valor[3]}</p>`
}


function addNumArray(n){    // Adicionar um valor no Array
     if(n >= 1 && n <= 100){
         if(num.indexOf(n) == -1){
             num[c] = n
             c++
             addOption(n)
         }else{
             window.alert("[ERRO] Valor já informado. Por favor, digite outro número")
         }
     }else{
         window.alert("Por favor, digite um número entre 1 e 100!")
     }
}


function addOption(n){      // Adicionar um valor no select
    var item = window.document.createElement("option")
    item.innerText = `Valor ${n} adicionado`
    sec.appendChild(item)
}



function verificador(){
    var valores = [0, 0, 0, 0]  // pos 0 = maior, pos 1 = menor, pos 2 = soma, pos 3 = media
    for(var c=0; c < num.length; c++){
        if(c == 0){
            valores[0] = num[c]
            valores[1] = num[c]
        }else{
            if(num[c] > valores[0])
                valores[0] = num[c]
            if(num[c] < valores[1])
                valores[1] = num[c]   
        }
        valores[2] += num[c]
    }
    valores[3] = valores[2] / num.length
    
    return valores
}
    

