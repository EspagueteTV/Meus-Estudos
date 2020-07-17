def arquivoExiste(nome):
    try:
        a = open(nome, 'rt')
        a.close()
    except FileNotFoundError:
        return False
    else:
        return True

def criarArquivo(nome):
    try:
        a = open(nome, 'wt+')   # + = Se não existir crie
        a.close()
    except:
        print('Houve um problema ao criar o arquivo')
    else:
        print(f'Arquivo {nome} criado com sucesso')


def lerArquivo(nome):
    try:
        a = open(nome, 'rt')
    except:
        print(f'Houve um erro ao ler o arquivo {nome}')
    else:
        for linha in a:
            dado = linha.split(';')
            dado[1] = dado[1].replace(';', '')
            print(f'{dado[0]:<30}{dado[1]:>3} anos')
    finally:
        a.close()


def cadastrar(arq, nome, idade):
    try:
        a = open(arq, 'at')
    except:
        print('Houve erro na abertura do arquivo')
    else:
        try:
            a.write(f'{nome}; {idade}')
        except:
            print('Houve erro na hora da leitura dos dados')
        else:
            print(f'Novo registro de {nome} adicionado com sucesso!')
            a.close()


