notas =[7.0, 8.5, 8.4, 3.0]
print('Lista completa:{}'.format(notas))
print('Acesando primeiro indice: {}'.format(notas[0]))
print('Acessando o ultimo indice: {}'.format(notas[-1]))

print('operações com lista: {}'.format(notas))
notas.append(9.2) #Adicionando elemento a lista
print('Nova nota adicionada: {}'.format(notas[-1]))
print(notas)
print('Removendo  o valor 3.0 da lista')
notas.remove(3.0) #Removendo elemento da lista.
print(notas)
print('Inserindo um novo valor na lista {}'.format(8.5))
notas.insert(3, 8.5)
print(notas)

notas[0] = 9.8 #Alterando o valor do indice 0
print(notas)

print('')
print('Funções utilizadas em listas')
print('Tamanho da lista: {}'.format(len(notas)))
print('Quantidade de elementos 8.5 estão na lista: {}'.format(notas.count(8.5)))
