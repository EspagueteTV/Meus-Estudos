sexo = str(input('Informe seu sexo: [M/F] ')).upper().strip()[0]
while sexo not in 'MmFf':
    print('Dados Inválidos. Por favor,', end='')
    sexo = str(input(' Informe um sexo: (M/F): ')).upper().strip()[0]
print('Sexo {} registrado com sucesso '.format(sexo))
