print('==' * 20)
print('\t10 TERMOS DE UMA PA')
print('==' * 20)

PA = int(input('Informe o PRIMEIRO termo: '))
r = int(input('Informe a RAZÃO: '))
for c in range(0, 10):
    print('{}'.format(PA), end=' -> ')
    PA = PA + r
print('ACABOU')
