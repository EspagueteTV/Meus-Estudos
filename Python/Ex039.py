import datetime
ano_atual = datetime.datetime.today().year
sexo = str(input('Informe seu sexo, (F) para Feminino e (M) para Masculino: ')).upper()
ano_nasc = int(input('Informe o Ano de Nascimento: '))
idade = ano_atual - ano_nasc
print('Quem nasceu em {} tem {} anos em {}'.format(ano_nasc, idade, ano_atual))

if sexo[0] == 'M':
    if idade < 18:
        falta = 18 - idade
        print('Ainda falta {} anos para o alistamento'.format(falta))
        print('Seu alistamento será em {} '.format(ano_atual + falta))
    elif idade == 18:
        print('Você tem que se alistar IMEDIATAMENTE !')
    elif idade > 18:
        pas = idade - 18
        print('Você já deveria ter se alistado há {} anos.'.format(pas))
        print('Seu alistamento foi em {}'.format(ano_atual - pas))

if sexo[0] == 'F':
    print('Para você no Brasil, o alistamento não é Obrigatório.')
