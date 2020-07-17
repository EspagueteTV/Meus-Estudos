from datetime import date


def voto(ano):
    idade = date.today().year - ano

    if idade < 16:
        return f'Com {idade} anos: Não Vota'
    if idade < 18 or idade >= 65:
        return f'Com {idade} anos: Voto Opcional'
    else:
        return f'Com {idade} anos: Voto Obrigatório'


#Função Principal
print('-=' * 20)
ano_nasc = int(input('Em que ano você nasceu: '))
print(voto(ano_nasc))
