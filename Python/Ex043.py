peso = float(input('Informe seu peso: (Kg) '))
altura = float(input('Informe sua altura: (m) '))
imc = peso / (pow(altura, 2))
print('O seu Índice de Massa Corporal (IMC) é : {:.1f}'.format(imc))
if imc < 18.5:
    print('Você está Abaixo do Peso !')
elif imc < 25:
    print('Parabéns, você está no Peso Ideal !')
elif imc < 30:
    print('Você está no Sobrepeso !')
elif imc < 40:
    print('Você está com Obesidade !')
else:
    print('Você está com Obesidade Mórbica, cuidado !')