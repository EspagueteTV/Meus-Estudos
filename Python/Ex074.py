from random import randint
n = (randint(0, 10), randint(0, 10), randint(0, 10), randint(0, 10), randint(0, 10))
print(f'Os valores sorteados foi: {n[0]} {n[1]} {n[2]} {n[3]} {n[4]}')
#    if cont == 0:
#       maior = n[cont]
#        menor = n[cont]
#    else:
#        if n[cont] > maior:
#            maior = n[cont]
#        if n[cont] < menor:
#            menor = n[cont]
print(f'O maior valor sorteado foi {max(n)}')
print(f'O menor valor sorteado foi {min(n)}')
