exp = str(input('Digite a expressão: '))

aberto = exp.count('(')
fechado = exp.count(')')

if aberto == fechado:
    print('Sua expressão está válida')
else:
    print('Sua expressão está errada')