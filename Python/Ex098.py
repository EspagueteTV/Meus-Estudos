from time import sleep


def linha():
    print('-=' * 30)


def contador(inicio, fim, passo):
    linha()
    if passo == 0:
        passo = 1

    if passo < 0:
        print(f'Contagem de {inicio} até {fim} de {passo * -1} em {passo * -1}')
        for c in range(inicio, fim, passo):
            print(c, end=' ')
            sleep(0.5)
        print(fim)
        print('Fim!')
    else:
        print(f'Contagem de {inicio} até {fim} de {passo} em {passo}')
        for c in range(inicio, fim, passo):
            print(c, end=' ')
            sleep(0.5)
        print(fim)
        print('Fim!')


#Função Principal
contador(1, 10, 1)
contador(10, 0, -2)
linha()
print('Agora é sua vez de personalizar a contagem: ')
linha()
i = int(input('Início: '))
f = int(input('Fim: '))
p = int(input('Passo: '))
contador(i, f, p)