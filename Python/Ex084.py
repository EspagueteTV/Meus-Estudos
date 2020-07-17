dado = list()
dado1 = list()
todos = list()
maior = menor = 0
op = 'o'

while op != 'N':
    dado.append(str(input('Nome: ')))
    dado.append(float(input('Peso: ')))
    todos.append(dado[:])
    dado.clear()

    op = '1'
    while op not in 'SsNN':
        op = str(input('Deseja continuar: (S/N) ')).upper()[0]

print('-=' * 20)
print(f'Foram cadastrados {len(todos)} pessoas')

for c in range(0, len(todos)):
    if c == 0:
        maior = menor = todos[c][1]
    if todos[c][1] > maior:
        maior = todos[c][1]
    if todos[c][1] < menor:
        menor = todos[c][1]

for c in range(0, len(todos)):
    if todos[c][1] == maior:
        dado.append(todos[c][0])
    if todos[c][1] == menor:
        dado1.append(todos[c][0])

todos.append(dado[:])
todos.append(dado1[:])


print(f'O maior peso foi {maior} de {todos[-2]}')
print(f'O menor peso foi {menor} de {todos[-1]}')




