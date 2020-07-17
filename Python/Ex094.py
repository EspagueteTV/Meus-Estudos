#Declaração de variáveis
dado = dict()
pessoas = list()
cont = media = 0
mulheres = list()

while True:
#Leitura do nome, sexo e idade
    dado['nome'] = str(input('Informe o nome: ')).title()
    dado['sexo'] = str(input('Informe o sexo: (M/F): '))[0].upper()
    while dado['sexo'] not in 'FfMm':
        dado['sexo'] = str(input('Código errado. Informe o sexo: (M/F): '))[0].upper()
    if dado['sexo'] in 'Ff':
        mulheres.append(dado['nome'])
    dado['idade'] = int(input('Informe a idade: '))

#Armazenamento dos dados na lista
    pessoas.append(dado.copy())
    dado.clear()

# Loop de verificação
    op = str(input('Deseja continuar? (S/N): '))[0].upper()
    while op not in 'NnSs':
        print('Erro, código incorreto')
        op = str(input('Por favor, deseja continuar? (S/N): '))[0].upper()
    if op in 'nN':
        break

    print('-=' * 30)
# Saída dos Dados
print('-=' * 30)
print(pessoas)
print('-=' * 30)
print(f' A) Ao todo, foram cadastrados {len(pessoas)} pessoas')

# Media de Idade do grupo de pessoas
for c in range(0, len(pessoas)):
    media += pessoas[c]['idade']
med_grup = media / len(pessoas)
print(f' B) A média de idade do grupo foi: {med_grup:.2f} ')

# Nome das mulheres cadastradas
print(f' C) As mulheres cadastradas foram:  ', end='')
for c in range(0, len(pessoas)):
    if pessoas[c]['sexo'] in 'Ff':
        print(pessoas[c]['nome'], end=' ; ')
        cont += 1
if cont == 0:
    print('Nenhuma ')

#Pessoas acima da media de idade
print('\n D) Lista das pessoas que estão acima da média: ')
for c in range(0, len(pessoas)):
    if pessoas[c]['idade'] > med_grup:
        for k, v in pessoas[c].items():
            print(f'    {k} = {v};', end=' ')
        print()
print(' << VOLTE SEMPRE >>')





