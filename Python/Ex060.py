cont = num = int(input('Informe um número para calcular seu fatorial: '))
print('Calculando {}! = '.format(num), end='')
med = 1
while cont > 0:
    med = med * cont
    if cont != 1:
        print('{} x'.format(cont), end=' ')
    else:
        print('{} = '.format(cont), end='')
    cont = cont - 1
print('{}'.format(med))

