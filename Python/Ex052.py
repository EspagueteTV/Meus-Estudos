num = int(input('Informe um número para ser verificado: '))
cont = 0

for c in range(1, num + 1):
    if num % c == 0:
        cont = cont + 1
        print('\033[33m {} \033[m'.format(c), end='')
    else:
        print('\033[31m {} \033[m'.format(c), end='')

print('\nO número {} foi divisível {} vezes'.format(num, cont))

if cont == 2:
    print('O número {} é PRIMO !!!'.format(num))
else:
    print('O número {} NÃO é PRIMO !!!'.format(num))
