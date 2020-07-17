function calcularTabuada(){
    let num = window.document.getElementById("num")
    let tabuada = document.getElementById("seltab")

    if(num.value.length == 0){
        window.alert("Por favor, digite um número: ")
    }else{
        let n = Number(num.value)
        var c = 1
        tabuada.innerHTML = ''
        while(c <= 10){
            let item = window.document.createElement('option')
            item.text = `${n} x ${c} = ${n * c}`
            tabuada.appendChild(item)
            c++
        }
    }



}