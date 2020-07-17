cor = ('\033[m',    # 0 - SEM COR
       '\033[30m',  # 1 - BRANCO
       '\033[31m',  # 2 - VERMELHO
       '\033[32m',  # 3 - VERDE
       '\033[33m',  # 4 - AMARELO
       '\033[34m',  # 5 - AZUL
       '\033[35m',  # 6 - MAGENTA
       '\033[36m',  # 7 - CIANO
       '\033[37m',)  # 8 - CINZA


def linha(tam=40):
    print('-' * tam)


def menu(lista):
    opcoes('MENU PRINCIPAL')
    cont = 1
    for item in lista:
        print(f'{cor[3]}{cont} - {cor[0]} {cor[7]}{item} {cor[0]}')
        cont += 1
    linha()
    op = leiaInt(f'{cor[3]}Sua Opção: {cor[0]}')
    return op


def opcoes(msg):
    linha()
    print(msg.center(40))
    linha()


def leiaInt(msg):
    while True:
        try:
            n = int(input(msg))
        except(TypeError, ValueError):
            print(f'{cor[2]}ERRO, por favor, digite um número inteiro válido {cor[0]}')
        except KeyboardInterrupt:
            print('O usuário preferiu não informar os valores!')
        else:
            return n


