matriz = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
soma_p = soma_3j = maior_2i = 0

for i in range(0, 3):
    for j in range(0, 3):
        matriz[i][j] = int(input(f'Digite um valor para [{i}, {j}]: '))

        if matriz[i][j] % 2 == 0:
            soma_p += matriz[i][j]
        if j == 2:
            soma_3j += matriz[i][j]
        if i == 1:
            if j == 0 or matriz[i][j] > maior_2i:
                maior_2i = matriz[i][j]

print('-=' * 20)
for i in range(0, 3):
    for j in range(0, 3):
        print(f'[{matriz[i][j]:^5}]', end='')
    print()
print('-=' * 20)

print(f'A soma de todos os números pares digitados foi: {soma_p}')
print(f'A soma de todos os valores da 3ª coluna foi {soma_3j}')
print(f'O maior valor da 2ª linha foi {maior_2i}')
