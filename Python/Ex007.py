n1 = float(input('Digite a nota 01: '))
n2 = float(input('Digite a nota 02: '))
media = (n1+n2)/2
print(20 * '{}=--{}'.format('\033[35m', '\033[m'))
print('A média do aluno foi: {:.1f}'.format(media))