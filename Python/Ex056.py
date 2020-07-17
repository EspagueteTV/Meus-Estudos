media = 0           #Média de idade do grupo
cont_m = 0          #Mulheres com menos de 20 anos
cont_h = 0          #Se o contador de homem for igual a 0
velho_id = 0        #Inicia a idade do homem masi velho
velho = ''          #Nome do homem mais velho

for cont in range(0, 4):
    print('\n---- {}ª Pessoa ----'.format(cont + 1))
    nome = str(input('Informe o nome: ')).strip()
    idade = int(input('Informe a idade: '))
    sexo = str(input('Informe o sexo (M/F): ')).upper()

    media = media + idade

    if sexo[0] == 'M':
        if cont_h == 0:
            velho = nome
            velho_id = idade
            cont_h = cont_h + 1

        if idade > velho_id:
            velho = nome
            velho_id = idade

    if sexo[0] == 'F':
        if idade < 20:
            cont_m = cont_m + 1


print('\nA média de idade do Grupo foi {} anos!'.format(media / 4))
print('O homem mais velho é o {} com {} anos !'.format(velho, velho_id))
print('Ao todo são {} mulheres menores de 20 anos. '.format(cont_m))
