valor = list()
imp = list()
par = list()

for c in range(0, 7):
    valor.append(int(input(f'Digite o {c + 1}º valor: ')))
    if valor[c] not in par and valor[c] not in imp:
        if valor[c] % 2 == 0:
            par.append(valor[c])
        else:
            imp.append(valor[c])

valor.append(imp[:])
valor.append(par[:])
print('-=' * 20)
print(f'Os valores pares digitados foram: {sorted(valor[-1])}')
print(f'Os valores ímpares digitados forma: {sorted(valor[-2])}')
