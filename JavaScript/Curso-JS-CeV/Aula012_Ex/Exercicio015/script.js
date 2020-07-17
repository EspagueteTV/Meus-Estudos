function carregar(){
    var msg = window.document.getElementById("msg")
    var img = window.document.getElementById("image")
    var data = new Date()
    var hora = data.getHours()
    msg.innerHTML = `Agora são ${hora} horas`

    
    if(hora >= 0 && hora < 12){
        // Bom dia
        img.src = 'Manha.jpg'
        document.body.style.background = "#FCE693"
    }else if(hora >= 12 && hora <= 18){
        // Boa Tarde
        img.src = 'Tarde.jpg'
        document.body.style.background = "#D29230"
    }else{
        // Boa Noite
        img.src = 'Noite.jpg'
        document.body.style.background = "#3980B8"
    }
}
    