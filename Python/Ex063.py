print('--' * 20)
print('\t Sequência de Fibonacci')
print('--' * 20)
v = int(input('Quantos termos você desaja mostrar: '))
cont = aux2 = fi = 0
aux = 1
print('~~' * 20)

while cont < v:
    if cont == 0:
        print('{}'.format(fi), end=' -> ')
        print(aux, end=' -> ')
        cont = cont + 2

    fi = aux + aux2
    print(fi, end=' -> ')
    aux2 = aux
    aux = fi
    cont += 1

print('FIM')