from random import randint
from time import sleep

def sorteia(num):
    print('Sorteando 5 valores da lista: ', end='')
    for c in range(0, 5):
        num.append(randint(0, 10))
        sleep(0.3)
        print(num[c], end=' ')
    print('PRONTO!')


def somaPar(num):
    s = 0
    for v in num:
        if v % 2 == 0:
            s += v
    print(f'Somando os valores pares de {num}, temos {s} ')


# Função Main
numero = list()
sorteia(numero)
somaPar(numero)