function verificar(num){
    window.document.write(`Número informado: ${num}`);
   if(num % 2 == 0){
       window.document.write(`<br>Sucessor par: ${num + 2} `);
       window.document.write(`<br>Antecessor par: ${num - 2}`);
   }else{
       window.document.write(`<br>Sucessor par: ${num + 1}`);
       window.document.write(`<br>Antecessor par: ${num - 1}`);
   }
   document.write(`<p><a href="index.html">Voltar a página inicial</a></p>`);
}