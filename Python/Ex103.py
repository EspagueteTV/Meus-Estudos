def ficha(jog='<desconhecido>', gol=0):
    """
    -> Mostrar o nome e quantidade de gols de um jogador
    :param n: Nome do jogador
    :param g: Quantidade de gols do jogador
    :return: sem retorno
    """

    print(f'O jogador {jog} fez {gol} gol(s) no campeonato')


#Programa Principal:
n = str(input('Nome do jogador: '))
g = str(input('Número de gols: '))
if g.isnumeric():
    g = int(g)
else:
    g = 0
if n.strip() == '':
    ficha(gol=g)
else:
    ficha(n, g)