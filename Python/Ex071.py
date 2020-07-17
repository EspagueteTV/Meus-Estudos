lista = ['50', '20', '10', '1']
print('==' * 20)
print('{:^30}'.format('Banco GCS'))
print('==' * 20)
result = valor = int(input('Qual valor deseja sacar: R$'))
cont = 0
while True:
    if cont == 0:
        quant = result // 50
        if quant != 0:
            result = result - (50 * quant)
    if cont == 1:
        quant = result // 20
        if quant != 0:
            result = result - (20 * quant)
    if cont == 2:
        quant = result // 10
        if quant != 0:
            result = result - (10 * quant)
    if cont == 3:
        quant = result // 1
        if quant != 0:
            result = result - quant
    if quant != 0:
        print(f'Total de {quant} cédulas de R${lista[cont]}')
    cont += 1
    if result == 0:
        break
print('==' * 20)
print('Volte sempre ao BANCO GCS! Tenha um bom dia!')
