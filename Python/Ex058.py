from random import randint

computador = randint(0, 10)
tent = 1
print('\033[34m-=' * 20)
print('Sou seu computador...')
print('Estou pensando em um número entre 0 e 10.')
print('Você será capaz de adivinhar ?')
print('-=' * 20, '\033[m')
jogador = int(input('Qual é o seu palpite: '))

while jogador != computador:
    if jogador < computador:
        print('Mais... Tente mais uma vez.')
    else:
        print('Menos... Tente mais uma vez.')
    tent += 1
    jogador = int(input('Qual é o seu palpite? '))

print('Acertou com {} tentativas. Parabéns !'.format(tent))