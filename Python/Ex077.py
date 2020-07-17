palavras = ('APRENDER', 'PROGRAMAR', 'LINGUAGENS', 'PYTHON', 'CURSO', 'GRATIS', 'ESTUDAR', 'PRATICAR',
            'TRABALHAR', 'MERCADO', 'PROGRAMADOR', 'FUTURO')

for cont in range(0, len(palavras)):
    p = palavras[cont]
    print(f'\nNa palavra {palavras[cont]} temos as vogais: ', end='')

    for i in range(0, len(p)):
        if p[i] in 'AEIOU':
            print(p[i], end=' ')
