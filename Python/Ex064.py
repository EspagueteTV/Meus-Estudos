num = cont = s = 0
while num != 999:
    num = int(input('Digite um número [999 para parar]: '))
    if num != 999:
        s += num
        cont += 1
print('Você digitou {} números e a soma entre eles foi {}.'.format(cont, s))
