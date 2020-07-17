total = caros = cont = 0
barato = ''
print('==' * 20)
print('     LOJAS CLA ')
print('==' * 20)
while True:
    nome = str(input('Nome do Produto: ')).strip().title()
    preco = float(input('Preço: R$ '))
    op = ' '
    while op not in 'SN':
        op = str(input('Quer Continuar ? [S/N] ')).strip().upper()[0]
    total += preco

    if preco > 1000:
        caros += 1

    if cont == 0:
        barato = nome
        p_barato = preco
        cont += 1

    elif preco < p_barato:
        barato = nome
        p_barato = preco

    if op == 'N':
        break
print('--' * 20)
print(f'O total gasto em compras foi R${total:.2f}')
print(f'Ao todo {caros} produtos custam mais de R$ 1000')
print(f'O produto mais barato foi {barato} com um preço de R${p_barato:.2f}.')

