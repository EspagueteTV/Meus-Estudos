from time import sleep
n1 = int(input('Primeiro número: '))
n2 = int(input('Segundo Número: '))
op = 1

while op != 5:

    print(''' --> Menu de Opções
        [ 1 ] SOMAR
        [ 2 ] MULTIPLICA
        [ 3 ] MAIOR
        [ 4 ] NOVOS NÚMEROS
        [ 5 ] SAIR DO PROGRAMA ''')
    op = int(input('--> Informe sua opção: '))
    if op == 1:
        print('A soma entre {} + {} é {}'.format(n1, n2, n1 + n2))

    elif op == 2:
        print('O resultado de {} x {} é {}'.format(n1, n2, n1 * n2))

    elif op == 3:
        if n1 > n2:
            maior = n1
        else:
           maior = n2
        print('Entre {} e {} o maior valor é {}'.format(n1, n2, maior))

    elif op == 4:
        print('Informe os números novamente:')
        n1 = int(input('Primeiro Valor: '))
        n2 = int(input('Segundo valor: '))

    elif op == 5:
        print('Finalizando...')
        sleep(1)

    else:
        print('Opção Inválida. Tente Novamente.')

    print('\033[32m =-' * 20, '\033[m')
    sleep(2)
print('Fim do Programa! Volte Sempre !!!')