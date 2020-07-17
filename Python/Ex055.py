for cont in range(0, 5):
    peso = float(input('Peso da {}ª pessoa: '.format(cont + 1)))
    if cont == 0:
        maior = peso
        menor = peso

    else:
        if peso > maior:
            maior = peso

        if peso < menor:
            menor = peso
print('O maior peso lido foi {:.1f}Kg'.format(maior))
print('O menor peso lido foi {:.1f}Kg'.format(menor))
