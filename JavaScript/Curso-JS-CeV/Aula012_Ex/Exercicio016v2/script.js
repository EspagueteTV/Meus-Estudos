function verificar(){
    var data = new Date()
    var ano = data.getFullYear()
    var fano = window.document.querySelector("#txtano").value
    var res = window.document.querySelector("#res")

    if(fano.length == 0 || fano > ano){
        window.alert("Verifique os dados e tente novamente! ERRO")
    }else{
        var fsex = window.document.getElementsByName('radisex')
        var idade = ano - Number(fano)
        var genero = ''
        var img = document.createElement('img')
        img.setAttribute('id', 'foto')

        if(fsex[0].checked){    //Checked Se tiver marcado for
            genero = 'Homem'
            if(idade >= 0 && idade < 10){
                // Criança
                img.setAttribute('src', 'foto-crianca-m.png')
            }else if(idade < 21){
                // Jovem
                img.setAttribute('src', 'foto-jovem-m.png')
            }else if(idade < 50){
                // Adulto
                img.setAttribute('src', 'foto-adulto-m.png')
            }else{
                // Idoso
                img.setAttribute('src', 'foto-idodo-m.png')
            }


        }else if(fsex[1].checked){
           genero = 'Mulher'
           if(idade >= 0 && idade < 10){
               // Criança
               img.setAttribute('src', 'foto-crianca-f.png')
           }else if(idade < 21){
               // Jovem
               img.setAttribute('src', 'foto-jovem-f.png')
           }else if(idade < 50){
               // Adulto
               img.setAttribute('src', 'foto-adulto-f.png')
           }else{
               // Idoso
               img.setAttribute('src', 'foto-idodo-f.png')
           }
        }

        res.style.textAlign = 'center'
        res.innerHTML = `Detectamos ${genero} com ${idade} anos`
        res.appendChild(img)    //Adicionar elemento
    }

}