print('-=' * 20)
print('Termos de uma PA')
print('-=' * 20)
ter = pa = int(input('Primeiro Termo: '))
r = int(input('Razão: '))
v = 10
cont = 0
cont_t = 0
while v != 0:
    while cont < v:
        print('{}'.format(ter), end=' -> ')
        ter = ter + r
        cont += 1
        cont_t += 1
    v = int(input('PAUSA \nQuantos termos você quer mostrar a mais ?'))
    cont = 0
print('Progressão finalizada com {} termos mostrados'.format(cont_t))
