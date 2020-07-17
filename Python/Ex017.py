from math import hypot

C_opst = float(input('Digite o cateto oposto: '))
C_adj = float(input('Digite o cateto adjacente: '))
hip = hypot(C_opst, C_adj)
print('A hipotenusa vai medir {:.2f} '.format(hip))

