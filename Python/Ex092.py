from datetime import date
dado = dict()
dado['pessoas'] = str(input('Nome: '))
an_nasc = int(input('Ano de nascimento: '))
an_atual = date.today().year
dado['idade'] = an_atual - an_nasc
dado['ctps'] = int(input('Carteira de Trabalho (0 não tem) '))

if dado['ctps'] != 0:
    dado['contratação'] = int(input('Ano de Contratação: '))
    dado['salario'] = float(input('Salário: '))
    dado['aposentadoria'] = dado['idade'] + (35 - (an_atual - dado['contratação']))

print('-=' * 20)
for k, v in dado.items():
    print(f' - {k} tem o valor {v} ')