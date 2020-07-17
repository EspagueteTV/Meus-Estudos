def linha():
    print('-=' * 30)


def area(a, b):
    ar = a * b
    print(f'A área de um terreno {a:.2f} x {b:.2f} é de {ar:.2f}m² ')


#Função Main
linha()
print(' Controle de Terrenos')
linha()
larg = float(input('Largura (m): '))
comp = float(input('Comprimento (m): '))
area(larg, comp)
