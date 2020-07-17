n1 = int(input('Primeiro número: '))
n2 = int(input('Segundo Número: '))
if n1 > n2:
    print('O \033[1;31mPrimeiro\033[m valor é maior.')
elif n2 > n1:
    print('O \033[1;31mSegundo\033[m valor é maior.')
elif n1 == n2:
    print('Não existe valor maior, os dois são \033[1;31mIguais\033[m.')
