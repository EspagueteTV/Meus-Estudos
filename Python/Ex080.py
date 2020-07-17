n1 = n2 = n3 = n4 = n5 = 0

for c in range(0, 5):
    n = int(input('Digite um número: '))

    if c == 0:
        n5 = n
        print('Valor adicionado na 5ª posição')

    if c == 1:
        if n < n5:
            n4 = n
            print('Valor adicionado na 4ª posição')
        else:
            n4 = n5
            n5 = n
            print('Valor adicionado na 5ª posição')

    if c == 2:
        if n < n4 and n < n5:
            n3 = n
            print('Valor adicionado na 3ª posição')
        elif n > n4 and n < n5:
            n3 = n4
            n4 = n
            print('Valor adicionado na 4ª posição')
        elif n > n4 and n > n5:
            n3 = n4
            n4 = n5
            n5 = n
            print('Valor adicionado na 5ª posição')


    if c == 3:
        if n < n3:
            n2 = n
            print('Valor adicionado na 2ª posição')

        elif n > n3 and n < n4:
            n2 = n3
            n3 = n
            print('Valor adicionado na 3ª posição')
        elif n > n3 and n > n4 and n < n5:
            n2 = n3
            n3 = n4
            n4 = n
            print('Valor adicionado na 4ª posição')

        elif n > n3 and n > n4 and n > n5:
            n2 = n3
            n3 = n4
            n4 = n5
            n5 = n
            print('Valor adicionado na 5ª posição')

    if c == 4:
        if n < n2:
            n1 = n
            print('Valor adicionado na 1ª posição')
        elif n > n2 and n < n3:
            n1 = n2
            n2 = n
            print('Valor adicionado na 2ª posição')
        elif n > n2 and n > n3 and n < n4:
            n1 = n2
            n2 = n3
            n3 = n
            print('Valor adicionado na 3ª posição')
        elif n > n2 and n > n3 and n > n4 and n < n5:
            n1 = n2
            n2 = n3
            n3 = n4
            n4 = n
            print('Valor adicionado na 4ª posição')
        elif n > n2 and n > n3 and n > n4 and n > n5:
            n1 = n2
            n2 = n3
            n3 = n4
            n4 = n5
            n5 = n
            print('Valor adicionado na 5ª posição')

    print('-=' * 20)


lista = [n1, n2, n3, n4, n5]
print(lista)
