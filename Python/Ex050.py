soma = 0
quant = 0
for c in range(0, 6):
    n = int(input('Digite o {} valor: '.format(c + 1)))
    if n % 2 == 0:
        soma = soma + n
        quant = quant + 1
print('Você informou {} números pares e a soma entre eles foi {} '.format(quant, soma))