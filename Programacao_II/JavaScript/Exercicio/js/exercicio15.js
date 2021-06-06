function verificar(){
    let senha = window.document.querySelector("#senha").value;
    let senhaConf = window.document.querySelector("#confirmaSenha").value;
    let resp = window.document.querySelector(".resp");

    if(senha === senhaConf){
        let nome = window.document.querySelector('#nome').value;
        let email = window.document.querySelector("#email").value;
        let idade = Number.parseInt(window.document.querySelector("#idade").value);
        let telefone = window.document.querySelector("#telefone").value;
        let fsexo = window.document.getElementsByName("radisex");
        let sexo = "";

        if(fsexo[0].checked){
            sexo = "Masculino";
        }else{
            sexo = "Feminino";
        }

        resp.innerHTML = `<h4>Nome: ${nome} <br> Email: ${email} <br> Idade: ${idade} anos <br> Telefone: ${telefone} <br> Sexo: ${sexo} </h4>`;


    }else{
        resp.innerHTML = "";
        alert("Senhas não se correspondem. Por favor, informe sua senha novamente.");
    }
}