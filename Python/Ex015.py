dia = int(input('Quantos dias utilizou o carro: '))
km = float(input('Quantos Km foram rodados: '))
preco = ((dia * 60) + (km * 0.15))
print('O carro foi utilizado por {} dias e rodado {:.2f}Km, seu preço total a pagar foi de R$ {:.2f}'.format(dia, km, preco))
