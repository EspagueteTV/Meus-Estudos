def fatorial(num, show=False):
    """
    - > Calcula o fatorial de um número
    :param num: Número a ser calculado
    :param show: (opcional) Mostra ou não a conta
    :return: O valor do fatorial de um número
    """
    from math import factorial
    if show:
        cont = num
        fat = 1
        while cont >= 1:
            if cont != 1:
                print(cont, end=' x ')
                fat *= cont
            else:
                print(cont, end=' = ')
            cont -= 1
    else:
        fat = factorial(num)

    return fat


# Programa Principal
print('-=' * 20)
print(fatorial(5, show=True))
