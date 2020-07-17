from random import randint
from time import sleep

print('\033[34m-=--\033[m' * 20)
print('Estou pensando em um número entre 0 e 5.')
print('Você será capaz de me vencer ?')
print('\033[34m-=--\033[m' * 20)
num = randint(0, 5)     #Faz o computador "PENSAR"
esc = int(input('Em que número estou pensando: '))  #Escolha do usuario
print('\033[31mPROCESSANDO...\033[m')
sleep(2)
if esc == num:
    print('Parabéns você conseguiu me vencer escolhendo o número {} !!'.format(num))
else:
    print('Você foi derrotado escolhendo o número {} ! Eu pensei no número {}'.format(esc, num))
