salario = float(input('Informe o salário do funcionário? R$ '))
if salario <= 1250:
    novo = (salario * 0.15) + salario
else:
    novo = (salario * 0.10) + salario
print('Quem ganhava R${:.2f} passa a ganhar R${:.2f} agora !'.format(salario, novo))
