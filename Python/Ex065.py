cont = s = media = maior = menor = 0
op = 'S'
while op == 'S':
    num = int(input('Digite um número: '))
    cont += 1
    s += num

    if cont == 1:
        maior = menor = num
    else:
        if num > maior:
            maior = num
        elif num < menor:
            menor = num
    op = str(input('Quer Continuar? [S/N] ')).strip().upper()[0]

# Verificação da opção
    while op not in'SsNn':
        print('Opção Inválidada. Por favor,', end=' ')
        op = str(input('Informe sua escolha [S/N]: ')).strip().upper()[0]

media = s / cont
print('Você digitou {} números e a media foi {:.2f}'.format(cont, media))
print('O maior valor foi {} e o menor foi {} '.format(maior, menor))
