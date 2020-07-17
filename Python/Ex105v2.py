def notas(*n, sit=False):
    """
    -> Função para analizar notas e situações de vários alunos
    :param n: uma ou mais notas (aceita várias)
    :param sit: valor opcional, indicando se deve ou não adicionar situação
    :return: dicionário com várias informações sobre a situação da turma
    """

    r = dict()
    r['total'] = len(n)
    r['maior'] = max(n)
    r['menor'] = min(n)
    r['média'] = sum(n) / len(n)
    if sit:
        if r['média'] > 7:
            r['situação'] = 'BOM'
        elif r['média'] >= 5:
            r['situação'] = 'RAZOÁVEL'
        else:
            r['situação'] = 'RUIM'
    return r


#Programa Principal
resp = notas(5.5, 2.5, 1,5, sit=True)
print(resp)
help(notas)