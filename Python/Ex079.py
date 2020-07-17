lista = []

while True:
    print('-=' * 20)
    n = int(input('Digite um número: '))

    if n in lista:
        print('Valor duplicado. Não vou adicionar...')
    else:
        print('Valor valido. Adicionado com Sucesso...')
        lista.append(n)

    op = '0'
    while op not in 'SsNn':
        op = str(input('Deseja continuar? (S/N) '))[0].upper()

    if op == 'N':
        break

print('-=' * 20)

print(f'Os valores digitados foram {sorted(lista)}')

