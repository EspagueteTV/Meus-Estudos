matriz = list()
linha = list()
for i in range(0, 3):
    for j in range(0, 3):
        linha.append(int(input(f'Digite um valor para [{i}][{j}]: ')))
    matriz.append(linha[:])
    linha.clear()
print('-=' * 20)
for i in range(0, 3):
    for j in range(0, 3):
        print(f'[{matriz[i][j]}]', end='')
    print()
