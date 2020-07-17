cont_pes = homens = mulheres_20 = 0
while True:
    print('-' * 20)
    print('CADASTRO DE UMA PESSOA')
    print('-' * 20)
    idade = int(input('Idade: '))
    sexo = ' '
    while sexo not in 'MF':
        sexo = str(input('Sexo: [M/F]')).strip().upper()[0]
    print('-' * 20)

    if idade > 18:
        cont_pes += 1
    if sexo == 'M':
        homens += 1
    if sexo == 'F' and idade < 20:
        mulheres_20 += 1

    op = ' '
    while op not in 'SsNn':
        op = str(input('Quer Continuar ? [S/N] ')).strip().upper()[0]
    if op == 'N':
        break

print('\n======= FIM DO PROGRAMA =======')
print(f'Há {cont_pes} pessoas maiores de 18 anos ')
print(f'Foram cadastrados {homens} homens')
print(f'Apenas {mulheres_20} mulheres têm menos de 20 anos')
