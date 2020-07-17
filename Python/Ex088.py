from random import randint
from time import sleep
valores = list()
sorteados = list()

print('\033[32m''-=' * 20)
print('\t Jogo na Mega Sena ')
print('-=' * 20, '\033[m')

cont = int(input('Quantos jogos você quer sortear?  '))
print(f'-=-=-=-= SORTEANDO {cont} JOGOS -=-=-=-=')

for i in range(0, cont):            #Contador das vezes que o usuário deseja de jogos
    for j in range(0, 6):           #Contador para cada jogo
        valor = randint(1, 60)
        while valor in valores:
            valor = randint(1, 60)
        valores.append(valor)

    print(f'Jogo {i + 1}: {sorted(valores)}')
    sorteados.append(valores[:])
    valores.clear()
    sleep(1)

print('-=-=-=-= < BOA SORTE > -=-=-=-=')
