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


def resumo(p=0, taxaa=10, taxar=5):
    print('-' * 30)
    print('RESUMO Do VALOR'.center(30))
    print('-' * 30)
    print(f'Preço analisado: \t\t{moeda(p)}')
    print(f'Dobro do Preço: \t\t{dobro(p, True)}')
    print(f'Metade do Preço: \t\t{metade(p, True)}')
    print(f'Com {taxaa}% de aumento: \t{aumentar(p, taxaa, True)} ')
    print(f'Com {taxar}% de redução: \t{diminuir(p, taxar, True)}')
    print('-' * 30)