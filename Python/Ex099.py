from time import sleep

def maior(*num):
    mai = 0
    print('-=' * 30)
    print('Analizando os valores passados...')
    for c in range(0, len(num)):
        print(num[c], end=' ')
        sleep(0.3)
        if c == 0:
            mai = num[c]
        if num[c] > mai:
            mai = num[c]
    print(f'\nForam informados {len(num)} valores ao todo')
    print(f'O maior valor informado foi {mai}.')


#Função Main
maior(2, 9, 4, 5, 7, 1)
maior(4, 7, 0)
maior(1, 2)
maior(6)
maior( )
