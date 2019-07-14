arquivo = open('escrita.txt', 'w')

for valor in range(0, 11):
    linha = 'linha%s' %valor
    print('Escrevendo linha %s\n' % linha)
    arquivo.write(linha)