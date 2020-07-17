from random import randint
from time import sleep
cont = 0
jogos = list()
lista = list()
print('-=' * 20)
print('     JOGA NA MEGA SENA       ')
print('-=' * 20)
quant = int(input('Quantos jogos você quer que eu sorteie? '))
tot = 1
while tot <= quant:
    cont = 0
    while True:
        num = randint(1, 60)
        if num not in lista:
            lista.append(num)
            cont += 1
        if cont >= 6:
            break
    jogos.append(lista[:])
    lista.clear()
    tot += 1
print('-=' * 3, f'SORTEADO {quant} JOGOS', '-=' * 3)
for i, l in enumerate(jogos):
    print(f'Jogo {i + 1}: {sorted(l)}')
    sleep(1)
print('-=' * 5, '< BOA SORTE >', '-=' * 5)