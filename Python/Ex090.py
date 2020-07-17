aluno = dict()

aluno['nome'] = str(input('Nome: '))
aluno['média'] = float(input(f'Media de {aluno["nome"]}: '))
if aluno['média'] >= 7:
    aluno['situacao'] = 'Aprovado'
elif aluno['média'] >= 5:
    aluno['situacao'] = 'Recuperação'
else:
    aluno['situacao'] = 'Reprovado'
print('-=' * 20)
for k, v in aluno.items():
    print(f' - {k} igual a {v}')