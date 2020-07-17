a = float(input('Primeiro Segmento: '))
b = float(input('Segundo Segmento: '))
c = float(input('Terceiro Segmento: '))

if a < b + c and b < a + c and c < a + b:
    print('Os segmentos PODEM Formar um Triângulo !')

    if a == b and b == c:
        print('Será formado um Triângulo do tipo EQUILÁTERO !')
    elif (a != b and b == c) or (a == c and b != c) or (a == b and a != c):
        print('Será formado um Triângulo do tipo ISÓSCELES !')
    else:
        print('Será formado um Triângulo do tipo ESCALENO !')

else:
    print('Os segmentos NÃO PODEM Formar um Triângulo !')
