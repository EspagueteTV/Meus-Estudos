function contar(){
    var i = window.document.querySelector('#inicio').value
    var f = window.document.querySelector('#fim').value
    var p = Number(window.document.querySelector('#passo').value)
    var msg = window.document.querySelector("#msg")

    if(f == '' || i == ''){
        window.alert('Erro! Por favor, verifique os dados informados.')
    }else{
        var ini = Number(i)
        var fi = Number(f)

        msg.innerHTML = ''

        if(p == 0){
            window.alert("Passo Inválido. Considerando Passo 1")
            p = 1
        }else if(p < 0){
           p *= -1
        }
      
        // Se fim for maior que o inicio
        if(ini < fi){
            for(var c = ini; c <= fi; c += p){
                msg.innerHTML +=  `${c}`
                msg.innerHTML += ` &#128073 `
            }     
        }else{
            for(var c = ini; c >= fi; c -= p){
                msg.innerHTML += `${c}`
                msg.innerHTML += ' &#128073 '
            }
        }
        msg.innerHTML += '&#128679'
    } 
}
        