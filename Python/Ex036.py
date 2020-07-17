casa = float(input('Digite o valor da casa: R$'))
salario = float(input('Informe o salário do comprador: R$'))
ano = int(input('Informe quantos anos para pagar: '))
parc = casa / (ano * 12)
media = salario * 0.3
print('-=-' * 20)
print('Para pagar uma casa de R$ {:.2f} em {} anos, a prestação será de R$ {:.2f} '.format(casa, ano, parc))
if parc > media:
    print('Empréstimo NEGADO !')
elif parc <= media:
    print('Empréstimo pode ser CONCEDIDO !')
