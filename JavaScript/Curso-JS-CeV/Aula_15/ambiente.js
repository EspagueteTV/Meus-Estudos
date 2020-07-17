var num = []
var n = 18
num.push(1)
num.push(19)
console.log(num)
console.log(`Nosso vetor tem ${num.length} posições`)
console.log(`O primeiro valor do vetor é ${num[0]}`)
for(var c = 0; c < num.length; c++){
    console.log(num[c])
}
let pos = num.indexOf(4)
if(pos == -1){
    num.push(n)
    console.log("O valor não foi encontrado")
    num.push(23)
}else{
    console.log(`O valor 8 está na posição ${pos}`)
}

console.log(num)