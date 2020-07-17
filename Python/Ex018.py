from math import radians, cos, sin, tan
ang = float(input('Informe um ângulo: '))
an = radians(ang)
print('O ângulo {} tem COSSENO de {:.2f}'.format(ang, cos(an)))
print('O ângulo {} tem SENO de{:.2f}'.format(ang, sin(an)))
print('O ângulo {} tem TANGENTE de {:.2f}'.format(ang, tan(an)))

