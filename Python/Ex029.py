v = float(input('Digite a sua velocidade em Km/h: '))
if v > 80:
    p = (v - 80)*7
    print('MULTADO! Você excedeu o limite permitido que é 80Km/h !')
    print('A sua multa vai ficar R$ {:.2f}'.format(p))
print('Tenha um bom dia ! Dirija com segurança !')
