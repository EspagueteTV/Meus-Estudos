np1 = ('zero', 'um', 'dois', 'três', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove', 'dez')
np2 = ('onze', 'doze', 'treze', 'catorze', 'quinze', 'dezesseis', 'dezessete', 'dezoito', 'dezenove', 'vinte')
npf = np1 + np2
while True:
    opc = int(input('Informe um número entre 0 e 20: '))
    if opc >= 0 and opc <= 20:
        break
    else:
        print('Tente Novamente.', end=' ')
print(f'Você digitou o número \033[31m{npf[opc]}\033[m.')



