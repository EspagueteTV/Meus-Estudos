listagem = ('Lápis', 1.75, 'Borracha', 2.00, 'Caderno', 15.90, 'Estojo', 25.00, 'Transferidor', 4.20,
            'Compasso', 9.99, 'Mochila', 120.32, 'Canetas', 22.30, 'Livro', 34.90)
print('--' * 20)
print('\t\t\t Listagem de Preços')
print('--' * 20)
for cont in range(0, len(listagem)):
    if cont % 2 == 0:
        print(f'{listagem[cont]:.<30}', end='')
    else:
        print(f'R$ {listagem[cont]:>6.2f}')
