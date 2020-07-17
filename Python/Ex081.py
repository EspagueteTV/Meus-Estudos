lista = []
while True:
    lista.append(int(input('Digite um número: ')))

    op = 'c'
    while op not in 'NnSs':
        op = str(input('Deseja continuar? (S/N) '))[0].upper()

    if op == 'N':
        break

print(f'Foram digitados {len(lista)} valores na lista')
lista.sort(reverse=True)
print(f'Os valores digitados em ordem decrescente {lista}')

if 5 not in lista:
    print('O valor 5 não foi digitado na lista')
else:
    print('O valor 5 foi digitado na lista')