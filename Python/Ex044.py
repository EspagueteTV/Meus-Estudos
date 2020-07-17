print('========= LOJAS SIQUEIRA ========')

preco = float(input('Informe o valor das compras: R$ '))
print('''---->> CONDIÇÕES DE PAGAMENTO
    [ 1 ] À vista dinheiro / cheque
    [ 2 ] Á vista no cartão
    [ 3 ] Em 2x no cartão
    [ 4 ] 3x ou mais no cartão ''')
op = int(input('-->> Informe sua opção de pagamento: '))

if op == 1:
    desc = preco - (preco * 0.1)
    print('O valor final do produto à vista (dinheiro ou cheque) com 10% de desconto será \033[31mR$ {:.2f}\033[m '.format(desc))
elif op == 2:
    desc = preco - (preco * 0.05)
    print('O valor final do produto à vista (cartão) com 5% de desconto será \033[31mR$ {:.2f}\033[m '.format(desc))
elif op == 3:
    parc = preco / 2
    print('O valor final do produto em 2x sem juros será \033[31mR$ {:.2f}\033[m'.format(parc))
elif op == 4:
    vez = int(input('Em quantas parcelas: '))
    juros = preco + (preco * 0.2)
    parc = juros / vez
    print('Sua compra será parcelada em {}x de \033[31mR$ {:.2f}\033[m COM JUROS'.format(vez, parc))
    print('Sua compra de R$ {} vai custar R$ {:.2f} no final. '.format(preco, juros))
else:
    print('Opção Inválida. Tente novamente...')











