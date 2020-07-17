from exe115.bibliotecas import Utilidade
from exe115.bibliotecas.Arquivo import *
from time import sleep

grupo = list()


arq = 'sistemaex115.txt'
if not arquivoExiste(arq):
    criarArquivo(arq)


while True:
    op = Utilidade.menu(['Ver pessoas cadastradas', 'Cadastrar nova pessoa', 'Sair do Sistema'])

    if op == 1:
        Utilidade.opcoes(f'Pessoas cadastradas')
        lerArquivo(arq)
    elif op == 2:
        Utilidade.opcoes(f'CADASTRO DE PESSOA')
        nome = str(input('Nome: '))
        idade = Utilidade.leiaInt('Idade: ')
        cadastrar(arq, nome, idade)


    elif op == 3:
        Utilidade.opcoes(f'Saindo do Sistema... Até Logo!')
        break
    else:
        print('\033[31mErro, por favor, digite uma opção válida \033[m')
    sleep(2)