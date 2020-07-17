valores = []        #Variável para armazenar os valores digitados pelo usuário

for c in range(0, 5):
    valores.append(int(input(f'Digite um valor para a posição {c}: ')))

print(f'Você digitou os valores {valores}')
print(f'O maior valor digitado pelo usuário foi {max(valores)} na posição {valores.index(max(valores))} ')
print(f'O menor valor digitado foi {min(valores)} na posições {valores.index(min(valores))} ')
