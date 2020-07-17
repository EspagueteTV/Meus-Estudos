metro = float(input('Digite um valor em metros: '))
cent = metro * 100
mili = metro * 1000
print('\033[34m=--\033[m'*20)
print('O valor em centímetros é {} cm'.format(cent))
print('O valor em milímetros é {} mm'.format(mili))
