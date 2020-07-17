from random import randint
from operator import itemgetter
from time import sleep

ranking = dict()
jogos = {'jogador1': randint(0, 6),
         'jogador2': randint(0, 6),
         'jogador3': randint(0, 6),
         'jogador4': randint(0, 6)
         }
print('Valores sorteados: ')
for k, v in jogos.items():
    print(f'O {k} tirou {v} no dado')
    sleep(1)
ranking = sorted(jogos.items(), key=itemgetter(1), reverse=True)


print('-=' * 20)
print('=== RANKING DOS JOGADORES ===')
for c in range(0, 4):
    print(f' -> {c +1}º lugar:  {ranking[c][0]} com {ranking[c][1]}')