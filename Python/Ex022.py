nome = str(input('Digite seu nome completo: ')).strip()
print('\nAnalisando seu nome...')
print('Seu nome em maiúsculo é {}'.format(nome.upper()))
print('Seu nome em minúsculo é {}'.format(nome.lower()))
print('Seu nome tem ao todo {} letras'.format(len(nome) - nome.count(' ')))
lista = nome.split()
print('Seu primeiro nome é {} e ele tem {} letras'.format(lista[0].title(), len(lista[0])))

