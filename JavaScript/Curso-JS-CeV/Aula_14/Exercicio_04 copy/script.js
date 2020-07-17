function calcularTabuada(){
    var n = window.document.querySelector("#num").value
    var tab = window.document.querySelector("#seltab")
    

    if(n == ''){
        window.alert("Por favor, informe um número.")
    }else{
        tab.innerHTML = ''
        for(var c = 1; c <= 10; c++){
            var item = window.document.createElement("option")
            item.innerText = `${n} x ${c} = ${n * c}`
            tab.appendChild(item)
    }

    
    }
}