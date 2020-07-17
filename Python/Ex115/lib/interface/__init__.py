def linha(tam=42):
    return '-' * tam


def cabecalho(txt):
    print(linha())
    print(txt.center(42))
    print(linha())


def menu(lista):
    cabecalho('MENU PRINCIPAL')
    c = 1
    for item in lista:
        print(f'\033[33m{c}\033[m - \033[34m{item}\033[m')
        c += 1
    print(linha())
    op = leiaInt('\033[32mSua Opção: \033[m')
    return op

def leiaInt(msg):
    while True:
        try:
            dado = int(input(msg))
        except KeyboardInterrupt:
            print('O usuário preferiu não informar os valores')
        except:
            print('\033[31mErro! Por favor informe um valor Inteiro \033[m')
        else:
            return dado
