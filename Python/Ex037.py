num = int(input('Informe um número inteiro: '))
print('----> Tabela de Opções ')
print('[ 1 ] - Binário')
print('[ 2 ] - Octal')
print('[ 3 ] - Hexadecimal')
opc = int(input('Qual será a base de conversão: '))
if opc == 1:
    print('O valor {} em Binário vale {}.'.format(num, bin(num)[2:]))
elif opc == 2:
    print('O valor {} em Octal vale {}.'.format(num, oct(num)[2:]))
elif opc == 3:
    print('O valor {} em Hexadecimal vale {}.'.format(num, hex(num)[2:]))
else:
    print('Opção Inválida. Tente Novamente...')
