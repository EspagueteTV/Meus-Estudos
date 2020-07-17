gols = list()
jogador = dict()
tot = 0
jogador['nome'] = str(input('Nome do jogador: '))
partidas = int(input('Quantas partidas jogou: '))

for c in range(0, partidas):
    gol = int(input(f' ->> Quntidade de gols na partida {c}: '))
    tot += gol
    gols.append(gol)
jogador['gols'] = gols
jogador['total'] = tot

# Mostrar os valores do campo nome, quant. gols e total de gols
print('-=' * 30)
for k, v in jogador.items():
    print(f'O campo {k} tem valor {v}')

#Mostrar a quantidade de partidas jogados, gol por partida e o total
print('-=' * 30)
print(f'O jogador {jogador["nome"]} jogou {partidas} partidas')
for i, j in enumerate(jogador['gols']):
    print(f' =>> Na partida {i}, fez {j} gols')
print(f'Foi um total de {jogador["total"]} gols. ')
