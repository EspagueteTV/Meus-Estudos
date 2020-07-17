n = int(input('Informe um número para ver a sua tabuada: '))
for i in range(0, 11):
    print('{} x {:2} = {}'.format(n, i, n * i))
