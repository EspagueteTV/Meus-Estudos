serieA = ('Flamengo', 'Santos', 'Palmeiras', 'Grêmio', 'Athletico-PR', 'São Paulo', 'Internacional',
          'Corinthias', 'Fortaleza', 'Goiás', 'Bahia', 'Vasco', 'Atlético-MG', 'Fluminense',
          'Botafogo', 'Ceará', 'Cruzeiro', 'CSA', 'Chapecoense', 'Avaí')
print('-=' * 20)
print(f'Lista de times do Brasileirão: {serieA}')
print('-=' * 20)
print(f'Os 5 primeiros colocados são: {serieA[:5]}')
print('-=' * 20)
print(f'Os 4 últimos colocados são: {serieA[16:]}')
print('-=' * 20)
print(f'Os times em ordem alfabética: {sorted(serieA)}')
print('-=' * 20)
print('O time da Chapecoense está na {}ª posição'.format(serieA.index('Chapecoense') + 1))
