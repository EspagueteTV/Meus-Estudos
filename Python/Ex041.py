from datetime import date

ano = date.today().year
nasc = int(input('Informe o seu ano de nascimento: '))
idade = ano - nasc
print('Quem nasceu em {} durante o ano de {} tem {} anos de idade.'.format(nasc, ano, idade))
if idade <= 9:
    print('Categoria MIRIM')
elif idade <=14:
    print('Categoria INFANTIL')
elif idade <= 19:
    print('Categoria JUNIOR')
elif idade <= 25:
    print('Categoria SÊNIOR')
elif idade > 25:
    print('Categoria MASTER')
