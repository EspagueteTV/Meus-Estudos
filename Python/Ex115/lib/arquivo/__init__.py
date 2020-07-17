from Ex115.lib.interface import *


# Verificar se o arquivo existe
def arquivoExiste(nome):
    try:
        a = open(nome, 'rt')
        a.close()
    except FileNotFoundError:
        return False
    else:
        return True


# Criar um arquivo novo
def criarArquivo(nome):
    try:
        a = open(nome, 'wt+')       # W = write; T = text; + = Se não existir crie
        a.close()
    except:
        print('Houve um erro na criação do arquivo')
    else:
        print(f'Arquivo {nome} criado com sucesso')


# Fazer a leitura de um aruivo
def lerArquivo(nome):
    try:
        a = open(nome, 'rt')    #Abrir o arquivo
    except:
        print('Erro ao ler arquivo')
    else:
        cabecalho('PESSOAS CADASTRADAS')
        for linha in a:
            dado = linha.split(';')         #Split dividir os dados
            dado[1] = dado[1].replace('\n', '')
            print(f'{dado[0]:<30}{dado[1]:>3} anos')
    finally:
        a.close()


def cadastrar(arq, nome='desconhecido', idade=0):
    try:
        a = open(arq, 'at')         # A = append; t = text
    except:
        print('Houve um erro na abertura do arquivo')
    else:
        try:
            a.write(f'{nome};{idade}\n')
        except:
            print('Houve um erro na hora de escrever os dados')
        else:
            print(f'Novo registro de {nome} adicionado')
            a.close()

