def leiaDinheiro(msg):
    while True:
        num = str(input(msg)).replace(',', '.').strip()

        if num.isalpha():
            print(f'\033[31m Erro: \"{num}\" é um preço inválido \033[m')

        else:
            return float(num)


def leiaInt(msg):
    while True:
        num = str(input(msg)).strip()

        if num.isnumeric():
            return int(num)
        else:
            print('\033[31m->> Erro! Digite um número Inteiro válido \033[m')


