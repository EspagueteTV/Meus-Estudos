def leiaInt(msg):
    while True:
        try:
            n = int(input(msg))
        except(ValueError, TypeError):
            print('\033[31mErro, por favor, digite um valor inteiro válido\033[m')
            continue
        except KeyboardInterrupt:
            print('\nEntrada de dados interrompido pelo usuário')
            return 0
        else:
            return n


def leiaFloat(msg):
    while True:
        try:
            n = float(input(msg))
        except (TypeError, ValueError):
            print('\033[31mErro, por favor, informe um valor real válido \033[m')
            continue
        except KeyboardInterrupt:
            print('\033[31m o usuário preferiu não informar esse dado')
            return 0
            break
        else:
            return n


n1 = leiaInt('Digite um valor: ')
n2 = leiaFloat('Digite um Real: ')
print(f'O valor inteiro digitado foi {n1} e o real foi {n2}.')
