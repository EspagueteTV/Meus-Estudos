def notas(*num, sit=False):
    """
    -> Função para analizar as notas e situação dos alunos
    :param num: Recebe as notas dos alunos
    :param sit: (opcional) mostrar a situação dos alunos
    :return: Um dicionário com as informações dos alunos
    """
    aluno = dict()
    aluno['total'] = len(num)

# Verificar a maior e menor nota, media
    mai = men = 0
    for c in range(0, len(num)):
        if c == 0:
            mai = men = num[0]
        if num[c] > mai:
            mai = num[c]
        if num[c] < men:
            men = num[c]
    aluno['maior'] = mai
    aluno['menor'] = men
    aluno['media'] = sum(num) / len(num)

#Verificar situação
    if sit:
        if aluno['media'] < 5:
            aluno['situação'] = 'Ruim'
        elif aluno['media'] < 7:
            aluno['situação'] = 'Razoável'
        elif aluno['media'] < 9:
            aluno['situação'] = 'Bom'
        else:
            aluno['situação'] = 'Ótimo'
    return aluno


# Programa principal
resp = notas(5.5, 2.5, 9, 8.5, sit=True)
print(resp)
