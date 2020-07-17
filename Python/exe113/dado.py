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


def leiaFloat(msg):
    while True:
        try:
            dado = float(input(msg))
        except KeyboardInterrupt:
            print('O usuário preferiu não informar os valores')
        except:
            print('\033[31mErro! Por favor informe um valor Real \033[m')
        else:
            return dado