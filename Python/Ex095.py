dado = dict()
partidas = list()
galera = list()
cont = 0
# Leitura de dados de todos os jogadores
while True:

    print('-=' * 30)
#Leitura dos dados de cada jogador
    dado['nome'] = str(input('Nome do Jogador: ')).title()
    tot_part = int(input(f'Quantas partidas {dado["nome"]} jogou? '))
    for c in range(0, tot_part):
        partidas.append(int(input(f'    Quantos gols na {c + 1}ª partida: ')))
    dado['gols'] = partidas[:]
    partidas.clear()
    dado['total'] = sum(partidas)

# Adicionar os dados de cada jogador na lista 'Galera'
    galera.append(dado.copy())
    dado.clear()

#Verificação de finalização do loop
    while True:
        resp = str(input('Deseja continuar: [S/N] ')).upper()[0]
        if resp in 'NnSs':
            break
        else:
            print('ERRO! Resposta apenas S ou N')
    if resp in 'Nn':
        break
#Finalização da leitura de dados de todos os jogadores

# Saída dos dados
print('-=' * 50)
print(f'{"No.":<6}{"Nome":<15}{"Total":<4}{"Gols":>8}')
print('-' * 40)
for p in galera:
    print(f'{cont:<6}{p["nome"]:<15}{p["total"]:<4}     {p["gols"]}')
    cont += 1
print('-' * 40)

# INformações de cada jogador
op = -1
while op != 999:
    op = int(input('Mostrar opções de qual jogador? [999 para parar] '))
    if op != 999 and op < len(galera):
        print('-=' * 20)
        print(f' -- LEVANTAMENTO DO JOGADOR {galera[op]["nome"]}')
        for i, j in enumerate(galera[op]["gols"]):
            print(f'    No jogo {i + 1} fez {j} gols.')
    if op > (len(galera) - 1) and op != 999:
        print('Código Invalido')

