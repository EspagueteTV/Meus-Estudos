var i = 10
var f = 0
var p = 1

for(var c = i; c > f; c -= p){
    console.log(c)
}

p = null

if(p == null){
    console.log('erro')
}