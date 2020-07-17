print('-=' * 20)
print('\t Termos de uma PA')
print('-=' * 20)
pa = int(input('Informe o Primeiro Termo: '))
r = int(input('Informe a razão: '))
cont = 0
while cont < 10:
    print('{}'.format(pa), end=' -> ')
    pa = pa + r
    cont += 1
print('Acabou.')
