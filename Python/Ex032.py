import datetime

ano = int(input('Qual ano deseja analizar ? Coloque 0 para analizar o ano atual: '))
v = 0

if ano != 0:
    if ano%4 == 0:
        if ano%100 != 0:
            print('O ano de {} é Bissexto'.format(ano))
            v = 1

    if ano%400 == 0:
        print('O ano de {} é Bissexto !'.format(ano))
        v = 1



if ano == 0:
    ano = datetime.datetime.today()
    ano = ano.year

    if ano%4 == 0:
        if ano%100 != 0:
            print('O ano de {} é Bissexto !'.format(ano))
            v = 1

    if ano%400 == 0:
        print('O ano de {} é Bissexto ! '.format(ano))
        v = 1

if v == 0:
    print('O ano de {} não é Bissexto !'.format(ano))