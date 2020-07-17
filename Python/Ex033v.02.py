a = int(input('Primeiro valor: '))
b = int(input('Segundo valor: '))
c = int(input('Terceiro valor: '))
# Verificar quem é o menor
menor = a
if a > b and c > b:
    menor = b
if a > c and b > c:
    menor = c
print('O menor valor digitado foi {}'.format(menor))

#Verificar quem é o maior

maior = a
if a < b and c < b:
    maior = b
if a < c and b < c:
    maior = c
print('O maior valor digitado foi {}'.format(maior))