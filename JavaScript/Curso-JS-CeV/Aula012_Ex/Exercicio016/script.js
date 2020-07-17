function verificador(){
                       
    // Div result
    var result = window.document.querySelector("#result")

    // Criação e Manipulação de uma 
    var img = window.document.createElement('img')

    // Ano Atual do Sistema
    var agora = new Date()
    var ano_atual = agora.getFullYear()                     


    // Ano de nascimento da pessoa, informado pelo id -> ano_nasc
    var fnasc = Number(window.document.querySelector("#ano_nasc").value)     

    if(fnasc == '' || fnasc > ano_atual){
        window.alert("Erro! Por favor, verifique todos os dados informados!")
    }else{
        // Calculo da idade da pessoa
        var idade = ano_atual - fnasc                                   
        var fsexo = window.document.getElementsByName('genero')

        if(fsexo[0].checked){
            var genero = 'Homem'
            if(idade > 0  && idade < 10){
                // Criança
                img.setAttribute('src', 'foto-crianca-m.png')
            }else if(idade < 21){
                // Jovem
                img.setAttribute('src', 'foto-jovem-m.png')
            }else if(idade < 60){
                // Adulto
                img.setAttribute('src', 'foto-adulto-m.png')
            }else{
                // Idoso
                img.setAttribute('src', 'foto-idodo-m.png')
            }

        }else if(fsexo[1].checked){
            var genero = 'Mulher'
            if(idade > 0 && idade < 10){
                // Criança
                img.setAttribute('src', 'foto-crianca-f.png')
            }else if(idade < 21){
                // Jovem
                img.setAttribute('src', 'foto-jovem-f.png')
            }else if(idade < 60){
                // Adulto
                img.setAttribute('src', 'foto-adulto-f.png')
            }else{
                img.setAttribute('src', 'foto-idodo-f.png')
            }
        }


  


        result.innerHTML = `<p>Detectamos  ${genero} com ${idade} anos</p>`
        result.appendChild(img)

    }
    
}