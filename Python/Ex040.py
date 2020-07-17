n1 = float(input('Informe a Primeira nota: '))
n2 = float(input('Informe a Segunda nota: '))
media = (n1 + n2) / 2
print('A média do aluno foi {:.2f}'.format(media))
if media < 5:
    print('O aluno está\033[1;31m REPROVADO\033[m !')
elif media < 7:
    print('O aluno está\033[1;33m RECUPERAÇÃO !')
else:
    print('O aluno está\033[1;32m APROVADO\033[m !')
