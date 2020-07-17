from random import randint
from time import sleep
itens = ('Pedra', 'Papel', 'Tesoura')
print('''--->>Suas opções:
[ 0 ] PEDRA
[ 1 ] PAPEL
[ 2 ] TESOURA''')
comp = randint(0, 2)
jog = int(input('Qual é a sua jogada? '))
print('JO')
sleep(1)
print('KEN')
sleep(1)
print('PO !!!')
sleep(1)

if (comp == 0 and jog == 1) or (comp == 1 and jog == 0):      #VERIFICAR SE QUEM GANHA JOGOU PAPEL
    if comp == 1:
        venc = 'COMPUTADOR'
    else:
        venc = 'JOGADOR'

elif (comp == 0 and jog == 2) or (comp == 2 and jog == 0):
    if comp == 0:
        venc = 'COMPUTADOR'
    else:
        venc = 'JOGADOR'

elif (comp == 1 and jog == 2) or (comp == 2 and jog == 1):
    if comp == 2:
        venc = 'COMPUTADOR'
    else:
        venc = 'JOGADOR'
else:
    venc = 'EMPATE'

if comp == 0:
    comp = 'PEDRA'
elif comp == 1:
    comp = 'PAPEL'
else:
    comp = 'TESOURA'

if jog == 0:
    jog = 'PEDRA'
elif jog == 1:
    jog = 'PAPEL'
else:
    jog = 'TESOURA'

print('\033[31m-=' * 20)
print('Computador jogou {}'.format(comp))
print('Jogador jogou {}'.format(jog))
print('-=' * 20, '\033[m')


if venc != 'EMPATE':
    print('O vencedor {}'.format(venc))
else:
    print('Houve empate')