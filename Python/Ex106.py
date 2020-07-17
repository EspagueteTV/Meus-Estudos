def mensagem(msg, opc=''):
    cont = len(msg) + 2
    print('~' * cont)
    print(f' {msg} {opc} ')
    print('~' * cont)


while True:
    print('\033[30;42m', end='')
    mensagem("SISTEMA DE AJUDA PyHELP")
    print('\033[m')
    op = str(input('Função ou biblioteca -->>  ')).lower()

    if op in 'fim':
        break

    print('\033[30;44m')
    mensagem("Acessando o manual do comando: ", opc=op)
    print('\033[m')

    print('\033[37;40m')
    help(op)
    print('\033[m')


