d = float(input('Informe a distâcia de sua viagem:  '))
print('Você vai fazer uma viagem de {:.2f} Km. '.format(d))
if d <= 200:
    print('É o preço de sua passagem será de R$ {:.2f}'.format(d * 0.50))
else:
    print('É o preço de sua passagem será de R$ {:.2f} '.format(d * 0.45))
