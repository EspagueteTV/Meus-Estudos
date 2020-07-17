dados = list()
alunos = list()
tot = 0
while True:
    dados.append(str(input('Nome: ')))
    dados.append(float(input('Nota 01: ')))
    dados.append(float(input('Nota 02: ')))
    tot += 1
    alunos.append(dados[:])
    dados.clear()

    op = '0'
    while op not in 'SsNn':
        op = str(input('Deseja continuar? (S/N) '))[0].upper()
    if op == 'N':
        break
print('-=' * 30)
print(f'No  NOME MÉDIA')
print('-' * 30)
for c in range(0, tot):
    media = (alunos[c][1] + alunos[c][2]) / 2
    print(f'{c:^3} {alunos[c][0]:<}    {media:^.1f}')
print('-' * 30)
op = 1
while op != 999:
    op = int(input('Mostrar notas de qual aluno? (999 interrompe): '))
    if op != 999:
        print(f'Notas de {alunos[op][0]} são {alunos[op][1:]}')
        print('-' * 30)
print('<<< VOLTE SEMPRE >>>')