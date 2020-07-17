from datetime import date
ano = date.today().year
maior = 0
menor = 0
for cont in range(0, 7):
    nasc = int(input('Em que ano nasceu a {}ª pessoa: '.format(cont+1)))
    idade = ano - nasc
    if idade >= 21:
        maior = maior + 1
    else:
        menor = menor + 1
print('Ao todo tivemos {} pessoas maiores de idade'.format(maior))
print('E também tivemos {} pessoas menores de idade'.format(menor))
