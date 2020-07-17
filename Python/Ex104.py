def leiaInt(msg):
    while True:
        num = str(input(msg)).strip()

        if num.isnumeric():
            return int(num)
        else:
            print('\033[31m->> Erro! Digite um número Inteiro válido \033[m')


#Programa principal
n = leiaInt('Digite um número: ')
print('-=' * 20)
print(f'Você acabou de digitar o número {n}')