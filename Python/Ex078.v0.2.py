lista = []
mai = men = 0

for c in range(0, 5):
    lista.append(int(input("Digite um número:  ")))
    if c == 0:
        mai = men = lista[c]
    else:
        if lista[c] > mai:
            mai = lista[c]
        if lista[c] < men:
            men = lista[c]

print(lista)
print(mai, men)


print(f"O maior valor digitado foi {mai} nas posições: ")
for i, v in enumerate(lista):
    if lista[i] == mai:
        print(i, end='')

print(f'\nO menor valor digitado foi {men} nas posições: ')
for i, v in enumerate(lista):
    if lista[i] == men:
        print(i, end='')

