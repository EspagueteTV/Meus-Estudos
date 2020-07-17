lista = []
while True:
    lista.append(int(input('Digite um valor: ')))
    op = '0'
    while op not in 'SsNn':
        op = str(input('Deseja continuar? (S/N) ')).upper()[0]
    if op == 'N':
        break

par = []
impar = []

for c in range(0, len(lista)):
    if lista[c] % 2 == 0:
        par.append(lista[c])
    else:
        impar.append(lista[c])

print('-=' * 20)
print(f'A lista completa é {lista}')
print(f'Os valores pares digitados foram {sorted(par)}')
print(f'Os valores ímpares digitados foram {sorted(impar)}')


