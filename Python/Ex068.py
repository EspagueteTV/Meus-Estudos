from random import randint
cont = 0
print('\033[32m-*' * 20)
print('Vamos jogar PAR ou ÍMPAR ?')
print('-*' * 20, '\033[m')
while True:

    n_c = randint(0, 10)
    n_j = int(input('Informe um valor: '))
    jogador = ' '
    while jogador not in'PpIi':
        jogador = str(input('Par ou Ímpar ? (P/I): ')).upper()[0]
    s = n_j + n_c

    if jogador == 'I':
        computador = 'P'
    else:
        computador = 'I'

    print('\033[31m-=' * 20)
    print(f'O computador jogou {n_c} e o jogador jogou {n_j}. Total de {s} deu ', end='')
    print('PAR' if s % 2 == 0 else 'Ímpar \n')
    print('-=' * 20, '\033[m')

    if jogador == 'P' and s % 2 == 0 or jogador == 'I' and s % 2 != 0:
        print('Jogador venceu !')
        cont += 1
    else:
        print('O computador Venceu !')
        break

    print('Jogar novamente...\n')

print(f'GAME OVER ! Você venceu {cont} vezes')
