def linha():
    print('-' * 30)

def aumentar(preco=0, taxa=0, sit=False):
    """
    ->> Calcular o aumento de um valor
    :param preco: Valor a aumentar
    :param taxa:  Valor (porcentagem) do aumento
    :param sit:   Valor (opcional) informando se deve ou não realizar a formatação.
    :return: O valor aumentado conforme a taxa
    """
    res = preco + (preco * taxa/100)
    return res if sit is False else moeda(res)


def diminuir(preco=0, taxa=0, sit=False):
    res = preco - (preco * taxa/100)
    return res if sit is False else moeda(res)


def dobro(preco=0, sit=False):
    res = preco * 2
    return res if sit is False else moeda(res)


def metade(preco=0, sit=False):
    res = preco / 2
    return res if sit is False else moeda(res)


def moeda(preco=0, moeda='R$'):
    return f'{moeda}{preco:.2f}'.replace('.', ',')


def resumo(preco=0, taxa_a=0, taxa_r=0):
    linha()
    print(f'{"RESUMO DE VALOR":^30}')
    linha()
    print(f'{"Preço analisado: ":<18}{moeda(preco):>12}')
    print(f'{"Dobro do Preço: ":<18}{dobro(preco, True):>12}')
    print(f'{"Metade do Preço: ":<18}{metade(preco, True):>12}')
    print(f'{"20% de aumento":<18}{aumentar(preco, taxa_a, True):>12}')
    print(f'{"12% de redução":<18}{diminuir(preco, taxa_r, True):>12}')
    linha()