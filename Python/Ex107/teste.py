from Ex107 import moeda

preco = int(input('Digite o valor: '))
print(f'O dobro de R${preco} é {moeda.dobro(preco)}')
print(f'A metade de R${preco} é {moeda.metade(preco)}')
print(f'Aumentando 10%, temos {moeda.aumentar(preco, 10)}')
print(f'Reduzindo 13%, temos {moeda.diminuir(preco, 13)}')
