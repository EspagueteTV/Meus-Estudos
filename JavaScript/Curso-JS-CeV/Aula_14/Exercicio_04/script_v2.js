/*
 * Código criado pelo Professor Guanabara
 */


function contar(){
    let ini = document.querySelector('#inicio')
    let fim = document.querySelector('#fim')
    let passo = document.querySelector('#passo')
    let resultado = document.querySelector("#msg")

    if(ini.value.length == 0 || fim.value.length == 0 || passo.value.length == 0){
        resultado.innerHTML = 'Impossível contar'
        //window.alert("[ERRO] Faltam dados!")
    }else{
        resultado.innerHTML = 'Contando.... <br/>'
        var i = Number(ini.value)
        var f = Number(fim.value)
        var p = Number(passo.value)

        if(p <= 0){
            window.alert("Passo Inválido! Considerando passo 1")
            p = 1
        }

        if(i < f){
            // Contagem Crescente
            for(var c = i; c <= f; c += p){
                resultado.innerHTML += `${c} \u{1F449} `
            }
        }else{
            // Contagem Regressiva
            for(var c = i; c >= f; c -= p){
                resultado.innerHTML += `${c} \u{1F449}`
            }
        }     
        
        resultado.innerHTML += ` \u{1F3C1}`

    }
}